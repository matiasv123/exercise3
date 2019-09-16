/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.DAO;

import com.proydesa.models.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Matias Villarreal
 */
public class UsuarioDAOHashMap implements UsuarioDAO{
    private HashMap<String, String> mapaUsuario;

    public UsuarioDAOHashMap() {
        mapaUsuario = new HashMap<>();
    }
    

    @Override
    public void guardar(Usuario usuario){
        mapaUsuario.put(usuario.getNombre(), usuario.getPassword());
    }
    
    @Override
    public String borrar(Usuario usuario){
        return mapaUsuario.remove(usuario.getNombre());
    }
    
    @Override
    public String actualizar(Usuario usuario){
       return (mapaUsuario.replace(usuario.getNombre(), usuario.getPassword()));
    }
    
    @Override
    public Usuario buscarPorNombre(String nombre){
        Usuario usuario;
        if(mapaUsuario.containsKey(nombre)){
            String password = mapaUsuario.get(nombre);
            if(password != null){
                usuario = new Usuario();
                usuario.setNombre(nombre);
                usuario.setPassword(password);
            }else{
                usuario = null;
            }
        }else{
            usuario = null;
        }
        return usuario;
    }
    
    /**
     *
     * @return List<Usuario>
     */
    @Override
    public List<Usuario> buscarTodos(){
        List<Usuario> usuarios = new ArrayList();
        for(String i:mapaUsuario.keySet()){
            Usuario usuario = new Usuario();
            usuario.setNombre(i);
            usuario.setPassword(mapaUsuario.get(i));
            usuarios.add(usuario);
        }
        return usuarios;
    }
}
