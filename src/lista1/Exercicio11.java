package lista1;

import java.util.Scanner;

/*
    João Papo-de-Pescador, homem de bem, comprou um microcomputador para
    controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
    peixes maior que o estabelecido pelo regulamento de pesca do estado de São
    Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente. João
    precisa que você faça um programa que leia a variável peso (peso de peixes) e
    calcule o excesso. Gravar na variável excesso a quantidade de quilos além do
    limite e na variável multa o valor da multa que João deverá pagar. Imprima os
    dados do programa com as mensagens adequadas.
 */
    public class Exercicio11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o peso de peixes:");
            double peso = scanner.nextDouble();
            double excesso = peso - 50;
            double multa = 0;
            if(excesso>0){
                multa = 4*excesso;
                System.out.println("Peso de peixes: "+peso+" kg");
                System.out.println("O excesso de peso é de "+excesso+" kg.");
                System.out.printf("A multa a ser aplicada é de R$: %.2f", multa);
            } else {
                System.out.println("Peso de peixes: "+peso+" kg");
                System.out.println("Sem aplicação de multa.");
        }

    }
}

