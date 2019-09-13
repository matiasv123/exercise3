/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.DAO;

import com.proydesa.models.Usuario;
import java.util.List;

/**
 *
 * @author Matias Villarreal
 */
public interface UsuarioDAO {
    
        /* Guarda el usuario pasado como parametro 
        *  en el entorno de persistencia.
        */
    public void guardar(Usuario usuario);

        /* Borra el usuario pasado como parametro 
        *  en el entorno de persistencia.
        */
    public String borrar(Usuario usuario);
    
        /* Modifica el usuario pasado como parametro 
        *  en el entorno de persistencia.
        */
    public String actualizar(Usuario usuario);
    
        /* Busca segun el parametro nombre un usuario 
        *  en el entorno de persistencia.
        */
    public Usuario buscarPorNombre(String nombre);
    
        /* Devuelve un array de Usuarios con todos los
        *  usuarios del entorno de persistencia.
        */
    public List<Usuario> buscarTodos();
    
}
