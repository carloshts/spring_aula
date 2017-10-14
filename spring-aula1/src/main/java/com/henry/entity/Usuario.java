
package com.henry.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String nome;

    private String email;

    private String senha;
    
    private int idade;
    
    @ManyToMany
    private List<Perfil> perfis;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
    public Usuario() {
    }

    public Usuario(Usuario usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
        this.perfis = usuario.getPerfis();
    }

    public Usuario(String nome, String email, String senha, List<Perfil> perfis) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfis = perfis;
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<Perfil> perfis) {
        this.perfis = perfis;
    }
    
    
}
