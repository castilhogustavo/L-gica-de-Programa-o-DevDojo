package Aulas;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um número de 1 a 7: ");
        int dia = input.nextInt();

        if (dia == 1) {
            System.out.println("Hoje é segunda-feira. Que saco!");
        } else if (dia == 2) {
            System.out.println("Hoje é terça-feira. ZzZz...");
        } else if (dia == 3) {
            System.out.println("Hoje é quarta-feira. Forças, guerreiro!");
        } else if (dia == 4) {
            System.out.println("Hoje é quinta-feira. Tá quase lá.");
        } else if (dia == 5) {
            System.out.println("Hoje é sexta-feira. Uhu, sextou!");
        } else if (dia == 6) {
            System.out.println("Hoje é sábado. Party hard! Tuts tuts.");
        } else if (dia == 7) {
            System.out.println("Hoje é domingo. Já acabou? :(");
        } else {
            System.out.println("Escolha um dia válido.");
        }
    }
}
