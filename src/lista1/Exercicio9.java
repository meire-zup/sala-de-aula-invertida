package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Faça um Programa que leia 20 números e armazene-os numa lista. Armazene
    os números pares na lista PAR e os números ÍMPARES na lista ímpar. Imprima
     as três listas.
 */
public class Exercicio9 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20 ; i++) {
            System.out.println("Informe um número:");
            numeros.add(scanner.nextInt());
        }
        System.out.println("NÚMEROS:");
        System.out.println(numeros);
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) % 2 == 0){
                numerosPares.add(numeros.get(i));
            } else {
                numerosImpares.add(numeros.get(i));
            }
        }
        System.out.println("NÚMEROS PARES:");
        System.out.println(numerosPares);

        System.out.println("NÚMEROS ÍMPARES:");
        System.out.println(numerosImpares);


    }

}
