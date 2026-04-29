package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        System.out.println("Digite a senha:");

        do {
            senha = sc.nextInt();
            if (senha != 1234) {
                System.out.println("Senha incorreta, digite novamente.");
            }
        } while (senha != 1234);

        System.out.println("Bem vindo ADM!");
        sc.close();
    }
}
