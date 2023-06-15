/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.models;

/**
 *
 * @author rodrigo
 */
public class Banco {
    private int cdBanco;
    private String nomeBanco;
    private int agencia;
    private int conta;
    private String tpConta;

    public Banco() {
    }

    public Banco(int cdBanco, String nomeBanco, int agencia, int conta, String tpConta) {
        this.cdBanco = cdBanco;
        this.nomeBanco = nomeBanco;
        this.agencia = agencia;
        this.conta = conta;
        this.tpConta = tpConta;
    }

    public int getCdBanco() {
        return cdBanco;
    }

    public void setCdBanco(int cdBanco) {
        this.cdBanco = cdBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getTpConta() {
        return tpConta;
    }

    public void setTpConta(String tpConta) {
        this.tpConta = tpConta;
    }
    
    
}
