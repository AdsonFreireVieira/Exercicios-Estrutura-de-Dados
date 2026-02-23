package Exercicios.nivel01;

import java.util.Scanner;

    // Ano bissexto
public class bissexto {

    public static boolean isBissexto(int ano){

                return (ano % 400 ==0) ||(ano % 4==0 && ano % 100 !=0);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite Ano");
        int ano = teclado.nextInt();

        System.out.print(isBissexto(ano));


    }
}
