package Aulas;

import java.util.Scanner;

public class WhileNumerosImpares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int contador = 1;
        int userChoice = input.nextInt();

        while (contador <= userChoice) {
            System.out.println("Contador: " + contador);
            contador = contador + 2;
        }

    }
}
