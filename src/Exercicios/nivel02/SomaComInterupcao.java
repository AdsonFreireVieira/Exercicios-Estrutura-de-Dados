package Exercicios.nivel02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaComInterupcao {

    public static int SomarList(List<Integer> listNums) {

        int somar = 0;
        for (int i = 0; i < listNums.size(); i++) {

            somar = somar + listNums.get(i);

        }

        return somar;
    }

    public static void main(String[] args) {
            System.out.println("Digite 0 para finalizar");

            Scanner teclado = new Scanner(System.in);
            List<Integer> soma = new ArrayList<>();
          int valor ;

            do {
                 valor = teclado.nextInt();
                 if(valor !=0){
                     soma.add(valor);
                 }
            }
            while (valor != 0) ;

           System.out.println("Soma dos Valores " + soma.stream().mapToInt(Integer::intValue).sum());

           // System.out.println("Soma: " + SomarList(soma));
        }


    }
