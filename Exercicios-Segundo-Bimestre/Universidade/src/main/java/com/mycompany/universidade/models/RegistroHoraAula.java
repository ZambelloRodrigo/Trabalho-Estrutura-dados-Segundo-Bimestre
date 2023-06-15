/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.models;

/**
 *
 * @author rodrigo
 */
public class RegistroHoraAula {
    private int cdRegistro;
    private Professores professor;
    private Disciplina disciplina;
    private String data;
    private double qtdHoraAula;

    public RegistroHoraAula() {
    }

    public RegistroHoraAula(int cdRegistro, Professores professor, Disciplina disciplina, String data, double qtdHoraAula) {
        this.cdRegistro = cdRegistro;
        this.professor = professor;
        this.disciplina = disciplina;
        this.data = data;
        this.qtdHoraAula = qtdHoraAula;
    }

    public int getCdRegistro() {
        return cdRegistro;
    }

    public void setCdRegistro(int cdRegistro) {
        this.cdRegistro = cdRegistro;
    }

    public Professores getProfessor() {
        return professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getQtdHoraAula() {
        return qtdHoraAula;
    }

    public void setQtdHoraAula(double qtdHoraAula) {
        this.qtdHoraAula = qtdHoraAula;
    }

    
}
