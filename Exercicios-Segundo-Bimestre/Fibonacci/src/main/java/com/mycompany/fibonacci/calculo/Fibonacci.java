/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fibonacci.calculo;

import com.mycompany.fibonacci.exceptions.ErroCalcularException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class Fibonacci {
    private int vl1 = 0;
    private int vl2 = 1;
    private int vl3 = 0;
    private int contador;
    private String retorno = "0, ";
    
    
    public void calcularFibonaci(int vlCalcular) throws ErroCalcularException{
        
        if(vlCalcular == 0){
            throw new ErroCalcularException();
        }
        
        if(vlCalcular <= 1){
            this.retorno += "1, ";
            this.contador++;
        }
        
        vl3 = vl2 + vl1;
        vl2 = vl1;
        vl1 = vl3;
        
        //JOptionPane.showMessageDialog(null, this.vl3);
        
        
        if(contador == vlCalcular){
           this.retorno += vl3;
        }else{
           this.contador++;
           this.retorno += vl3+", ";
           calcularFibonaci(vlCalcular); 
        }
        
    }
        
    public String getRetorno(){
        return this.retorno;
    }
}
