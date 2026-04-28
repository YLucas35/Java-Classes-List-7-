package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;

        total = 0;

        do {
            total = total + 1;
            System.out.println("Peça detectada! Total atual: "+total);
        } while (total < 50);

        System.out.println("Lote de 50 peças concluído. Parando esteira...");
        sc.close();
    }
}
