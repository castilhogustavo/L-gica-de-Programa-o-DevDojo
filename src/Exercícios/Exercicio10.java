/*
Fazer a leitura de um valor numérico inteiro e apresentar o valor do número elevado ao quadrado,
ao cubo e a 10, apresentar também a soma total dos três resultados anteriores.
 */

package Exercícios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num = in.nextInt();

        int quadrado = (num * num);
        int cubo = ((num * num) * num);
        double decima = Math.pow(num, 10);
        double soma = quadrado + cubo + decima;

        System.out.println("O valor do número elevado ao quadrado é: " + quadrado + "\nAo cubo: " + cubo + "\nÀ décima: " + decima);
        System.out.println("A soma de todos os valores é igual a: " + soma);
    }
}
