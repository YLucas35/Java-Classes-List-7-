package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;
        String adm;

        System.out.println("Insira o seu username.");
        do {
            user = sc.next();
            adm = "ADMIN";
            if (!user.equals(adm)) {
                System.out.println("seu nick esta errado, tente novamente.");
            }
        }while (!user.equals(adm));

        System.out.println("Bem vindo, ADMIN");
        sc.close();
    }
}
