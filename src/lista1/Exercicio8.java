package lista1;

import java.util.Scanner;

/*
    Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }

    }
}
