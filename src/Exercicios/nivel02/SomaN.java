package Exercicios.nivel02;

import java.util.Arrays;
import java.util.Scanner;

public class SomaN {
    public static void main(String[] args) {


        System.out.println("Quantos numeros deseja somar");
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int [] soma =  new int [n];

        for( int i = 0; i<n; i++ ){

            System.out.println( "Digite Valor Para Posicao " +(i+1));

            soma [i] = teclado.nextInt();

        }

        System.out.print("Valor Soma"+ Arrays.stream(soma).sum());

    }
}
