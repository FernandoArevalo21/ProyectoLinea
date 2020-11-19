/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolinea.controller;

import com.mycompany.proyectolinea.pojo.datos;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author usuario
 */
@Named(value = "registroController")
@RequestScoped
public class RegistroController {

   private String nombre;
   private String apellido;
   private String correo;
   private String username;
   private String password;
    /**
     * Creates a new instance of RegistroController
     */
    public RegistroController() {
       
    }
    public void registro(){
         System.out.println(nombre+""+apellido+""+correo+""+username+""+password);
         datos dt= new datos();
         dt.cargarDatosComprador(nombre, apellido,correo,username,password);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
