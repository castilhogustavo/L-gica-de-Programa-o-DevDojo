package Aulas;

public class TorneioDeNatacao {
    public static void main(String[] args) {

        String nome = "Gustavo";
        int idade = 20;

        if (idade <= 10) {
            System.out.println(nome + " participará da categoria infantil.");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil.");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria Pré-Adulto.");
        } else {
            System.out.println(nome + " participará da categoria Adulto.");
        }
    }
}
