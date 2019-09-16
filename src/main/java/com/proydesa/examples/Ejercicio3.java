/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.examples;

import com.proydesa.models.Gato;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Matias Villarreal
 */
public class Ejercicio3 {
    
    
    public static void main(String[] args) throws FileNotFoundException{
        Properties myProps = new Properties();
        try{
            /*System.out.println("thread: " + Thread.currentThread().getContextClassLoader().toString());
            ClassLoader loader = Class.forName("com.proydesa.examples.Ejercicio3").getClassLoader();
            System.out.println("clase: " + loader.getClass().toString());
            InputStream fis = loader.getResourceAsStream("./resources/usuarios.properties");
            System.out.println("rrrr: " + loader.getResource("resources/usuarios.properties").getPath());
            System.out.println("esto: " + fis.read());*/
            //InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("resources/fichero.txt");
            FileInputStream fis = new FileInputStream(".\\resources\\application.properties");
            myProps.load(fis);
            System.out.println("Usuario 2: " + myProps.getProperty("usuario2"));
            Gato cat = new Gato();
            cat.
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
