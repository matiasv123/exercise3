/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.Factory;

import com.proydesa.models.Gato;
import com.proydesa.models.Mascota;
import com.proydesa.models.Perro;

/**
 *
 * @author Matias Villarreal
 */
public class MascotaFactory {
    
    public static Mascota crearMascota(Mascota mascota){
        if(mascota instanceof Perro){
            return new Perro();
        }else if(mascota instanceof Gato){
            return new Gato();
        }else{
            return null;
        }
    }
}
