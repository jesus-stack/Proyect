/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import javax.inject.Named;
import java.io.Serializable;
import java.util.LinkedList;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Jesus
 */
@Named(value = "beanProduct")
@RequestScoped
public class BeanProduct implements Serializable {

    /**
     * Creates a new instance of BeanProduct
     */
 private LinkedList<Product> products=new LinkedList<Product>();
    public BeanProduct() {
        
    }
    

    public LinkedList<Product> getProducts() {
       products.add(new Product(5000, 5,"Salsa Inglesa", "salsa para preparar diversos platillos","inglesa"));
       products.add(new Product(5000, 5,"Salsa Inglesa", "salsa para preparar diversos platillos","inglesa"));
       products.add(new Product(5000, 5,"Salsa Inglesa", "salsa para preparar diversos platillos","inglesa"));
       products.add(new Product(5000, 5,"Salsa Inglesa", "salsa para preparar diversos platillos","inglesa"));
       products.add(new Product(5000, 10,"Salsa Alas", "salsa para preparar alas buffalo","alas"));
       products.add(new Product(5000, 10,"Salsa Alas", "salsa para preparar alas buffalo","alas"));
       products.add(new Product(5000, 10,"Salsa Alas", "salsa para preparar alas buffalo","alas"));
       products.add(new Product(5000, 10,"Salsa Alas", "salsa para preparar alas buffalo","alas"));
       return products;
    }

    public void setProducts(LinkedList<Product> products) {
        this.products = products;
    }
    
}
