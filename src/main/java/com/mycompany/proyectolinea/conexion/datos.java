/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolinea.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
@Named(value = "datosController")
@RequestScoped
public class datos {
       Connection conect = null;
       Statement st;
    public void cargarDatosComprador() throws SQLException, ClassNotFoundException{
         Class.forName("com.mysql.jdbc.Driver");
         conect = DriverManager.getConnection("jdbc:mysql://localhost/proyectolinea","root","");
         st = conect.createStatement();
          String query= "INSERT INTO comprador(username, password) VALUES ('Johan','012')";
          st.executeUpdate(query);
          System.out.println("Usuario ingresado");
    }
    
}

