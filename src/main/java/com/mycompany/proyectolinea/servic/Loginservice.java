/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolinea.servic;

import com.mycompany.proyectolinea.conexion.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author usuario
 */
public class Loginservice {
     conexion conexion = new conexion();
    Statement st;
    public void VerDatosComprador(String correo, String password) {
        try {
            st = conexion.conexion().createStatement();
           ResultSet rs = st.executeQuery("SELECT*FROM comprador");
            System.out.println("Usuario ingresado");
              while(rs.next()){
             int id_comprador = rs.getInt("id_comprador");
             String nombre = rs.getString("nombre");
             String apellido = rs.getString("apellido");
             //String correo = rs.getString ("correo");
             String username = rs.getString("username");
             //String password = rs.getString("password");
             System.out.println(String.format("%s,%s,%s,%s,%s,%s",id_comprador,nombre,apellido,correo,username,password));
         }
        } catch (SQLException e) {
            e.setNextException(e);
        }    
    }
}
