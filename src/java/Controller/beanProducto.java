/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

<<<<<<< HEAD
import DAO.Conexion.SNMPExceptions;
import DAO.ProductoDB;
import Model.Producto;
=======
import Model.Product;
>>>>>>> 17f1e861ca145fa7d7048ec6d0728f2a286c5ffb
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;

/**
 *
<<<<<<< HEAD
 * @author Jesus
=======
 * @author Usuario
>>>>>>> 17f1e861ca145fa7d7048ec6d0728f2a286c5ffb
 */
@Named(value = "beanProducto")
@SessionScoped
public class beanProducto implements Serializable {

<<<<<<< HEAD
    /**
     * Creates a new instance of beanProducto
     */
       private Producto product=new Producto();
       private LinkedList<Producto> lista=new LinkedList<>();
    public beanProducto() {
     
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }

    public LinkedList<Producto> getLista() throws SNMPExceptions {
      return  ProductoDB.seleccionarProductos();
    }

    public void setLista(LinkedList<Producto> lista) {
        this.lista = lista;
    }
    
    
    public void agregarProducto() throws SNMPExceptions{
        
        ProductoDB.agregarProducto(product);
    }
=======
  
    
    
    public beanProducto() {
    }
    
    

    
    
>>>>>>> 17f1e861ca145fa7d7048ec6d0728f2a286c5ffb
    
    
}
