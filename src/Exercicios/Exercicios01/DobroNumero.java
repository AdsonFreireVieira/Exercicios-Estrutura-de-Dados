package Exercicios.Exercicios01;

import java.util.Scanner;

// Exer 01 recebe valor e exibe Dobro
public class DobroNumero {

    public static int dobroNumero(int valor){

        return valor *2;
    }

    public static void main(String[] args) {

        Scanner teclado  = new Scanner(System.in);

        System.out.println("Digite Valor");
        int valor = teclado.nextInt();

        System.out.println(dobroNumero(valor));

    }
}
