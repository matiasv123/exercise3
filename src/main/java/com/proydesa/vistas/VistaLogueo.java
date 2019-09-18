/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.vistas;

import com.proydesa.controllers.ControlUsuarios;
import com.proydesa.controllers.Controlador;
import static com.proydesa.Enumeraciones.AccionesVista.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;

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
        Scanner reader = new Scanner(System.in);
        validado = false;
        boolean  terminado = false;
        do{
            System.out.println("************* Logueo Usuario *************");
            System.out.println("              (Salir..: 'q')              ");
            System.out.print("   ->Ingrese nombre  usuario: ");
            nombreUsuario = reader.nextLine();
            if(nombreUsuario.equalsIgnoreCase("q")){
                terminado = true;
            }else{
                System.out.print("   ->Ingrese pasword usuario: ");
                passwordUsuario = reader.nextLine();
                if(passwordUsuario.equalsIgnoreCase("q")){
                    terminado = true;
                }else{
                    System.out.println("");
                    if(controlDatos()){
                         //Todo bien, salgo del menu de logueo.
                        terminado = true;
                    }else{
                         //Si hubo algun error, hago una pausa para que el usuario lo vea.
                        reader.nextLine();
                    }
                }
            }
            System.out.println("\n");
        }while(!terminado);
        
    }

    public boolean controlDatos(){
        if(nombreUsuario.equals("") || passwordUsuario.equals("")){
            System.out.print("ERROR: datos incompletos- Revise.");
            return false;
        }
        controlador.actionPerformed(new ActionEvent(this,1,BUSCARUNO.toString()));
        if(nombreUsuario.equals("")){
            System.out.print("ERROR: usuario inexistente- Revise.");
            return false;    
        }
        controlador.actionPerformed(new ActionEvent(this,1,VALIDAR.toString()));
        if(!validado){
            System.out.print("ERROR: password incorrecta- Revise.");
            return false;
        }
        return true;
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
