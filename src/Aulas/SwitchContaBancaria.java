package Aulas;

import java.util.Scanner;

public class SwitchContaBancaria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu tipo de conta.\nPara Poupança, digite 1.\nPara Corrente, digite 2.\nPara Investimento, digite 3.");
        int conta = input.nextInt();

        switch (conta) {
            case 1:
                System.out.println("Seus juros são de 0,05%.");
                break;
            case 2:
                System.out.println("Seus juros são de 0,02%.");
                break;
            case 3:
                System.out.println("Seus juros são de 0,1%.");
                break;
            default:
                System.out.println("Digite um tipo de conta válido.");
                break;
        }

        System.out.println("\nFim do programa!");

    }
}
