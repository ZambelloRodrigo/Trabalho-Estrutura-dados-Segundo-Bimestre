/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer2estruturadados.model;

/**
 *
 * @author rodrigo
 */
public class Cliente {
    private int cdCliente;
    private String nome;
    private String dtNascimento;
    private String cpf;

    public Cliente() {
    }

    public Cliente(int cdCliente, String nome, String dtNascimento, String cpf) {
        this.cdCliente = cdCliente;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.cpf = cpf;
    }

    public int getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(int cdCliente) {
        this.cdCliente = cdCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
