/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exepesquisalinearbinaria;

import javax.swing.JOptionPane;


/**
 *
 * @author rodrigo
 */
public class Main {

    public static void main(String[] args) {
        
        int tamArray = Integer.parseInt(JOptionPane.showInputDialog("Adicione o tamanho"
                + " do Array"));
        int [] array = new int[tamArray];
        
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Adicione um numero"));
        }
        
        int chave, j;
        
        for(int i = 0; i < array.length; i++){
            chave = array[i];
            for(j = i-1; (j >= 0 && array[j] > chave); j--){
                array[j+1] = array[j];
            }
            array[j+1] = chave;
        }
        
        int tipoPesquisa = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Escolha o tipo do exercicio \n"
                + "1 - Linear \n"
                + "2 - binaria"));
        
        int pesquisaNumero = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite um numero para pesquisar! "));
        
        if(tipoPesquisa == 1){
            JOptionPane.showConfirmDialog(null, "Acessou 1");
            String retorno = buscaLinear(array, pesquisaNumero);
            if(retorno == "-1"){
                JOptionPane.showConfirmDialog(null, "Acessou 3");
                JOptionPane.showConfirmDialog(null, "valor "
                    + "não Encontrado!");
            }else{
                JOptionPane.showConfirmDialog(null, retorno);
            }
            
        }else if(tipoPesquisa == 2){
            String retorno = buscaBinaria(array, pesquisaNumero);
            if(retorno == "-1"){
                JOptionPane.showConfirmDialog(null, "valor "
                    + "não Encontrado!");
            }else{
                JOptionPane.showConfirmDialog(null, retorno);
            }
            
        }else{
            JOptionPane.showConfirmDialog(null, "Selecione "
                    + "o tipo de pesquisa correta!");
        }
        
    }
    
    public static String buscaBinaria(int[] array, int valorBusca){
        String retorno = "-1";
        for(int i = 0; i < array.length; i++){
            if(array[i] == valorBusca){
                retorno = "Posição "+i+" Valor "+array[i];
                return retorno;
            }
        }
        return retorno;
    }
    
    public static String buscaLinear(int[] array, int valorBusca){
        JOptionPane.showConfirmDialog(null, "Acessou 2");
        String retorno = "-1";
        int esquerda, meio, direita;
        esquerda = 0;
        direita = array.length -1;
        JOptionPane.showConfirmDialog(null, direita);
        while(esquerda <= direita){
            
            meio = (esquerda / direita)/2;
            if(valorBusca == array[meio]){
                retorno = "Posição "+meio+" Valor "+array[meio];
                JOptionPane.showConfirmDialog(null, meio);
                return retorno;
            }

            if(valorBusca > array[meio]){
                esquerda = meio + 1;
            }else{
                direita = meio - 1;
            }

        }
        
        return retorno;
        
    }
}
