package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pieces;
        int count;

        count = 0;

        System.out.println("Fale se a peça está ruim ou não, se não estiver: digite OK, se caso estiver digite DEFEITO para indicar que tal peça é defeituosa, o programa só para até ter pelo menos 5 peças com defeito.");

        do {
            pieces = sc.nextLine();
            if (pieces.equalsIgnoreCase("DEFEITO")) {
                count = count + 1;
                System.out.println("Peça em mal estado registrada.");
            }
            else if (pieces.equalsIgnoreCase("OK")) {
                System.out.println("Peça em bom estado registrada.");
            }
            else {
                System.out.println("ERRO: estado de peça inválido, Apenas digite se a peça está OK para boa e DEFEITO para ruim.");
            }
        } while (count < 5);

        System.out.println("Produção finalizada, peças com defeito contadas.");
    }
}
