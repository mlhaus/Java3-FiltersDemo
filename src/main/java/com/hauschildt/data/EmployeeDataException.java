/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt.data;

public class EmployeeDataException extends Exception {

    /**
     * Creates a new instance of <code>EmployeeDataException</code> without detail
     * message.
     */
    public EmployeeDataException() {
    }

    /**
     * Constructs an instance of <code>EmployeeDataException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmployeeDataException(String msg) {
        super(msg);
    }

    public EmployeeDataException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public EmployeeDataException(Throwable cause) {
        super(cause);
    }

    public EmployeeDataException(String msg, Throwable cause
            , boolean enableSuppression, boolean writableStackTrace) {
        super(msg, cause, enableSuppression, writableStackTrace);
    }

}
