/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.models;

import com.mycompany.universidade.enuns.StatusProfessor;
import java.util.ArrayList;

/**
 *
 * @author rodrigo
 */
public class Professores extends Pessoa{
    /*Este software também deve permitir que façamos o cadastro dos professores 
        e seus respectivos dados bancários além do valor de hora aula.
        A cada hora aula ministrada o professor deverá registrar suas horas 
        e em que disciplina ele ministrou
    */
    
    private String nome;
    private StatusProfessor Status;
    private Banco banco;
    private double valorHoraAula;

    public Professores() {
    }

    public Professores(String nome, StatusProfessor Status, Banco banco, double valorHoraAula, int id) {
        super(id);
        this.nome = nome;
        this.Status = Status;
        this.banco = banco;
        this.valorHoraAula = valorHoraAula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusProfessor getStatus() {
        return Status;
    }

    public void setStatus(StatusProfessor Status) {
        this.Status = Status;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
    
    
}
