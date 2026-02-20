package Exercicios.nivel01;

import java.util.Scanner;

public class MaiorDeDois {

    public static int retornaMaiorNumero(int numero1, int numero2){


                return Math.max(numero1, numero2);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite valor 1");
        int num1 = teclado.nextInt();
        System.out.println("Digite valor 2");

        int num2 = teclado.nextInt();

        System.out.println(retornaMaiorNumero(num1,num2));



    }
}
