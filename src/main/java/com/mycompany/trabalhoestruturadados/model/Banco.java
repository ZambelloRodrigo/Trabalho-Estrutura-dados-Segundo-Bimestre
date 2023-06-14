/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoestruturadados.model;

import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class Banco {
    //Colocar todos os metodos dentro dessa classe
    private Conta[] contas;
    private int tlConta;

    public Banco(Conta[] conta, int tlConta) {
        this.contas = conta;
        this.tlConta = tlConta;
    }
    
    public void adicionarConta(Conta conta){
        if(tlConta < contas.length){
            contas[tlConta] = conta;
            tlConta++;
            JOptionPane.showMessageDialog(null, 
                    "Conta cadastrada com Sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Não é possível cadastrar mais contas, Verifique!");
        }
    }
      
    public Banco(int total){
        contas = new Conta[total];
        tlConta = 0;
    }
    
    
    
    public void realizaSaque(String pesquisaConta, double valor){
        
        int posicao = buscaBinaria(pesquisaConta);
        verificaContaCadastradas();
        
        if(posicao != -1){
            //double soma = contas[posicao].getSaldo() 
            contas[posicao].realizaTransacaoSaque(valor);
            JOptionPane.showMessageDialog(null, 
                    "Saque realizado com Sucesso, conta: "+contas[posicao].getNumeroConta()+"\n"
                            + "Saldo Atual: R$"+(contas[posicao].getSaldo())+"\n"
                                    + "Valor do Saque: R$"+valor);
        }else{
            JOptionPane.showMessageDialog(null, "Saque não realizado"
                   + "Conta não encontrada verifique!"); 
        }
    }
    
    
    public void realizaDeposito(String pesquisaConta, double valor){
        int posicao = pesquisaLinearNome(pesquisaConta);
        
        verificaContaCadastradas();
        
        if(posicao != -1){
            contas[posicao].realizarTransacao(valor);
            JOptionPane.showMessageDialog(null, 
                    "Deposito realizado com Sucesso, conta: "+contas[posicao].getNumeroConta()+"\n"
                            + "Saldo Atual: R$"+(contas[posicao].getSaldo())+"\n"
                                    + "Valor da transação: R$"+valor);
        }else{
           JOptionPane.showMessageDialog(null, "Deposito não realizado"
                   + "Conta não encontrada verifique!"); 
        }
    }
    
    
    public void OrdenarConta(int validaMsg){
        
        int j;
        String chaveNome, chaveConta;
        double chaveSaldo;
        
        verificaContaCadastradas();
        
        for(int i = 0; i < contas.length; i++){
            
            chaveConta = contas[i].getNumeroConta();
            chaveNome = contas[i].getNomeTirular();
            chaveSaldo = contas[i].getSaldo();
            
            for(j = i-1; (j >= 0 &&  Integer.parseInt(contas[j].getNumeroConta()) > 
                Integer.parseInt(chaveConta)); j--){
                
                contas[j+1].setNumeroConta(contas[j].getNumeroConta());
                contas[j+1].setNomeTirular(contas[j].getNumeroConta());
                contas[j+1].setSaldo(contas[j].getSaldo());
                
            }
            
            contas[j+1].setNumeroConta(chaveConta);
            contas[j+1].setNomeTirular(chaveNome);
            contas[j+1].setSaldo(chaveSaldo);
        }
        
        if(validaMsg == 1){
            String msg = "Contas ordenadas pelo Código da Conta!\n";
            exibirConta(msg);
        }
        
    }
    
    
    public void ordernarSaldo(){
        
        boolean troca = true;
        
        verificaContaCadastradas();
        
        while(troca){
            troca = false;
            
            for(int i = 0; i < contas.length -1; i++){
                if(contas[i].getSaldo() > contas[i+1].getSaldo()){
                    String auxConta = contas[i].getNumeroConta();
                    String auxNome = contas[i].getNomeTirular();
                    double auxSaldo = contas[i].getSaldo();
                    
                    contas[i].setNumeroConta(contas[i+1].getNumeroConta());
                    contas[i].setNomeTirular(contas[i+1].getNomeTirular());
                    contas[i].setSaldo(contas[i+1].getSaldo());
                    
                    contas[i+1].setNumeroConta(auxConta);
                    contas[i+1].setNomeTirular(auxNome);
                    contas[i+1].setSaldo(auxSaldo);
                    troca = true;
                }
            }
            
            String msg = "**********************************\n"+
                          "***Contas Ordenadas Pelo Saldo***\n";
            
            exibirConta(msg);
        }
        
    }
    
    public void exibirConta(String msg){     
        
        for(int i = 0; i < contas.length; i++){
            msg += "\nConta: "+contas[i].getNumeroConta()+"\n"
                  + "Titular: "+contas[i].getNomeTirular()+"\n"
                  + "Saldo: R$"+contas[i].getSaldo()+"\n"
                  + "**********************************";
        }
        
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void verificaContaCadastradas(){
        if(contas[0] == null){
            JOptionPane.showMessageDialog(null, 
                    "Não há contas cadastradas, cadastre antes de ordenar");
        }
    }
    
    public void calcularSaldoTotal(int contador, double saldoTotal, int validaNegativo){
  
        verificaContaCadastradas();
        
        if(contador < contas.length && contas[contador] != null){
            saldoTotal += contas[contador].getSaldo();
            if(validaNegativo == 1 && contas[contador].getSaldo() < 0 ){
                JOptionPane.showMessageDialog(null, 
                    "Conta com saldo Negátivon\n"
                    + "Conta: "+contas[contador].getNumeroConta()+"\n"
                    + "Conta: "+contas[contador].getNomeTirular()+"\n"
                    + "Saldo: R$"+saldoTotal); 
            }
            contador++;
            calcularSaldoTotal(contador, saldoTotal, 1);
        }else{
            JOptionPane.showMessageDialog(null, 
                    "----------Extrato-----------\n"
                  + "Total do banco: R$"+saldoTotal);
        }
    }
    
    public int pesquisaLinearNome(String valor){
        
        for(int i = 0; i < contas.length; i++){
            if(valor.equals(contas[i].getNomeTirular())){
                return i;
            }else if(valor.equals(contas[i].getNumeroConta())){
                return i;
            }
        }   
        return -1;
    }

    private int buscaBinaria(String numeroConta) {
        OrdenarConta(0);
        int inicio = 0;
        int fim = tlConta-1;
        
        while (inicio <= fim) {
            
            int meio =  (inicio + fim) / 2;
            String numeroContaMeio = contas[meio].getNumeroConta();
            if (numeroContaMeio.equals(numeroConta)) {
                return meio;
            } else if (contas[meio].getNumeroConta().compareTo(numeroConta) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
