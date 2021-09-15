package Aulas;

import java.util.Scanner;

public class CadastramentoMilitar {
    public static void main(String[] args) {

        Scanner alistamento = new Scanner(System.in);

        System.out.println("Vamos verificar seu processo de alistamento.\n");

        System.out.println("Qual é o seu sexo? Escreva F ou M.");
        String sexo = alistamento.next();

        System.out.println("Qual é sua idade?");
        int idade = alistamento.nextInt();

        if ((sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) && idade < 18) {
            System.out.println("Alistamento não permitido.");
        } else if (sexo.equalsIgnoreCase("m") && idade >= 18) {
            System.out.println("Alistamento obrigatório!");
        }

        if (sexo.equalsIgnoreCase("f") && idade >= 18) {
            System.out.println("Deseja se alistar? Digite S ou N.");
            String resposta = alistamento.next();

            if (resposta.equalsIgnoreCase("s")) {
                System.out.println("Bem vinda ao alistamento militar.");
            } else {
                System.out.println("Você está liberada!");
            }
        }
    }
}
