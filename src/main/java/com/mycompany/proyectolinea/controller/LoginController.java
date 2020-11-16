/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolinea.controller;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author usuario
 */
@Named(value = "loginController")
@RequestScoped
public class LoginController {
String username;
String password;
    /**
     * Creates a new instance of LoginController
     */
    public LoginController() {
    }
    public void Login(){
        System.out.println("Entro " + username + " " + password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
