/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.models;

import static com.proydesa.Enumeraciones.Estado.DESPIERTO;
import static com.proydesa.Enumeraciones.Estado.DORMIDO;
import com.proydesa.Enumeraciones.RazaGato;

/**
 *
 * @author Matias Villarreal
 */
public class Gato extends Mascota{
    private final int AUMENTO_ENERGIA = 10;
    private RazaGato raza;
    
    
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
    
    public void saltar(){
        super.disminuirEnergia(AUMENTO_ENERGIA/2);
    }

    public RazaGato getRaza() {
        return raza;
    }

    public void setRaza(RazaGato raza) {
        this.raza = raza;
    }
    
    
}
