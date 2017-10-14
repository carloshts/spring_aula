/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henry.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author pc
 */
@Entity
public class Perfil implements GrantedAuthority{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idPerfil;
    
    private String nome;

    public Perfil() {
    }

    public Perfil(String nome) {
        this.nome = nome;
    }
    
    

    public int getIdPerfi() {
        return idPerfil;
    }

    public void setIdPerfil(int id) {
        this.idPerfil = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getAuthority() {
        return nome;
    }
    
}
