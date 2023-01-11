/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Libro;
import bd.Conexion;
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.sql.*;   // CAMBIAR CONNECTION POR ASTERISCO *
import java.util.ArrayList;

/**
 *
 * @author DUOC
 */
public class ControladorLibro {
    
    public boolean agrega(Libro libro)
    {
        Conexion con = new Conexion();
        
        Connection cnx = con.obtenerConexion();
        String query = "INSERT INTO libro(titulo, autor, publicacion,precio,disponible)VALUES(?,?,?,?,?)";
        
        try {
             PreparedStatement ps = cnx.prepareStatement(query);
             ps.setString(1, libro.getTitulo());
             ps.setString(2, libro.getAutor());
             ps.setDate(3,new java.sql.Date(libro.getPublicacion().getTime()));
             ps.setInt(4, libro.getPrecio());
             ps.setBoolean(5, libro.isDisponible());
             
             ps.executeUpdate();
             ps.close();
             cnx.close();
             
             return true;
             
             
        } catch (Exception ex) {
            System.out.println("ERROR SQL"+ex.getMessage());
            return false;
        }
        
        
        
    }
    
    
    //MOSTRAR INFO DE LIBROS
    public ArrayList<Libro> traerTodo()
    {
    
        ArrayList<Libro> libros = new ArrayList<>();
        
         Conexion con = new Conexion();
        Connection cnx = con.obtenerConexion();
        
        String query = "SELECT id_libro,titulo,autor,publicacion,precio,disponible FROM libro";
        
        try {
             PreparedStatement ps = cnx.prepareStatement(query);
             ResultSet rs = ps.executeQuery();
             
             while(rs.next())
             {
             
                 Libro l = new Libro();
                 
                 l.setIdLibro(rs.getInt("id_Libro"));
                 l.setTitulo(rs.getString("titulo"));
                 l.setAutor(rs.getString("Autor"));
                 l.setPublicacion(rs.getDate("Publicacion"));
                 l.setPrecio(rs.getInt("Precio"));
                 l.setDisponible(rs.getBoolean("disponible"));
                 
                 libros.add(l); //AGREGAR EL LIBRO A LA COLECCION.
               
             }
             rs.close();
             ps.close();
             cnx.close();
             
        } catch (Exception ex) {
            System.out.println("ERROR SQL"+ex.getMessage());
            
        }
        
        
        return libros;
        
    }
    
    
}
