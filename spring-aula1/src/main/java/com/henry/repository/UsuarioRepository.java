/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henry.repository;

import com.henry.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author pc
 */


public interface UsuarioRepository extends CrudRepository<Usuario, String> {
    
}
