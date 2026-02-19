package Exercicios.Exercicios01;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {

        int[] valores =new int [5];
        Scanner teclado = new Scanner(System.in);

        for(int i=0; i<=2;i++) {
            System.out.println("Digite Valor ");
      valores [i] = teclado.nextInt();
        }
            int numeros = Arrays.stream(valores).max().getAsInt();
        System.out.println("Numero Maior"+numeros);


    }
}
