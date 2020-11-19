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
@Named(value = "artistaController")
@RequestScoped
public class ArtistaController {
 private String nombre_artista;
 private String genero_musical;
 private String imagen;
 private String nacionalidad;
 private String fecha_nacimiento;
    /**
     * Creates a new instance of ArtistaController
     */
    public ArtistaController() {
    }
    public void artista(){
        System.out.println("Entro"+nombre_artista+""+genero_musical+""+nacionalidad+""+fecha_nacimiento);
        datos dt= new datos();
        dt.cagarDatosArtista(nombre_artista,genero_musical,imagen,nacionalidad,fecha_nacimiento);
    }

    public String getNombre_artista() {
        return nombre_artista;
    }

    public void setNombre_artista(String nombre_artista) {
        this.nombre_artista = nombre_artista;
    }

    public String getGenero_musical() {
        return genero_musical;
    }

    public void setGenero_musical(String genero_musical) {
        this.genero_musical = genero_musical;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

   
}
