/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henry.service;

import com.henry.entity.Usuario;
import com.henry.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired 
    private UsuarioRepository usuarioRepository;
    
    public Usuario create(Usuario usuario){
        usuarioRepository.save(usuario);
        return usuario;
    }
    public List<Usuario> listaUsuario() {
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
        return usuarios;

    }
    public void deletaUsuario(Usuario usuario){
        usuarioRepository.delete(id);
    }

    
}


