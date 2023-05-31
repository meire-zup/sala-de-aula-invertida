package lista1;

import java.sql.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
    Faça um programa que pergunte o preço de três produtos e
     informe qual produto você deve comprar, sabendo que a
     decisão é sempre pelo mais barato.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Map<String, Double> produtos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Informe o preço do produto "+i+":");
            double preço = scanner.nextDouble() ;
            String nomeProduto = "produto"+i;
            produtos.put(nomeProduto,preço);
        }

        System.out.println(produtos);

        }
    }

