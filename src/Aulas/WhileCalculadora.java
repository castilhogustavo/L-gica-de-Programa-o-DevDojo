package Aulas;

import java.util.Scanner;

public class WhileCalculadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Vamos fazer uma tabuada da sua escolha. Escolha um número: ");
        int numero = input.nextInt();

        int contador = 0;

        while (contador <= 10) {
            int conta = numero * contador;
            System.out.println(numero + " x " + contador + " = " + conta);
            contador = contador + 1;
        }
    }
}
