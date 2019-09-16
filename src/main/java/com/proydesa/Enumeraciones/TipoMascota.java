/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.Enumeraciones;

/**
 *
 * @author Matias Villarreal
 */
public enum TipoMascota {
    PERRO("Soy un perro"),
    GATO("Soy un gato"),
    LORO("Soy un loro"),
    CANARIO("Soy un canario");
    
    private String descripcion;

    private TipoMascota(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
