package lista1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
    Faça um programa que leia 5 números e informe o maior número.
 */
    public class Exercicio4 {
        public static void main(String[] args) {
            List<Double> numeros = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            for (int i = 1; i <=5 ; i++) {
                System.out.println("Informe o "+i+"º número:");
                double numero = scanner.nextDouble();
                numeros.add(numero);
            }
            double maiorNumero = Collections.max(numeros);
            System.out.println("Maior número: "+maiorNumero);
        }
    }
