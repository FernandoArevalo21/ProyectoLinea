/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolinea.conexion;

import com.mycompany.proyectolinea.controller.RegistroController;
import com.mycompany.proyectolinea.pojo.Registro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

//@Named(value = "datosController")
//@RequestScoped
public class datos {
       Connection conect = null;
       Statement st;
    public  void  cargarDatosComprador(String nombre,String apellido, String correo, String username, String password) throws SQLException, ClassNotFoundException{
       Class.forName("com.mysql.jdbc.Driver");
         conect = DriverManager.getConnection("jdbc:mysql://localhost/disco_tienda","root","");
         st = conect.createStatement();
         System.out.println(nombre);
         System.out.println(apellido);
         System.out.println(correo);
         System.out.println(username);
         System.out.println(password);
         //String query= "INSERT INTO comprador(nombre,apellido,correo,username, password) VALUES (,'','','','')";
          //st.executeUpdate(query);
        /*PreparedStatement pps = conect.prepareStatement("INSERT INTO comprador(nombre,apellido,correo,username, password) VALUES ('?','?','?','?','?')");
        pps.setString(1, nombre);
         pps.setString(2, apellido);
         pps.setString(3, correo);
         pps.setString(4, username);
         pps.setString(5, password);
         pps.executeUpdate();*/
          System.out.println("Usuario ingresado");  
    }
    
}

