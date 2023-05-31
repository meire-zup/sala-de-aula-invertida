package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Faça um programa que receba dois números inteiros e gere os números
    inteiros que estão no intervalo compreendido por eles.
 */
    public class Exercicio6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o primeiro intervalo:");
            int primeiroIntervalo = scanner.nextInt();
            System.out.println("Informe o segundo intervalo:");
            int segundoIntervalo = scanner.nextInt();
            List<Integer> numerosInteiros = new ArrayList<>();
            if(primeiroIntervalo < segundoIntervalo){
                for (int i = primeiroIntervalo+1; i <segundoIntervalo ; i++) {
                    numerosInteiros.add(i);
                }
            } else {
                for (int i = segundoIntervalo+1; i <primeiroIntervalo ; i++) {
                    numerosInteiros.add(i);
                }
            }
            if(primeiroIntervalo<segundoIntervalo){
                System.out.println("Valores entre intervalo "+primeiroIntervalo+" - "+segundoIntervalo+":");
            } else {
                System.out.println("Valores entre intervalo "+segundoIntervalo+" - "+primeiroIntervalo+":");
            }
            System.out.println(numerosInteiros);
        }
    }
