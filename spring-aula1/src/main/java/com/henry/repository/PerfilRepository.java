/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henry.repository;

import com.henry.entity.Perfil;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author pc
 */
public interface PerfilRepository extends CrudRepository<Perfil, Integer>{
    Perfil findByNome(String nome);

    
}
