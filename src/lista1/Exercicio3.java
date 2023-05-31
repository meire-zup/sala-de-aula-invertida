package lista1;

import java.util.Scanner;

/*
    Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
    número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver
    a tabuada. A saída deve ser conforme o exemplo abaixo:
    Tabuada de 5:
    5 x 1 = 5
    5 x 2 = 10
    [...]
    5 x 10 = 50
 */
public class Exercicio3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int tabuada;
            do {
                System.out.println("Qual a tabuada deseja visualizar. (Digite 1 - 10):");
                tabuada = scanner.nextInt();
                if(tabuada <=0 || tabuada >10)
                    System.out.println("Valor inválido");
            } while (tabuada <=0 || tabuada >10);
            System.out.println("Tabuada de "+ tabuada+":");
            for (int i = 1; i <=10; i++) {
                System.out.println(tabuada+" x "+i+" = "+tabuada*i);
            }
        }

    }
