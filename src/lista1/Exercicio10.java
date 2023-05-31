package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Faça um Programa que leia uma lista de 5 números inteiros, mostre a soma,
    a multiplicação e os números.
 */
    public class Exercicio10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> numeros = new ArrayList<>();
            int soma = 0;
            int multiplicacao = 1;
            for (int i = 0; i < 5 ; i++) {
                System.out.println("Informe um número:");
                int numero = scanner.nextInt();
                numeros.add(numero);
            }
            for (int numero : numeros) {
                soma += numero;
                multiplicacao *= numero;
            }
            System.out.println("Números: "+ numeros);
            System.out.println("Soma: "+soma);
            System.out.println("Multiplicação: "+multiplicacao);

        }
    }
