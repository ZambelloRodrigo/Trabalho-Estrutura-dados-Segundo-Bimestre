/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exer2estruturadados;

import com.mycompany.exer2estruturadados.model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author rodrigo
 */
public class Main {

    public static void main(String[] args) {
        
        ArrayList<Cliente> listCliente = new ArrayList<>();
        
        listCliente.add(new Cliente(5, "Rodrigo", 
                "02/11/1986", "05406622919"));
        
        listCliente.add(new Cliente(3, "Ana Lucia", 
                "24/09/1992", "1132323232"));
        
        listCliente.add(new Cliente(9, "Ana Beatriz", 
                "28/10/2023", "61616165151"));
        
        listCliente.add(new Cliente(10, "Joao Carlos", 
                "28/10/2023", "1653115"));
        
        
    }
    
    public static int[] ordenacaoInsercao(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int posMenor = i;
            
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[posMenor]){
                    posMenor = j;
                }
            }
            
            if(posMenor != i){
                int aux = array[i];
                array[i] = array[posMenor];
                array[posMenor] = aux;
            }
            
        }
        for(int i = 0; i < array.length; i++){
            System.out.println("vetor["+i+"] = "+array[i]);
        }    
    }
}
