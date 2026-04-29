package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int box, peso, count;

        count = 0;
        peso = 0;

        do {
            count = count + 1;
            System.out.println("Adicione o peso da "+count+"º caixa (em kg), o veículo aguenta até 1000 kg");
            box = sc.nextInt();
            peso = peso + box;
            if (peso > 1000) {
                System.out.println("Limite de peso de carga do veículo ultrapassado, TIRE A CAIXA IMEDIATAMENTE ANTES QUE O VEÍCULO SE QUEBRE.");
            }
        } while (peso <= 1000);

        System.out.println("Limite de peso de carga do veículo atingido ou superado.");
        sc.close();
    }
}
