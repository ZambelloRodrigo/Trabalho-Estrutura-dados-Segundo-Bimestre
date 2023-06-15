/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exeumrecursivo;

/**
 *
 * @author rodrigo
 */
public class Main {

    public static void main(String[] args) {
        int contagem = 0;
        int soma = 0;
        System.out.println("Iniciando soma");
        somaValores(contagem, soma);
    }
    
    public static void somaValores(int contagem, int soma){
        
        if(contagem == 50){
            System.out.println(soma);
        }else{
            soma = soma + contagem+1;
            contagem++;
            somaValores(contagem, soma);
        }
    }
}
