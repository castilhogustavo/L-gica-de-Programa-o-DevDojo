/*
Escreva um programa que realize a conversão de graus Fahrenheit (F)  para graus Celsius (C). Utilize a fórmula abaixo:
 C = (( F - 32) * 5) / 9
 */

package Exercícios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Escolha o valor de Fahrenheit para converter em Celsius: ");
        int f = in.nextInt();

        int c = ((f - 32) * 5) / 9;

        System.out.println("O valor convertido em C é igual a: " + c + "ºC.");
    }
}
