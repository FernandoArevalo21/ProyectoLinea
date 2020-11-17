/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolinea.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author usuario
 */
@Named(value = "albumController")
@RequestScoped
public class album {
     Connection conect = null;
       Statement st;
    public void cargarDatosalbum() throws SQLException, ClassNotFoundException{
         Class.forName("com.mysql.jdbc.Driver");
         conect = DriverManager.getConnection("jdbc:mysql://localhost/proyectolinea","root","");
         st = conect.createStatement();
          String query= "INSERT INTO album(nombre_album,precio_album) VALUES ('Mi sangre','50','0')";
          st.executeUpdate(query);
          System.out.println("Album ingresado");
    }
}
