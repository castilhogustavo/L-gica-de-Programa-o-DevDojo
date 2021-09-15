package Aulas;

public class CalculadoraImpostoDeRenda {
    public static void main(String[] args) {

        double salario = 5000D;

        if (salario <= 1903.98) {
            System.out.println("Você é isento do Imposto de Renda.");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("Você precisa pagar 7,5% (R$" + (salario * 0.075) + ") ao Imposto de Renda.");
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("Você precisa pagar 15% (R$" + (salario * 0.15) + ") ao Imposto de Renda.");
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("Você precisa pagar 22,5% (R$" + (salario * 0.225) + ") ao Imposto de Renda.");
        } else {
            System.out.println("Você precisa pagar 27,5% (R$" + (salario * 0.275) + ") ao Imposto de Renda.");
        }
      }
    }
