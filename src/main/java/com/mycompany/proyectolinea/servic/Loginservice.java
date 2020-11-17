/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolinea.servic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author usuario
 */
public class Loginservice {
    //mirar como hacer pruebas porque no sea podido ejecutar
     Connection conect = null;
       Statement st;
    public void VerDatosComprador() throws SQLException, ClassNotFoundException{
         Class.forName("com.mysql.jdbc.Driver");
         conect = DriverManager.getConnection("jdbc:mysql://localhost/proyectolinea","root","");
         st = conect.createStatement();
         ResultSet rs = st.executeQuery("SELECT*FROM comprador");
         while(rs.next()){
             int id_comprador = rs.getInt("id_comprador");
             String nombre = rs.getString("nombre");
             String apellido = rs.getString("apellido");
             String correo = rs.getString ("correo");
             String username = rs.getString("username");
             String password = rs.getString("password");
             System.out.println(String.format("%s,%s,%s,%s,%s,%s",id_comprador,nombre,apellido,correo,username,password));
         }
         
    }
}
