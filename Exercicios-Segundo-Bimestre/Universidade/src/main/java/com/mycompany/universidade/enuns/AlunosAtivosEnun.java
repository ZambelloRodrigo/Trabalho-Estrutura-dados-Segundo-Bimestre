/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.universidade.enuns;

/**
 *
 * @author rodrigo
 */
public enum AlunosAtivosEnun {
    ATIVO("Ativos"),
    EXALUNOS("Ex-alunos"),
    AGUARDANDOMATRICULA("Agradando Matrícula"),
    BLOQUEADO("Bloqueado");
    
    private String valor;

    private AlunosAtivosEnun(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
    
}
