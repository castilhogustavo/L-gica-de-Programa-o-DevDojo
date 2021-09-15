package Aulas;

import java.util.Scanner;

public class DadosDoTeclado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os dados do competidor para saber em qual categoria irá participar!" + "\n");

        System.out.println("Digite o nome do competidor: ");
        String nome = teclado.nextLine();

        System.out.println("Digite a idade do competidor: ");
        int idade = teclado.nextInt();

        System.out.println("O nome do competidor é: " + nome + ". Sua idade é: " + idade + ". \n");

        if (idade <= 10) {
            System.out.println(nome + " participará da categoria infantil.");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil.");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria Pré-Adulto.");
        } else {
            System.out.println(nome + " participará da categoria Adulto.");
        }

    }
}
