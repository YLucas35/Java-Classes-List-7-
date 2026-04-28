package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bar;

        System.out.println("Digite a pressão da caldeira: (eu irei ler números maiores ou iguais a 10 em valores em bar sobre pressão.");

        do {
            bar = sc.nextInt();
            if (bar < 10) {
                System.out.println("Digite novamente a pressão! (Eu irei aceitar até você digitar um número maior ou igual do que 10 para poder ler em bar).");
            }
        } while (bar < 10);

        System.out.println("Pressão da caldeira alterada para: "+bar);
        sc.close();
    }
}
