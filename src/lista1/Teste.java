package lista1;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        List<Integer>  numeros2 = new ArrayList<>();
        numeros2.add(10);
        numeros2.add(20);
        System.out.println(numeros2);

    }
}
