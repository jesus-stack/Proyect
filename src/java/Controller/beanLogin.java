/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Conexion.AccesoDatos;
import DAO.UsuarioDLL;
import Model.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;

/**
 *
 * @author Jesus
 */
@Named(value = "beanLogin")
@SessionScoped
public class beanLogin implements Serializable {
private static Usuario usuario=new Usuario();
    /**
     * Creates a new instance of beanLogin
     */
    public beanLogin() {
    }

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        beanLogin.usuario = usuario;
    }
//    public void validarUsuario(){
//        Usuario usuario=UsuarioDLL.SeleccionarUsuaioXIdentificacion(this.getUsuario().getId());       
//          growlView view=new growlView();
//          view.addMessage(FacesMessage.SEVERITY_ERROR, "!Datos Invalidos", "!Datos Invalidos");
//        if(usuario==null){
//         
//            
//        }
//    }
}
