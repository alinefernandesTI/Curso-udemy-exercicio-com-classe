/*Implemente um programa para cadastro de alunos de uma disciplina utilizando a linguagem Java, seguindo os seguintes critérios: 
Criar uma estrutura heterogênea (array) do tipo string para cadastrar o nome de 25 alunos; 
Garantir que a estrutura seja totalmente preenchida. 
Após implementar o programa e preencher o array com o nome dos alunos, cadastre mais 5 novos alunos.  
Qual a dificuldade de inserir os novos alunos nessa estrutura de dados? Justifique a sua resposta direcionando aos 
conceitos de gerenciamento de memória.*/

package atividade;
import java.util.Scanner;



public class atividade {

 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String vetor [] = new String [25];

        for(int c = 0; c < 25; c++ ){
            aluno a1 = new aluno();
            System.out.println("Informe o nome do aluno: ");
            a1.setNome(ler.nextLine());
            vetor[c]= a1.getNome();
        }
        System.out.println("Total de alunos cadastrados: "+vetor.length);
        
        System.out.println("Incluido mais alunos...");
        for(int d = 0; d < 5; d++ ){
            aluno a1 = new aluno();
            System.out.println("Informe o nome do aluno: ");
            a1.setNome(ler.nextLine());
            vetor[d+vetor.length]= a1.getNome();
        }
        
    }
    
}

