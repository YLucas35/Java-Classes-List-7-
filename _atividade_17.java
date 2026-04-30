package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class atividade_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;

        System.out.println("escreva a quantidade de dias que voce fez a manutemçao");

        do {
            dia = sc.nextInt();
            System.out.println("Dia inválido para fazer a manuteção, tente colocar outro dia");
        }while (dia < 1 || dia > 31);

        System.out.println("Dia de manutenção marcada para o dia: "+dia);
        sc.close();
    }
}
