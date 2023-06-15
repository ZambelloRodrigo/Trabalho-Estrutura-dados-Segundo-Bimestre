/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exedoisrecursivo;

import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class Main {

    public static void main(String[] args) {
        int vlCalculado = 1;
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero do calculo do "
                + "fatorial"));
        
        calculaFatorial(valor, vlCalculado);
    }
    
    public static void calculaFatorial(int valor, int vlCalculado){
        
        if(valor == 0 || valor == 1){
            JOptionPane.showMessageDialog(null, "Valor do fatorial "+vlCalculado);
        }else{
            vlCalculado += vlCalculado * (valor - 1);
            valor--;
            calculaFatorial(valor, vlCalculado);
        }
        
    }
}
