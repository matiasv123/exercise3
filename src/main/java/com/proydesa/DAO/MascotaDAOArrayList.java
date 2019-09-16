/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.DAO;

import com.proydesa.Enumeraciones.TipoMascota;
import com.proydesa.Factory.MascotaFactory;
import com.proydesa.models.Mascota;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Matias Villarreal
 */
public class MascotaDAOArrayList implements MascotaDAO{
     /*
     * El "id" dentro de la lista de mascota esta formado por el nombre
     * y el tipo de mascota. Si dos mascotas tienen el mismo nombre, deben
     * ser distintos tipos de mascotas.
     */  
    private List<Mascota> arrayMascotas;

    public MascotaDAOArrayList() {
        arrayMascotas = new ArrayList();
    }
    
    @Override
    public void guardar(Mascota mascota){
        if(!arrayMascotas.contains(mascota)){
            arrayMascotas.add(mascota);
        }
    }
    
    @Override
    public void borrar(Mascota mascota){
        if(arrayMascotas.contains(mascota)){
            arrayMascotas.remove(mascota);
        }
    }
    
    @Override
    public void modificar(Mascota mascota){
        //Busco por nombre y tipo primero porque el metodo contains() de List ya no sirve por las modificaciones.
        Mascota tempMascota = buscarPorNombreTipo(mascota.getNombre(), mascota.getTipo());
        if(tempMascota != null){
            arrayMascotas.set(arrayMascotas.indexOf(tempMascota), mascota);
        }
    }
    
    @Override
    public Mascota buscarPorNombreTipo(String nombre, TipoMascota tipo){
        boolean encontrado  = false;
        Mascota mascota = null;
        Iterator<Mascota> iterator= arrayMascotas.iterator();
        while(iterator.hasNext()&& !encontrado){
            Mascota tempMascota = iterator.next();
            if(tempMascota.getNombre().equals(nombre) && tempMascota.getTipo().equals(tipo)){
               encontrado = true;
               mascota = MascotaFactory.crearMascota(tempMascota);
            }
        }
        return mascota;
    }
    
    @Override
    public List<Mascota> buscarPorNombre(String nombre){
        List<Mascota> tempLista = new ArrayList();
        Iterator<Mascota> iterator= arrayMascotas.iterator();
        while(iterator.hasNext()){
            Mascota tempMascota = iterator.next();
            if(tempMascota.getNombre().equals(nombre)){
               tempLista.add(tempMascota);
            }
        }
        return tempLista;
    }
    
    @Override
    public List<Mascota> buscarTodas(){
        List<Mascota> tempLista = new ArrayList();
        Iterator<Mascota> iterator= arrayMascotas.iterator();
        while(iterator.hasNext()){
            tempLista.add(iterator.next());
        }
        return tempLista;  
    }
    
}
