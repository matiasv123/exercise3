/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.Factory;

import com.proydesa.DAO.MascotaDAO;
import com.proydesa.DAO.MascotaDAOArrayList;

/**
 *
 * @author Matias Villarreal
 */
public class MascotaDAOFactory {
    
    public static MascotaDAO crearMascotaDAO(){
        return new MascotaDAOArrayList();
    }
    
}
