/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;  // CAMBIAR DE JAVA.SQL.DATE A JAVA.UTIL.DATE

/**
 *
 * @author DUOC
 */
public class Libro {
    
    private int idLibro,precio;
    private String titulo, autor;
    private Date publicacion;
    private boolean disponible;

    public Libro() {
    }

    public Libro(int idLibro, int precio, String titulo, String autor, Date publicacion, boolean disponible) {
        this.idLibro = idLibro;
        this.precio = precio;
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.disponible = disponible;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Date publicacion) {
        this.publicacion = publicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

        
    
    
    
}
