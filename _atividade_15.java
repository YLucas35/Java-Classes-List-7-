package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time, hours, count;

        count = 0;
        hours = 0;

        do {
            count = count + 1;
            System.out.println("Digite o tempo da  missão do drone (irei ler números em horas)");
            time = sc.nextInt();
            hours = hours + time;
        } while (hours < 20);
        System.out.println("Tempo limite para manutenção atingido, deixe o drone na ala de manutenção");
        sc.close();
    }
}
