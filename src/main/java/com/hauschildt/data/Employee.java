/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt.data;

import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable{
   
    private static final long serialVersionUID = 1L;
    
    private String login;
    private String password;
    private String name;
    private ArrayList<String> roles;

    public Employee() {
        this.login = "";
        this.password = "";
        this.name = "";
        this.roles = new ArrayList<>();
    }
    
    public Employee(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.roles = new ArrayList<>();
    }
    
    public void addRole(String role){
        roles.add(role);
    }
    
    public boolean hasRole(String role){
//        boolean found = false;
//        if(roles.contains(role)){
//            found = true;
//        }
//        for (String role1 : roles) {
//            if(role.equals(role1)){
//                found = true;
//                break;
//            }
//        }
//        return found;
        return roles.contains(role);
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public ArrayList<String> getRoles() {
        return roles;
    }
    
    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Employee{" + "login=" + login + ", password=" + password + ", name=" + name + ", roles=" + roles + '}';
    }
    
    
}
