/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import DAO.Conexion.SNMPExceptions;
import DAO.ProductoDB;
import Model.Producto;
import Model.Product;

import Model.Producto;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.InputStream;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;
import javax.mail.Part;
import javax.servlet.http.HttpServletRequest;

/**
 *

 * @author Jesus
=======
 * @author Usuario

 */
@Named(value = "beanProducto")
@SessionScoped
public class beanProducto implements Serializable {


LinkedList lista; 

    /**
     * Creates a new instance of beanProducto
     */
       private Producto product=new Producto();
       
    public beanProducto() {
     
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }
//
//    public LinkedList<Producto> getLista() throws SNMPExceptions {
//      return  ProductoDB.seleccionarProductos();
//    }

 

    public LinkedList getLista() {
        lista=llenarLista();
        return lista;
    }

    public void setLista(LinkedList lista) {
        this.lista = lista;
    }
    
    
public void insertarProducto(){
 HttpServletRequest req;   
 //Part p=req.getPart("foto");
}
    
    
  
    
    
public LinkedList llenarLista(){
    
     lista=new LinkedList(); 
    lista.add(new Producto(0, "Salsa Inglesa", "Rica salsa para sasonar nuestras comidas", 2000, null, 5));
    lista.add(new Producto(1, "Arroz", "Arroz blanco tio pelón en tarros de 3 kilogramos para toda la semana", 2000, null, 5));
    lista.add(new Producto(2, "Pinto", "Gallo pinto constarricense con excelente sabor para que disfrute de sus mañanas con su familia", 2000, null, 5));
    lista.add(new Producto(3, "Carne asada", "Rica Carne asada con barbacoa ", 2000, null, 5));
     lista.add(new Producto(0, "Salsa Inglesa", "Rica salsa para sasonar nuestras comidas", 2000, null, 5));
    lista.add(new Producto(1, "Arroz", "Arroz blanco tio pelón en tarros de 3 kilogramos para toda la semana", 2000, null, 5));
    lista.add(new Producto(2, "Pinto", "Gallo pinto constarricense con excelente sabor para que disfrute de sus mañanas con su familia", 2000, null, 5));
    lista.add(new Producto(3, "Carne asada", "Rica Carne asada con barbacoa ", 2000, null, 5));
    
 
return lista;   
}


    
    
}
