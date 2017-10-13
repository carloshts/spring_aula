/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henry.controller;

import com.henry.entity.Usuario;
import com.henry.repository.UsuarioRepository;
import com.henry.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    
    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public List<Usuario> listUsuario() {
        return this.usuarioService.listaUsuario();
    }

    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
    public List<Usuario> createUsuario(@RequestBody Usuario usuario) {
        
        return this.usuarioService.create(usuario);
    }

}