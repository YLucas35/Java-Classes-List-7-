package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cracha;

        System.out.print("Digite o código do crachá (deve começar com 'SENAI-'): ");

        do {
            cracha = sc.nextLine();

            if (!cracha.startsWith("SENAI-")) {
                System.out.println("Erro: Prefixo inválido! Tente novamente.");
            }

        } while (!cracha.startsWith("SENAI-"));

        System.out.println("Crachá aceito com sucesso: "+cracha);
        sc.close();
    }
}
