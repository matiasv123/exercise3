/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.DAO;

import com.proydesa.Enumeraciones.TipoMascota;
import com.proydesa.models.Mascota;
import java.util.List;

/**
 *
 * @author Matias Villarreal
 */
public interface MascotaDAO {
    
    public void guardar(Mascota mascota);
    
    public void borrar(Mascota mascota);
    
    public void modificar(Mascota mascota);
    
    public Mascota buscarPorNombreTipo(String nombre, TipoMascota tipoMascota);
    
    public List<Mascota> buscarPorNombre(String nombre);
    
    public List<Mascota> buscarTodas();
}
