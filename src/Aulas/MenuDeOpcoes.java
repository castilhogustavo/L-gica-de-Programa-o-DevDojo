package Aulas;

import java.util.Scanner;

public class MenuDeOpcoes {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("*** MENU ***\n1. Calcular Imposto\n2. Depositar Salário\n3. Sair");
            System.out.print("-> ");
            escolha = in.nextInt();
        }

        System.out.println("Processo finalizado.");


    }
}
