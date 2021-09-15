package Aulas;

import java.util.Scanner;

public class UsandoForCalculadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Escolha um número para fazer a tabuada.\n-> ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
