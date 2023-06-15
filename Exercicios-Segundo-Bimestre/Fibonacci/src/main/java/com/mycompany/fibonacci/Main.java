/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

import com.mycompany.fibonacci.calculo.Fibonacci;
import com.mycompany.fibonacci.exceptions.ErroCalcularException;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class Main {

    public static void main(String[] args) throws ErroCalcularException {
        int vlCalcular = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite um numero!"));
    
        try{
           Fibonacci fib = new Fibonacci();
           fib.calcularFibonaci(vlCalcular);
            JOptionPane.showMessageDialog(null, fib.getRetorno());
        }catch(ErroCalcularException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERRO: não tratato: "+ex);
        }
        
    }
}
