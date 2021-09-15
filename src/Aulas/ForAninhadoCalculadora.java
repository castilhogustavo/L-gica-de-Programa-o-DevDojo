package Aulas;

public class ForAninhadoCalculadora {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Fazendo a tabuada de " + i + ".\n-----------");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
