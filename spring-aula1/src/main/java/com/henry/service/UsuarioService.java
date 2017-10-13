/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henry.service;

import com.henry.entity.Usuario;
import com.henry.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;
/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    public List<Usuario> create(Usuario usuario){
        usuarioRepository.save(usuario);
        List<Usuario> usuarioLista = (List<Usuario>) usuarioRepository.findAll();
        return usuarioLista;
    }
    public List<Usuario> listaUsuario() {
        List<Usuario> usuarioLista = (List<Usuario>) usuarioRepository.findAll();
        return usuarioLista;

    }

    
}


