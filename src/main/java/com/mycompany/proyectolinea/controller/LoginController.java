/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolinea.controller;

import com.mycompany.proyectolinea.servic.Loginservice;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author usuario
 */
@Named(value = "loginController")
@RequestScoped
public class LoginController {
String correo;
String password;
    /**
     * Creates a new instance of LoginController
     */
    public LoginController() {
    }
    public void Login(){
        System.out.println("Entro " + correo + " " + password);
        Loginservice service = new Loginservice();
        service.VerDatosComprador(correo,password);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
