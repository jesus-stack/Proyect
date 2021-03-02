/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Conexion.SNMPExceptions;
import DAO.UsuarioDLL;
import Model.Cliente;
import Model.Funcionario;
import Model.Tipo.TipoUsuario;
import Model.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.faces.model.SelectItem;
import javax.naming.NamingException;

/**
 *
 * @author Usuario
 */
@Named(value = "beanCliente")
@SessionScoped
public class BeanCliente implements Serializable {

    Cliente cliente=new Cliente();
    String tipoUsuario;


    public String getTipoUsuario() {
        return tipoUsuario;
        
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public BeanCliente() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


  
    
    
    
    public void insertarCliente(Cliente c) throws NamingException, SNMPExceptions, SQLException, ClassNotFoundException{
   
   
    UsuarioDLL.insertarCliente(c);
    }
   
    
    public LinkedList <SelectItem> listaTipoUsuario() throws SNMPExceptions{
    LinkedList lista=new LinkedList();
        
        for (TipoUsuario o : UsuarioDLL.listaTipoUsuario()) {
            if(o.getId()!=1){
            lista.add(new SelectItem(o.getDescripcion()));
        }
            }
    
    return lista;
    }
    
    
   public void insertarTipoUsuario() throws SNMPExceptions{
   TipoUsuario t =new TipoUsuario();
  cliente.setTipo(t.traerTipo(tipoUsuario));
   }
    
    
}
