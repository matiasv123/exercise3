/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Matias Villarreal
 */
public class LogUsuario {
    /*
    *  Estructura del HashMap:
    *          nombre usuario - metodos usados (separados por ";").
    *    Ejemplo: usuario1 - metodo1();metodo2()...etc.
    */
    private static HashMap<String, String> logUsuario;
    private static LogUsuario instancia;
    
    private LogUsuario(){
        
    }
    
    public LogUsuario getInstance(){
        if(instancia == null){
           instancia = new LogUsuario();
        }
        return instancia;
    }
    
    
    public static void addLogueo(String nombre, String metodoUsado){
        if(logUsuario.containsKey(nombre)){
            //Si ya existe un mapeo para el usuario:
            String tempValue;
            if(logUsuario.get(nombre) == null){
                tempValue = metodoUsado;
            }else{
                tempValue = logUsuario.get(nombre).concat(";").concat(metodoUsado);
            }
            logUsuario.replace(nombre, tempValue);
        }else{
            logUsuario.put(nombre, metodoUsado);
        }
    }
    
    public static List<String> getMetodosUsuario(String nombre){
        List<String> metodos = new ArrayList();
        if(logUsuario.containsKey(nombre)){
            metodos.addAll(Arrays.asList(logUsuario.get(nombre).split(";")));
        }
        return metodos;
    }
    
    public static void borrarUsuario(String nombre){
        if(logUsuario.containsKey(nombre)){
            logUsuario.remove(nombre);
        }
    }
    
}
