/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.controllers;

import com.proydesa.DAO.UsuarioDAO;
import com.proydesa.Enumeraciones.AccionesVista;
import com.proydesa.models.Usuario;
import static com.proydesa.Enumeraciones.AccionesVista.*;
import com.proydesa.vistas.InterfazVista;
import com.proydesa.vistas.VistaLogueo;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author Matias Villarreal
 */
public class ControlUsuarios implements Controlador{
    private VistaLogueo    vista;
    private UsuarioDAO    modelo;
            
    public ControlUsuarios(InterfazVista vista, UsuarioDAO modelo){
        this.vista  = (VistaLogueo) vista;
        this.modelo = modelo;
    }
    
    @Override
    public void actionPerformed(ActionEvent evt){
        AccionesVista accion =  AccionesVista.valueOf(evt.getActionCommand());
        switch(accion){
            case CARGARUSAURIOS:
                cargarUsuarios();
                break;
            case BUSCARUNO:
                vista.setNombreUsuario(buscarUnUsuario(vista.getNombreUsuario()));
                break;
            case VALIDAR:
                vista.setValidado(validarUsuario(vista.getNombreUsuario(), vista.getPasswordUsuario()));
                break;
            default:
                System.out.println("Accion Control Usuario invalida!");
        }
    }
    
    
    private void cargarUsuarios(){
        Properties myProps = new Properties();
        try{
            Usuario usuario = new Usuario();
              //Cargo archivo de properties con los datos de usuarios
            FileInputStream fis = new FileInputStream(".\\resources\\application.properties");
            myProps.load(fis);
            
              //Cargo usuario1
            usuario.setNombre(myProps.getProperty("usuario1"));
            usuario.setPassword(myProps.getProperty("password1"));
            modelo.guardar(usuario);
              //Cargo Usuario2
            usuario.setNombre(myProps.getProperty("usuario2"));
            usuario.setPassword(myProps.getProperty("password2"));
            modelo.guardar(usuario);
            
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private String buscarUnUsuario(String nombre){
        Usuario usuario = modelo.buscarPorNombre(nombre);
        if(usuario == null){
            return "";
        }else{
            return usuario.getNombre();
        }
    }
    
    private boolean validarUsuario(String nombre, String password){
        Usuario usuario = modelo.buscarPorNombre(nombre);
        if(usuario == null) return false;
        return usuario.getPassword().equals(password);
    }
}
