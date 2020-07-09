/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/
package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        peca a1 = new peca();
        peca a2 = new peca();
        float calculo;

        System.out.println("Informe o código da peça: ");
        a1.setCodigo(ler.nextInt());
        ler.nextLine();
        System.out.println("Informe o numero da peça: ");
        a1.setNumero(ler.nextInt());
        System.out.println("Informe o valor da peça: ");
        a1.setValor(ler.nextFloat());
        System.out.println("Informe o código da peça: ");
        a2.setCodigo(ler.nextInt());
        ler.nextLine();
        System.out.println("Informe o numero da peça: ");
        a2.setNumero(ler.nextInt());
        System.out.println("Informe o valor da peça: ");
        a2.setValor(ler.nextFloat());

        System.out.println("Peça 1:\n Código: " + a1.getCodigo() + " Numero: " + a1.getNumero() + " Valor: " + a1.getValor());
        System.out.println("Peça 2:\n Código: " + a2.getCodigo() + " Numero: " + a2.getNumero() + " Valor: " + a2.getValor());
        calculo = a1.getValor() + a2.getValor();
        System.out.printf("Total: R$ "+"%.2f \n", calculo);
    }

}
