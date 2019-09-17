/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.models;

import static com.proydesa.Enumeraciones.Estado.DESPIERTO;
import static com.proydesa.Enumeraciones.Estado.DORMIDO;
import com.proydesa.Enumeraciones.RazaPerro;
import java.util.Objects;

/**
 *
 * @author Matias Villarreal
 */
public class Perro extends Mascota{
    private final int AUMENTO_ENERGIA = 20;
    private RazaPerro raza;

    public Perro() {
        
    }
    
    
    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        final Perro otroPerro = (Perro) obj;
        return  (this.raza.equals(otroPerro.raza)            &&
                 super.getTipo().equals(otroPerro.getTipo()) &&
                 super.getNombre().equals(otroPerro.getNombre()));
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.raza);
        hash = 53 * hash + Objects.hashCode(super.getTipo());
        hash = 53 * hash + Objects.hashCode(super.getNombre());
        return hash;
    }
    
    @Override
    public void comer(){
        super.aumentarEnergia(AUMENTO_ENERGIA);
    }
    
    @Override
    public void dormir(){
        super.setEstado(DORMIDO);
        super.aumentarEnergia(AUMENTO_ENERGIA/4);
    }
    
    @Override
    public void despertar(){
        super.setEstado(DESPIERTO);
    }
    
    public void caminar(){
        super.disminuirEnergia(AUMENTO_ENERGIA/3);
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }
    
    
}
