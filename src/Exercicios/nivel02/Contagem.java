package Exercicios.nivel02;

//  contage, 1  ate 100
public class Contagem {

    public static  void contagem() {
        for (int i = 1; i <= 100; i++) {

            System.out.print(i + " /");
        }
    }
        public static  void contagemPar() {

            for (int i = 2; i <= 100; i += 2) {

                System.out.print(i + " /");
            }
        }
        public static  void tabuada(int num){

            for(int i = 0; i <= 10; i++) {
                System.out.println(i + " x " + num + " = " + (i * num));
            }


    }

    public static void main(String[] args) {

       // System.out.println("Contagem ate 100");
        //contagem();
        //System.out.println("Contagem Par");
        //contagemPar();
        System.out.println("tabuada");
        tabuada(4);

    }
}
