/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhoestruturadados;

import com.mycompany.trabalhoestruturadados.model.Banco;
import com.mycompany.trabalhoestruturadados.model.Conta;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class Main {

    public static void main(String[] args) {
        
        int qtdContasInicial = Integer.parseInt(
                    JOptionPane.showInputDialog("Quantas contas o sistema terá?"));
        
        Banco banco = new Banco(qtdContasInicial);
        
        boolean acesso = true;
        
        while (acesso) {  
            
            //Colocar o opções de deposito e saque dentro do metodo que pesquisa a conta
            int menu = Integer.parseInt(
                    JOptionPane.showInputDialog("----MENU----\n"
                                                + "1- Cadastrar Conta.\n"
                                                + "2- Ordernar Conta.\n"
                                                + "3- Deposito.\n"
                                                + "4- Saque.\n"
                                                + "5- Saldo Total do Banco.\n"
                                                + "6- Verificação de Saldo Negativo\n"
                                                + "7- Sair"));

            switch (menu) {
                
                case 1:
                    //Metodo de cadastro de Conta
                    int qtdContas = Integer.parseInt(
                            JOptionPane.showInputDialog("Quantas contas "
                                + "deseja cadastrar?"));
                    
                    
                   
                    for(int i = 0; i < qtdContas; i++){
                        
                        String nrConta = JOptionPane.showInputDialog(""
                                + "Cadastro: "+(i+1)+"\nDigite o numero da conta");
                        String nmConta = JOptionPane.showInputDialog(""
                                + "Cadastro: "+(i+1)+"\nDigite o Nome do Titular da conta");
                        double sdIni = Double.parseDouble(JOptionPane.showInputDialog(""
                                + "Cadastro: "+(i+1)+
                                "\nQual o valor que deseja depositar para abrir a conta?"));
                        
                        Conta conta = new Conta(nrConta, nmConta, sdIni);
                        
                        banco.adicionarConta(conta);
                    }
                    break;
                case 2:
                    
                    //Ordenação de contas.
                    int vlOrdenacao = Integer.parseInt(
                            JOptionPane.showInputDialog("-----ORDENAÇÃO-----\n"
                                                        + "1- Ordernar pelo Número/conta\n"
                                                        + "2- Ordenar pelo Saldo.\n"));   
                    switch (vlOrdenacao) {
                        case 1:
                            
                            //Ordenação usando o código da conta.
                            banco.OrdenarConta(1);
                            break;
                        case 2:
                            
                            //Ordenação pelo valor da conta.
                            banco.ordernarSaldo();
                            break;
                        default:
                            throw new AssertionError();
                    }
                    
                    break;
                case 3:
                    
                    //Metodo para pesquisa de conta e realiza o deposito.
                    String pesquisa = JOptionPane.showInputDialog("Pesquise a conta digitando o Nome ou o Número!");   
                    
                    double valor = Double.parseDouble(JOptionPane.showInputDialog(
                            "Qual o valor do Deposito?"));

                    banco.realizaDeposito(pesquisa, valor);
                            
                    break;
                case 4:
                    //Campo para chamar o saque da conta.
                    String pesqSaque = JOptionPane.showInputDialog("Pesquise a conta digitando o Nome ou o Número!");   
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog(
                            "Qual o valor do Saque?"));
                    banco.realizaSaque(pesqSaque, valorSaque);
                    break;
                case 5:
                    //Calcula o valor total do banco.
                    banco.calcularSaldoTotal(0, 0, 0);
                    break;
                case 6:
                    // Nesse caso usei o mesmo metodo para calcular o saldo negativo,
                    // apenas adicionei uma condição se for um saldo negativo ele exibe a conta
                    banco.calcularSaldoTotal(0,0,1);
                    break;
                case 7:
                    acesso = false;
                    JOptionPane.showMessageDialog(null, "Obrigado por acessar.");
                    
                    break;
                default:
                    throw new AssertionError();
                }
            
        }
    }
}
