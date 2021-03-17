/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import Model.Producto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
@Named(value = "beanProducto")
@SessionScoped
public class beanProducto implements Serializable {

LinkedList lista; 
    
    
    public beanProducto() {
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

    public LinkedList getLista() {
        lista=llenarLista();
        return lista;
    }

    public void setLista(LinkedList lista) {
        this.lista = lista;
    }
    
    
    
    
}
