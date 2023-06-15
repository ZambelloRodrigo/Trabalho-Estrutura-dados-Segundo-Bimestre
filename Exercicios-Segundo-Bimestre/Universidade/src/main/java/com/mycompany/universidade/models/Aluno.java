/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.models;

import com.mycompany.universidade.enuns.AlunosAtivosEnun;

/**
 *
 * @author rodrigo
 */
public class Aluno extends Pessoa {
    private String nome;
    private String fone;
    private AlunosAtivosEnun status;

    public Aluno() {
    }

    public Aluno(String nome, String fone, AlunosAtivosEnun status, int id) {
        super(id);
        this.nome = nome;
        this.fone = fone;
        this.status = status;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public AlunosAtivosEnun getStatus() {
        return status;
    }

    public void setStatus(AlunosAtivosEnun status) {
        this.status = status;
    }

    
}
