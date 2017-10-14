/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henry.service;

import com.henry.entity.Perfil;
import com.henry.repository.PerfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {
    @Autowired
    private PerfilRepository perfilRepository;
    
    public Perfil create(Perfil perfil){
        perfilRepository.save(perfil);
        return perfil;
    }
    public List<Perfil> listaPerfil() {
        List<Perfil> perfis = (List<Perfil>) perfilRepository.findAll();
        return perfis;

        
    }
    public boolean verificaPerfil(int id){
        return perfilRepository.exists(id);
    }
    public Perfil procuraPerfil(int id){
        Perfil perfil = perfilRepository.findOne(id);
        return perfil;
    }
    public Perfil alteraPerfil(int id,Perfil perfil){
        perfil.setIdPerfil(id);
        if(this.verificaPerfil(id)){
            
            perfilRepository.save(perfil);
        }
        return perfil;
    }
    public int deletaPerfil(int id){
        perfilRepository.delete(id);
        return id;
    }
}
