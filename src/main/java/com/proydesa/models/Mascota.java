/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.models;

/**
 *
 * @author Matias Villarreal
 */
abstract public class Mascota {
    private TipoMascota tipo;
    private String nombre;
    private int energia;

    
    abstract public void comer();
    abstract public void dormir();
    
    
    public TipoMascota getTipo() {
        return tipo;
    }

    public void setTipo(TipoMascota tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
