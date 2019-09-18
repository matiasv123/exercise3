/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.vistas;

import com.proydesa.controllers.ControlUsuarios;
import com.proydesa.controllers.Controlador;

/**
 *
 * @author Matias Villarreal
 */
public class VistaLogueo implements InterfazVista{
    private String nombreUsuario;
    private String passwordUsuario;
    private boolean validado;
    private ControlUsuarios controlador;
    
    public VistaLogueo(){
        
    }
    
    @Override
    public void setControlador(Controlador controlador){
        this.controlador = (ControlUsuarios) controlador;
    }
    
    @Override
    public void arranca(){
        
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public void setNombreUsuario(String nombre) {
        this.nombreUsuario = nombre;
    }


    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }
    
    
    public ControlUsuarios getControlador() {
        return controlador;
    }
    
    
}
