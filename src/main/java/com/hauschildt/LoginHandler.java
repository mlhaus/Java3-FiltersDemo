/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt;

import com.hauschildt.data.Employee;
import com.hauschildt.data.EmployeeDAO;
import com.hauschildt.data.EmployeeDAOFactory;
import com.hauschildt.data.EmployeeDataException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author marchauschildt
 */
public class LoginHandler extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String task = request.getParameter("task");
        if (task != null && task.equals("logout")) {
            session.removeAttribute("employee");
            response.sendRedirect("login");
            return;
        }
        if (session.getAttribute("employee") != null) {
            response.sendRedirect("employees");
            return;
        }
        request.setAttribute("loginFailed", false);
        request.getRequestDispatcher("/WEB-INF/jsp/view/login.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("username");
        String userPassword = request.getParameter("password");
        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO(getServletContext());
        
        try {
            Employee employee = dao.getEmployeeByLogin(userName, userPassword);
            if (employee == null) {
                request.setAttribute("loginFailed", true);
                request.getRequestDispatcher("/WEB-INF/jsp/view/login.jsp").forward(request, response);
                
            } else {
                request.getSession().setAttribute("employee", employee);
                request.changeSessionId();
                response.sendRedirect("employees");
            }
        } catch(EmployeeDataException e) {
            request.setAttribute("loginFailed", true);
            request.getRequestDispatcher("/WEB-INF/jsp/view/login.jsp").forward(request, response);
        }
    }

}
