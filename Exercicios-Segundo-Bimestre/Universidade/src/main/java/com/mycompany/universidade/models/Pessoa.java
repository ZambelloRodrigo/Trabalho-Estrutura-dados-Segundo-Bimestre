/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.models;

/**
 *
 * @author rodrigo
 */
public abstract class Pessoa {
    private int id;

    public Pessoa() {
    }

    public Pessoa(int id) {
        this.id = id;
    }
    
    public int getCdPessoa() {
        return id;
    }

    public void setCdPessoa(int id) {
        this.id = id;
    }
    
}
