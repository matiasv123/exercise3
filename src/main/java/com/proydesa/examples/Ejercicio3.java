/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.examples;

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
            FileInputStream fis = new FileInputStream("C:\\Users\\matia\\Documents\\NetBeansProjects\\exercise3\\src\\main\\java\\resources\\usuarios.properties");
                    //new FileInputStream(Ejercicio3.class.getResource("/exercice3/resources/usuarios.properties").getFile());
            myProps.load(fis);
            System.out.println("Usuario 2: " + myProps.getProperty("usuario2"));
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
