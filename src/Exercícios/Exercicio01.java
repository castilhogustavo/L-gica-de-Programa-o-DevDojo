/*
Baseado na fórmula abaixo escreva um programa que calcule e apresente a área de um círculo.

A = piR^2

Onde:
     A representa a área do círculo
     pi = 3.14
     R = Raio do círculo (deve ser fornecido pelo usuário)
*/

package Exercícios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Forneça o raio do círculo (em cm): ");
        int raio = in.nextInt();

        double a = 3.14 * (raio * raio);

        System.out.println("O valor da área é igual a: " + a + " cm.");
    }
}
