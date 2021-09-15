package Aulas;

import java.util.Scanner;

public class SwitchCaseDiasDaSemana {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um número de 1 a 7: ");
        int dia = input.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Hoje é segunda-feira. Que saco!");
                break;
            case 2:
                System.out.println("Hoje é terça-feira. ZzZz...");
                break;
            case 3:
                System.out.println("Hoje é quarta-feira. Forças, guerreiro!");
                break;
            case 4:
                System.out.println("Hoje é quinta-feira. Tá quase lá.");
                break;
            case 5:
                System.out.println("Hoje é sexta-feira. Uhu, sextou!");
                break;
            case 6:
                System.out.println("Hoje é sábado. Party hard! Tuts tuts.");
                break;
            case 7:
                System.out.println("Hoje é domingo. Já acabou? :(");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }

        System.out.println("\nFim do programa!");
    }
}
