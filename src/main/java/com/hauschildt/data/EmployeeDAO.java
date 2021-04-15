/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt.data;

import javax.servlet.ServletContext;

public interface EmployeeDAO {
    /**
     * Returns the Employee record associated with the login and password or 
     * null if there is no such employee.
     *
     * @param login the Employee's username
     * @param password the Employee's password
     * @return the associated Employee or null if not found
     * @throws EmployeeDataException
     */
    Employee getEmployeeByLogin(String login, String password) throws EmployeeDataException;


}

