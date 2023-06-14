/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoestruturadados.model;

/**
 *
 * @author rodrigo
 */
public class Conta {
    private String numeroConta;
    private String nomeTirular;
    private double saldo;
    private double transacao;

    public Conta(String numeroConta, String nomeTirular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTirular = nomeTirular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTirular() {
        return nomeTirular;
    }

    public void setNomeTirular(String nomeTirular) {
        this.nomeTirular = nomeTirular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTransacao() {
        return transacao;
    }

    public void setTransacao(double transacao) {
        this.transacao = transacao;
    }
    
    public void realizarTransacao(double transacao){
        this.transacao += transacao;
        double valor = transacao + getSaldo();
        setSaldo(valor);
    }
    
    public void realizaTransacaoSaque(double transacao){
        this.transacao = this.transacao - transacao;
        double valor = getSaldo() - transacao;
        setSaldo(valor);
    }
    
}
