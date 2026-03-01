package Exercicios.nivel02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Soma {


    // array  separando par

    public static void numerosPar(int[] num){
        List numPar = new ArrayList();

        for(int i=0; i <num.length;i++){
            if(num[i] % 2==0){
                numPar.add(num[i]);
            }

        }
        System.out.println(numPar);
    }

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        int [] numeros = new int[10] ;

        for(int i=0; i<numeros.length;i++){
            System.out.println("Digite o Valor para Psoicao "+ (i+1));
            numeros [i] = teclado.nextInt();
        }

              // Arrays.stream(numeros).filter( n-> n % 2==0).forEach(System.out::print);


        numerosPar(numeros);

    }
}
