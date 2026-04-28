package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar;

        System.out.println("Digite a umidade relativa do ar do seu ambiente de pintura.");

        do {
            ar = sc.nextInt();
            if (ar < 40 || ar > 60) {
                System.out.println("Ambiente Inadequado, procure outro ambiente para poder pintar.");
                System.out.println("Caso tenha achado um outro ambiente (ou o tempo esteja melhorado para o seu ambiente atual) digite novamente a umidade relativa do ar.");
            }
        } while (ar < 40 || ar > 60);

        System.out.println("Ambiente perfeito para pintar, pinte a vontade!");
        sc.close();
    }
}
