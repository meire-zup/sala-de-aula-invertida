package lista1;

import java.util.Scanner;

/*
    Faça um Programa que leia uma lista de 10 números e mostre-os na ordem
inversa.
 */
public class Exercicio8 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextInt();
        }
        for (int i = numeros.length -1; i >= 0 ; i--) {
            System.out.println(numeros[i]);
        }

    }
}
