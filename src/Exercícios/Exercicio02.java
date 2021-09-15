/*
Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de um funcionário.
Após o cálculo o programa deve apresentar o salário base e o salário líquido calculado.

SB = HT * VH
TD = (PD / 100) * SB
SL = SB  - TD

Onde:
SB =  Salário Base
HT = Horas Trabalhadas
VH = Valor Hora de trabalho
TD = Total de Descontos
PD = Percentual de Desconto
SL = Salário Líquido
 */

package Exercícios;

public class Exercicio02 {
    public static void main(String[] args) {

        int ht = 160;
        int vh = 8;
        double sb = ht * vh;
        double pd = 10;
        double td = (pd / 100) * sb;
        double sl = sb - td;

        System.out.println("Seu salário base é de R$" + sb + "." + "\nSeu salário líquido é de R$" + sl + ".");
    }
}
