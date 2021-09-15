package Aulas;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Vamos agora criar seu usuário na rede." + "\n\n" + "Por favor, insira seu usuário: ");
        String usuario = user.next();

        if (usuario.equals("") || usuario.equalsIgnoreCase("admin") || usuario.equalsIgnoreCase("administrador")) {
            System.out.println("Nome de usuário inválido. Escolha outro.");
        } else {
            System.out.println(usuario + " cadastrado com sucesso!");
        }
    }
}
