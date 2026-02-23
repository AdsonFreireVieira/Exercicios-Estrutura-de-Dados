package Exercicios.nivel01;

import java.util.Scanner;

public class voto {

    public static  String voto(int idade){

       if((idade >=16 && idade <18) || (idade >65)){
           return  "Opcional";
        }else if(idade<16) {

           return  "Menor de Idade";
        }else{
           return "Voto Obrigatorio";
       }


    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite Idade");
        int idade = teclado.nextInt();

        System.out.println(voto(idade));

    }
}
