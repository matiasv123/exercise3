/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.examples;

import static com.proydesa.Enumeraciones.AccionesVista.*;
import com.proydesa.DAO.UsuarioDAO;
import com.proydesa.Factory.UsuarioDAOFactory;
import com.proydesa.controllers.ControlUsuarios;
import com.proydesa.controllers.Controlador;
import com.proydesa.models.Usuario;
import com.proydesa.vistas.VistaLogueo;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Matias Villarreal
 */
public class Ejercicio3 {
       //Objeto singleton.
    private static Ejercicio3 instancia;
    
       //Contiene el nombre del usuario logueado para usar en el Log.
    private static String usLogueado;
      

    private Ejercicio3(){
        
    }
    
    public static Ejercicio3 getInstancia(){
        if(instancia == null) instancia = new Ejercicio3();
        return instancia;
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        Ejercicio3 modulo = getInstancia();
        if(modulo.logueoUsuario()){
            System.out.println("Usuario logueadooo---> seguiria el resto del programa");
        }
    }
    
    
    private boolean logueoUsuario(){
        VistaLogueo   vista  = new VistaLogueo();
        UsuarioDAO    modelo = UsuarioDAOFactory.crearUsuarioDAO();
        Controlador   controlador =  new ControlUsuarios(vista, modelo);
        vista.setControlador(controlador);
        controlador.actionPerformed(new ActionEvent(this,1,CARGARUSAURIOS.toString()));
        
        ///// Codigo de TESTEO, borrar.
        System.out.println("Los usuariossss:: ");
        List<Usuario> list = modelo.buscarTodos();
        Iterator<Usuario> it = list.iterator();
        while(it.hasNext()){
            Usuario usu = it.next();
            System.out.println("Usuario: " + usu.getNombre() + " - " + usu.getPassword());
        }
        ////////////
        
        vista.arranca();
        if(vista.isValidado()){
            usLogueado = vista.getNombreUsuario();
            return true;
        }else{
            return false;
        }
    }
}
