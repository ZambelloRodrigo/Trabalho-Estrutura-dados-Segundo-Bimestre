/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.universidade.enuns;

/**
 *
 * @author rodrigo
 */
public enum StatusProfessor {
    ATIVO("Ativo"),
    ENCOSTADO("Encostado"),
    APOSENTADO("Aposentado"),
    FERIAS("Férias");
    
    private String valor;

    private StatusProfessor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
    
}
