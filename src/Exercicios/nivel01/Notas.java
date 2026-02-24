package Exercicios.nivel01;

import java.util.Scanner;

public class Notas {

    public  static  String calculaNotas(double nota1 , double nota2){

        double media = (nota1+nota2) /2;

        return  (media >= 5) ?  "Aprovado":"Reprovado";


    }
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite Nota 1");
        double result1 = teclado.nextDouble();


        System.out.println("Digite Nota 2");
        double result2 = teclado.nextDouble();

        System.out.println(calculaNotas(result1,result2));


    }

    }