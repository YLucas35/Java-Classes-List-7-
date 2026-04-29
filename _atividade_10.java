package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int piece, turn;
        double plus, media;

        turn = 0;
        plus = 0;

        do {
            turn = turn + 1;
            System.out.println("Digite a quantidade de peças produzidas no "+turn+"º turno.");
            piece = sc.nextInt();
            if (piece < 0) {
                System.out.println("Quantidade de peças inválida, Digite novamente a quantia certa.");
                turn = turn - 1;
            }
            else {
                plus = plus + piece;
            }
        } while (turn < 5);

        media = plus / 5;

        System.out.println("A média de produção por cada turno foi: "+media);
        sc.close();
    }
}
