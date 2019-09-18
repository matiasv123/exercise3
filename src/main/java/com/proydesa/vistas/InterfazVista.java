/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.vistas;

import com.proydesa.controllers.Controlador;

/**
 *
 * @author Matias Villarreal
 */
public interface InterfazVista {
    public void setControlador(Controlador c);
    
    public void arranca();
    
}
