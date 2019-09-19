/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.Factory;

import com.proydesa.DAO.UsuarioDAO;
import com.proydesa.DAO.UsuarioDAOHashMap;

/**
 *
 * @author Matias Villarreal
 */
public class UsuarioDAOFactory {
    
    public static UsuarioDAO crearUsuarioDAO(){
        return new UsuarioDAOHashMap();
    }
}
