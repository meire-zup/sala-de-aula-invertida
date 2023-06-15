package lista1;

import java.sql.Array;
import java.util.*;

/*
    Faça um programa que pergunte o preço de três produtos e
     informe qual produto você deve comprar, sabendo que a
     decisão é sempre pelo mais barato.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        //testando
        Map<String, Double> produtos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Informe o preço do produto "+i+":");
            double preço = scanner.nextDouble() ;
            String nomeProduto = "produto"+i;
            produtos.put(nomeProduto,preço);
        }
        Double menorPreco = Double.MAX_VALUE;
        String produtoMenorValor = null;
        for (Map.Entry<String, Double> entry : produtos.entrySet()) {
            String produto = entry.getKey();
            Double preco =entry.getValue();
            if(preco<menorPreco) {
                menorPreco = preco;
                produtoMenorValor = produto;
            }
        }
        System.out.println("Produto mais barato: "+produtoMenorValor);
        System.out.println("Preço: R$ "+menorPreco);
        }
    }


