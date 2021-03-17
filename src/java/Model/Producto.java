/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import javax.imageio.ImageIO;
import org.primefaces.model.file.UploadedFile;


public class Producto {
    
   private int id;
   private String nombre, descripcion;
   private double precio;
   private byte[] foto;
   private int cantidadMinimaVenta;

   
   private String mensaje="Leído";

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
   
    
    public void AgregarMensaje(){
    mensaje="Leido: "+id;
    }

    public Producto(int id, String nombre, String descripcion, double precio, byte[] foto, int cantidadMinimaVenta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.foto = foto;
        this.cantidadMinimaVenta = cantidadMinimaVenta;
    }





    public Producto() {
        this.id = 0;
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0;
        this.foto = null;
        this.cantidadMinimaVenta = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public int getCantidadMinimaVenta() {
        return cantidadMinimaVenta;
    }

    public void setCantidadMinimaVenta(int cantidadMinimaVenta) {
        this.cantidadMinimaVenta = cantidadMinimaVenta;
    }


    
   
    
    
    
    
    
}
