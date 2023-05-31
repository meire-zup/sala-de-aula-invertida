package lista1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
        Faça um Programa que leia um número e exiba o dia correspondente da
        semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor
        inválido.
     */
public class Exercicio2 {
    public static void main(String[] args) {

        Map<String, Integer> diasDaSemana = new HashMap<>();
        diasDaSemana.put("Domingo", 1);
        diasDaSemana.put("Segunda-feira", 2);
        diasDaSemana.put("Terça-feira", 3);
        diasDaSemana.put("Quarta-feira", 4);
        diasDaSemana.put("Quinta-feira", 5);
        diasDaSemana.put("Sexta-feira", 6);
        diasDaSemana.put("Sábado", 7);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Esolha um dia da semana conforme tabela abaixo:");
        System.out.println("------------------");
        System.out.printf("1 - Domingo\n2 - Segunda-feira\n3 - Terça-feira\n4 - Quarta-feira\n5 - Quinta-feira\n6 - Sexta-feira\n7 - Sábado\n");
        System.out.println("------------------");
        System.out.printf("OPÇÂO: ");
        Integer diaEscolhido = scanner.nextInt();
        if(diaEscolhido<=0 || diaEscolhido>7){
            System.out.println("Valor inválido");
            System.exit(1);
        }
        String diaDaSemana = "";
        for (Map.Entry<String,Integer> entry : diasDaSemana.entrySet()) {
            if (diaEscolhido.equals(entry.getValue())){
                diaDaSemana = entry.getKey();
            }
        }
        System.out.println("Dia escolhido: "+diaDaSemana);
    }
}
