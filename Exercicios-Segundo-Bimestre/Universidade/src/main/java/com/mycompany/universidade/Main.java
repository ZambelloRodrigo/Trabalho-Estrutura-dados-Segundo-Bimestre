/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.universidade;

import com.mycompany.universidade.enuns.AlunosAtivosEnun;
import com.mycompany.universidade.enuns.StatusProfessor;
import com.mycompany.universidade.models.Aluno;
import com.mycompany.universidade.models.Banco;
import com.mycompany.universidade.models.CalculaSalarioProfessores;
import com.mycompany.universidade.models.Disciplina;
import com.mycompany.universidade.models.Mae;
import com.mycompany.universidade.models.Pai;
import com.mycompany.universidade.models.Professores;
import com.mycompany.universidade.models.RegistroHoraAula;
import java.util.ArrayList;

/**
 *
 * @author rodrigo
 */
public class Main {

    public static void main(String[] args) {
        /*Anderson deseja um novo software para a universidade, neste software
        deve ser possível cadastrar os alunos com seus respectivos telefones, 
        endereços e dados de mãe e pai. Deverá ser possível categorizar os 
        alunos em alunos ativos, ex-alunos, aguardando matrícula, bloqueado.
        Este software também deve permitir que façamos o cadastro dos professores 
        e seus respectivos dados bancários além do valor de hora aula.
        A cada hora aula ministrada o professor deverá registrar suas horas 
        e em que disciplina ele ministrou, devemos ter uma rotina de cálculo 
        que somente no último dia do mês deverá ser calculado o valor de salário
        do professor e demonstrado através de uma mensagem a disciplina e a 
        quantidade de horas totais ministradas na disciplina e ao final o valor 
        total a ser pago ao professor.
        Utilize todos os conceitos de herança, enum e interfaces para 
        desenvolver o exercício.
        */
        //Aluno aluno = new Aluno();
        
        ArrayList<Aluno> listAluno = new ArrayList<>();
        ArrayList<Disciplina> listDisciplina = new ArrayList<>();
        
        listDisciplina.add(new Disciplina(1, "POO"));
        listDisciplina.add(new Disciplina(2, "Banco de Dados"));
        listDisciplina.add(new Disciplina(3, "Algoritimo"));
        
        listAluno.add(new Aluno("Ana Beatriz", "45988988988", AlunosAtivosEnun.ATIVO, 1));
        
        listAluno.add(new Aluno("João Carlos", "4586615166", AlunosAtivosEnun.ATIVO, 2));
        
        Pai paiAninha = new Pai(listAluno.get(0), "Rodrigo Zambello", 36, "05406622919", 3);
        Mae maeAninha = new Mae(listAluno.get(0), "Ana Lucia", 30, "0005416515", 4);
        
        Pai paiJoao = new Pai(listAluno.get(1), "Rodrigo Zambello", 36, "05406622919", 5);
        Mae maeJoao = new Mae(listAluno.get(1), "Ana Lucia", 30, "0005416515", 6);
        
        Banco bancoBrasil = new Banco(1, "Banco do Brasil", 111, 1, "Corrente");
        
        Professores professor = new Professores("Rodrigo", StatusProfessor.ATIVO, bancoBrasil, 57.48, 7);
        
        ArrayList<RegistroHoraAula> listRegistroAula = new ArrayList<>();
        
        listRegistroAula.add(new RegistroHoraAula(1, professor, 
                listDisciplina.get(0), "01/05/2023", 4));
        listRegistroAula.add(new RegistroHoraAula(2, professor, 
                listDisciplina.get(0), "02/05/2023", 4));
        
        double hora = 0;
        
        for(int i = 0; i < listRegistroAula.size(); i++){
            hora = hora + listRegistroAula.get(i).getQtdHoraAula();
        }
        
        for(int i = 0; i < listAluno.size(); i++){
           System.out.println("codigo aluno: "+listAluno.get(i).getCdPessoa()+"\n"
                              + "Nome: "+listAluno.get(i).getNome()
                              + "\nPai: "+paiAninha.getNome()
                              + "\nMae: "+maeAninha.getNome()); 
        }
        
        CalculaSalarioProfessores calcula = new CalculaSalarioProfessores();
        
        double vlSalario = calcula.calculaQtdSalario(hora, professor.getValorHoraAula(), "30/05/2023");
        
        System.out.println("\n------------------------------------\n");
        for(int i = 0; i < listRegistroAula.size(); i++){
            System.out.println("Professor: "+listRegistroAula.get(i).getProfessor().getNome()
                              +"\nDisciplina "+listRegistroAula.get(i).getDisciplina().getNomeDisciplina()
                              +"\nHoras: "+listRegistroAula.get(i).getQtdHoraAula()
                              +"\nData Aula: "+listRegistroAula.get(i).getData()
                              +"\n------------------------------------\n");
        }
        
        if(vlSalario == -1){
            System.out.println("Para calcular o salario precisa ser o ultimo dia do mes");  
        }else{
            System.out.println("Salario Porfessor: R$"+vlSalario);
        }
            
        
        
    }
}
