/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henry.controller;

import com.henry.entity.Perfil;
import com.henry.service.PerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pc
 */
@RestController
public class PerfilController {
    @Autowired
    PerfilService perfilService;
    
    @RequestMapping(value = "/perfil", method = RequestMethod.POST)
    public Perfil listPerfil(@RequestBody Perfil perfil) {
        return this.perfilService.create(perfil);
        
    }
    @RequestMapping(value = "/perfil", method = RequestMethod.GET)
    public List<Perfil> listPerfil() {
        return this.perfilService.listaPerfil();
        
    }
    @RequestMapping(value = "/perfil/{id}", method = RequestMethod.GET)
    public Perfil findPerfil(@PathVariable int id) {
        return this.perfilService.procuraPerfil(id);
        
    }
    @RequestMapping(value = "/perfil/{id}", method = RequestMethod.PUT)
    public Perfil updatePerfil(@PathVariable int id,@RequestBody Perfil perfil) {
        return this.perfilService.alteraPerfil(id, perfil);
        
    }
    @RequestMapping(value = "/perfil/{id}", method = RequestMethod.DELETE)
    public int deletePerfil(@PathVariable int id) {
        return this.perfilService.deletaPerfil(id);
        
    }
}
