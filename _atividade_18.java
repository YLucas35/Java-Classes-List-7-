package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lance;
        System.out.println("que comecem os lances das peças de um dos carros mais antigos e bonitos e eu irei ler números em reais!!");
        System.out.println("e o valor inicial é de 9000");
        do {
            lance= sc.nextInt();
            if (lance == 9000) {
                System.out.println("Opa! Não vale fazer o mesmo lance não ein?? Hahahaha...");
                System.out.println("quem da mais!?!?!");
                lance= sc.nextInt();
            }

            if (lance < 9000) {
                System.out.println("Lance fraco.");
                System.out.println("quem da mais!?!?!");
            }
        }while (lance < 10000);
        System.out.println("Veeeendido!!! Por: R$"+lance+",00!!");
        sc.close();
    }
}
