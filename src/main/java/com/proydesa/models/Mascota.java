/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.models;

import com.proydesa.Enumeraciones.Estado;
import com.proydesa.Enumeraciones.TipoMascota;

/**
 *
 * @author Matias Villarreal
 */
abstract public class Mascota implements Comparable<Mascota>{
    private Estado  estado;
    private TipoMascota tipo;
    private String nombre;
    private int energia;        

    
    abstract public void comer();
    abstract public void dormir();
    abstract public void despertar();

    
      //La clase se ordena por el nombre.
    @Override
    public int compareTo(Mascota mascota){
        return this.nombre.compareTo(mascota.nombre);
    }
    
      //Obligo a definir en la clases hijas estos metodos asi puedo usar el atributo Raza.
    @Override
    abstract public int hashCode();
    @Override
    abstract public boolean equals(Object o);
            
            
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
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
    
    protected void aumentarEnergia(int aumento){
        energia += aumento;
    }
    
    protected void disminuirEnergia(int disminucion){
        energia -= disminucion;
    }
    
    public int getEnergia(){
        return energia;
    }
}
