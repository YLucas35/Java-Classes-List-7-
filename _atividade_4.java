package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double level;

        System.out.print("Informe o nível atual do tanque (limite de 0 a 100 em porcentagem!): ");

        do {
            level = sc.nextDouble();
            if (level < 80) {
                System.out.println("Status: Enchendo "+level+"%... ");
            }
        } while (level < 80);

        System.out.println("Nível de segurança atingido ("+level+"%). Desligando bomba!");
        sc.close();
    }
}
