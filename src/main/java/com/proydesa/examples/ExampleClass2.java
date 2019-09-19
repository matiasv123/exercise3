/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.examples;

/**
 *
 * @author matia
 */
public class ExampleClass2 {
    private int contador = 10;
    
    public ExampleClass2(){
        
    }
    public int agregaContador(int x){
        this.contador += x;
        return contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
