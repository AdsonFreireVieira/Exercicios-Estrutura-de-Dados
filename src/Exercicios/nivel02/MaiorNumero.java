package Exercicios.nivel02;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {

        int [] maior = new int[10];

         Scanner teclado = new Scanner(System.in);


        for(int i =0; i<10; i++){

            System.out.println("Digite Valor Para Posicao" +(i+1));
             maior [i] = teclado.nextInt();

        }

        System.out.println("Maior Valor Digitado  "+Arrays.stream(maior).max().getAsInt());
    }
}
