package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alerta;

        System.out.println("Digite 0 para caso a situação da fabrica esteja OK, se não digite 1 para ativar o alerta de EMERGÊNCIA!");


        do {
            alerta = sc.nextInt();
            if (alerta < 0 || alerta > 1) {
                System.out.println("Comando desconhecido, tente novamante.");
            }
            if (alerta == 0) {
                System.out.println("Operação normal, nada aconteceu. (AINDA!)");
            }
            if (alerta == 1) {
                System.out.println("ALERTA!, ALERTA! Algo de ruim aconteceu na fabrica!!");
            }

        } while (alerta < 0 || alerta > 1);
        sc.close();
    }
}
