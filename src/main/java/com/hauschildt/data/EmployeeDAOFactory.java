/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt.data;

import javax.servlet.ServletContext;

public class EmployeeDAOFactory {
    private static final String DAO_SOURCE = "CSV";

    public static EmployeeDAO getEmployeeDAO(ServletContext servletContext){
        EmployeeDAO dao = null;
        switch(DAO_SOURCE){
            case "CSV":
                dao = new EmployeeDAOCSV(servletContext);
                break;
            case "XML":
                break;
            case "MYSQL":
                break;
            default:
        }
        return dao;
    }

}
