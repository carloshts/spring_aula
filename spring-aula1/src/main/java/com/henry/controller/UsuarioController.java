/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henry.controller;

import com.henry.entity.Usuario;
import com.henry.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
    public Usuario findUsuario(@PathVariable long id){
        return this.usuarioService.procuraUsuario(id);
        
    }
    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        
        return this.usuarioService.create(usuario);
    }
    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.PUT)
    public Usuario updateUsuario(@PathVariable long id, @RequestBody Usuario usuario){
        return this.usuarioService.alteraUsuario(id,usuario);
        
    }
    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
    public long deleteUsuario(@PathVariable long id){
        
        return this.usuarioService.deletaUsuario(id);
    }

}