/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.models;

import static com.proydesa.Enumeraciones.Estado.DESPIERTO;
import static com.proydesa.Enumeraciones.Estado.DORMIDO;
import com.proydesa.Enumeraciones.RazaPerro;

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
