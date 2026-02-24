package Exercicios.nivel01;

import java.util.Scanner;

public class multiplos {

    public static String numeroMultiplo(int numero){

        return (numero % 3==0 && numero % 5==0) ? "Multiplo":"Nao Multiplo";

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite Valor");
        int num = teclado.nextInt();

        System.out.println(numeroMultiplo(num));
    }
}
