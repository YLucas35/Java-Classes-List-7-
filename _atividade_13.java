package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        double totaltime, timemaking, availability;

        count = 1;

        do {
            do {
                System.out.println("Digite o tempo total da "+count+"º máquina ligada (0-24h):");
                totaltime = sc.nextDouble();
                if (totaltime <= 0 || totaltime > 24) {
                    System.out.println("ERRO: O tempo deve estar entre 0 e 24 horas!");
                }
            } while (totaltime <= 0 || totaltime > 24);
            
            do {
                System.out.println("Digite o tempo de produção efetiva da "+count+"º máquina:");
                timemaking = sc.nextDouble();
                if (timemaking < 0 || timemaking > totaltime) {
                    System.out.println("ERRO: O tempo de produção não pode ser negativo ou maior que o tempo total ("+totaltime+"h)!");
                }
            } while (timemaking < 0 || timemaking > totaltime);
            
            availability = (timemaking / totaltime) * 100;
            System.out.printf("A chance de disponibilidade da "+count+"º maquina é de %.2f%n", availability," %!");
            count = count + 1;
        } while (count <= 3);

        System.out.println("A análise das 3 maquinas foram concluídas com sucesso!");
    }
}
