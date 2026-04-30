package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalpieces, goodpieces, defects;
        double lostpieces;
        String status;

        totalpieces = 0;
        goodpieces = 0;
        defects = 0;

        do {
            totalpieces = totalpieces + 1;
            System.out.print("Qual o status da "+totalpieces+"º peça? (Se estiver boa digite OK e se estiver ruim digite DEFEITO): ");
            status = sc.next().toUpperCase();

            if (status.equals("OK")) {
                goodpieces = goodpieces + 1;
            } else if (status.equals("DEFEITO")) {
                defects = defects + 1;
            }
        } while (totalpieces < 50 && defects < 5);

        lostpieces = (defects * 100.0) / totalpieces;

        System.out.println("Quantidade total de peças produzidas: "+totalpieces);
        System.out.println("Quantidade total de peças boas: "+goodpieces);
        System.out.println("Quantidade total de peças refugo (Defeituosas): "+defects);
        System.out.printf("Porcentagem de perda: %.2f%n", lostpieces);

        if (defects >= 5) {
            System.out.println("ALERTA: Produção interrompida por excesso de Refugos! (Peças defeituosas).");
        }
        sc.close();
    }
}
