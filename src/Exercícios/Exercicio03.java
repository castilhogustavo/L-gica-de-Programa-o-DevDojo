/*
Escreva um programa que realize a conversão de graus Celsius (C)  para graus Fahrenheit (F). Utilize a fórmula abaixo:

F = ((9 * C) / 5) + 32
 */

package Exercícios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Escolha o valor de Celsius para converter em Fahrenheit: ");
        int c = in.nextInt();

        int f = ((9 * c) / 5) + 32;

        System.out.println("O valor convertido em F é igual a: " + f + "ºF.");
    }
}
