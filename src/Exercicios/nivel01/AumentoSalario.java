package Exercicios.nivel01;

import java.util.Scanner;

public class AumentoSalario {

    public static double calculaAumento(double salario) {

        if (salario < 2000) {
            return salario * 1.10;
        } else {

            return salario;
        }

    }

    public static void main(String[] args) {

        System.out.println("Digite Salario");
        Scanner teclado = new Scanner(System.in);

        double res = teclado.nextDouble();

        System.out.println(calculaAumento(res));
    }
}
