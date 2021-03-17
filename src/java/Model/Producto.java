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
import javax.imageio.ImageIO;
import org.primefaces.model.file.UploadedFile;


public class Producto {
    
   private int id;
   private String nombre, descripcion;
   private double precio;
   private byte [] foto;
   private int cantidadMinimaVenta;
   private UploadedFile filefoto;
   private Image imagen;



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

    public UploadedFile getFilefoto() {
        return filefoto;
    }

    public void setFilefoto(UploadedFile filefoto) {
        this.filefoto = filefoto;
    }

    public Image getImagen() throws IOException {
        BufferedImage bufimg;
        InputStream in=new ByteArrayInputStream(filefoto.getContent());
         bufimg= ImageIO.read(in);
        return bufimg;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }


    
    
    
    
    
    
    
}
