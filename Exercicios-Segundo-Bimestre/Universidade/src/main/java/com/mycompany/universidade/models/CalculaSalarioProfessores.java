/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.models;

import com.mycompany.universidade.interfaces.Calculo;

/**
 *
 * @author rodrigo
 */
public class CalculaSalarioProfessores implements Calculo{
    private int cdCalculo;
    private double valor;
    
    
    @Override
    public double calculaQtdSalario(double hora, double valorHora, String data){
        System.out.println("\n"+data.substring(0, 2)+"\n");
        if(data.substring(0, 2) != "30"){
            this.valor = valorHora * hora;
            return this.valor;
        }else{
            return -1;
            
        }
        
    }

    
}
