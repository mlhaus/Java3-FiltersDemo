/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.servlet.ServletContext;

public class EmployeeDAOCSV implements EmployeeDAO {
    private static final String FILE_PATH = "WEB-INF/assets/";
    private static final String FILE_NAME = "employees.csv";
    private static List<Employee> employees;
    private static ServletContext servletContext;
    
    public EmployeeDAOCSV(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    private void readFromFile() throws EmployeeDataException {
        if(employees == null) {
            try(Scanner in = new Scanner(new File(servletContext.getRealPath(FILE_PATH + FILE_NAME)))){
                employees = new ArrayList<>();
                String line;
                String[] fields;
                String login;
                String password;
                String name;
                while(in.hasNextLine()){
                    line = in.nextLine();
                    fields = line.split(",");
                    login = fields[0];
                    password = fields[1];
                    name = fields[2];
                    Employee employee = new Employee(login, password, name);
                    if(fields.length >= 4) {
                        employee.addRole(fields[3]);
                    }
                    if(fields.length >= 5) {
                        employee.addRole(fields[4]);
                    }
                    employees.add(employee);
                }
            } catch(FileNotFoundException fnfe){
                throw new EmployeeDataException(fnfe);
            }
        }
    }

    @Override
    public Employee getEmployeeByLogin(String login, String password) throws EmployeeDataException{
        Employee employee = null;
        readFromFile();
        for (Employee e : employees) {
            if(e.getLogin().equals(login) && e.getPassword().equals(password)){
                employee = e;
                break;
            }
        }
        return employee;
    }

}
