/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.models;

/**
 *
 * @author rodrigo
 */
public class Pai extends Pessoa{
    private Aluno aluno;
    private String nome;
    private int idade;
    private String cpf;

    public Pai() {
    }

    public Pai(Aluno aluno, String nome, int idade, String cpf, int id) {
        super(id);
        this.aluno = aluno;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
