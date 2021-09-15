/*
Escreva uma rotina capaz de calcular e apresentar o valor do volume de uma lata de óleo, utilize a fórmula abaixo.

V = piR^2 * A

Onde:
    V = Volume
    pi = 3.141592654
    R = Raio da circunferência da lata
    A = Altura da lata
    OBS: O volume deve ser apresentado com a unidade de medida correto cm3.
 */

package Exercícios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Informe o raio de circunferência da lata (em cm): ");
        int raio = in.nextInt();

        System.out.print("Informe a altura da lata (em cm): ");
        int altura = in.nextInt();

        double volume = (3.14 * (raio * raio) * (altura));

        System.out.println("O volume da lata é igual a " + volume + "cm³.");
    }
}
