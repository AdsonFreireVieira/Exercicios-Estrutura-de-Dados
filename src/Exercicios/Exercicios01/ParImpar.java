package Exercicios.Exercicios01;

import java.util.Scanner;

public class ParImpar {

    public static String ParImpar(int valor){

        return  (valor % 2==0) ?  "Par": "Impar";

    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

         System.out.println("Digite Valor");
        int valor = teclado.nextInt();

        if(valor !=0) {

            System.out.println(ParImpar(valor));
        }else{
            System.out.println(" 0 Invalido");
        }
    }
}
