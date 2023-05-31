package lista1;

import java.util.ArrayList;
import java.util.List;

/*
    Faça um programa que imprima na tela apenas os números ímpares entre 1 e
50.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for (int i = 1; i <=50 ; i++) {
            numeros.add(i);
        }
        for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) % 2 != 0){
                numerosImpares.add(numeros.get(i));
            }
        }
        System.out.println("Números ímpares de 1 a 50:");
        System.out.println(numerosImpares);
    }

}
