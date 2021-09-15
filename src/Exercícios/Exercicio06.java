/*
Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma viagem.
Sabendo que o automóvel tem uma autonomia de 12 Km por litro de combustível, desenvolva o cálculo utilizando a fórmula abaixo:

    D=TV
    LU= D / 12

    Onde:
        D = Distância em Km
        T = Tempo gasto na viagem
        V = Velocidade
 */

package Exercícios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Quanto tempo leva para chegar ao destino (em horas): ");
        int tempo = in.nextInt();

        System.out.print("Qual foi a velocidade média (em km): ");
        int velocidade = in.nextInt();

        int distancia = tempo * velocidade;
        int litrosUsados = distancia / 12;

        System.out.println("Foram utilizados um total de " + litrosUsados + " litros de combustível nessa viagem.");
    }
}
