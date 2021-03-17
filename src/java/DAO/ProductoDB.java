/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.Conexion.AccesoDatos;
import DAO.Conexion.SNMPExceptions;
import Model.Producto;
import Model.Tipo.TipoUsuario;
import Model.Usuario;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Jesus
 */
public class ProductoDB {
  

    
    public ProductoDB() {
    }
    
  
    
    public static int agregarProducto(Producto producto) throws SNMPExceptions, IOException{
          String Insert = "exec InsertarProductos '"
                  +producto.getNombre()+"','"
                  +producto.getDescripcion()+"','"
                  +producto.getFilefoto().getInputStream()+"',"
                  +producto.getPrecio()+","
                  +producto.getCantidadMinimaVenta();
    
        int result=-1;

        try {
        
            //Se instancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de búsqueda
         
            //Se ejecuta la sentencia SQL
       result=accesoDatos.ejecutaSQL(Insert);
         
         

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage());
        } finally {

        }
        return result;
    }
    public static LinkedList<Producto> seleccionarProductos() throws SNMPExceptions{
       String select = "exec SeleccionarProductos";
        LinkedList<Producto> listaProductos = new LinkedList<Producto>();

        try {
        
            //Se instancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de búsqueda
         
            //Se ejecuta la sentencia SQL
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            //Se llena el arryaList con los proyectos   
            while (rsPA.next()) {
                Producto pro=new Producto();
                pro.setId(rsPA.getInt("id"));
                pro.setDescripcion("descripcion");
                pro.setFoto(rsPA.getBytes("foto"));
                pro.setPrecio(rsPA.getFloat("precio"));
                pro.setCantidadMinimaVenta(rsPA.getInt("cantidadMinimaVenta"));
                listaProductos.add(pro);

            }
            rsPA.close();

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage());
        } finally {

        }
        return listaProductos;
}
}

