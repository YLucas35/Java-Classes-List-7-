package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp;

        System.out.println("Digite a temperatura miníma para a sua extrussora: (eu irei ler em números os graus célsius e o valor precisa ser maior que 180, ou seja: 180º C");

        do {
            temp = sc.nextInt();
            if (temp <= 180) {
                System.out.println("Temperaura inválida, tente novamente!");
            }
        } while (temp <= 180);

        System.out.println("Mudando a temperatura para: "+temp+"º C.");
        System.out.println("Temperatura alterada com sucesso!");
        sc.close();
    }
}
