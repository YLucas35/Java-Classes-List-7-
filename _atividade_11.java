package Java_Lista_7_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount, kwh;

        amount = 0;

        do {
            System.out.println("Informe o seu consumo em kWh");
            kwh = sc.nextDouble();
            amount = amount + kwh;
            System.out.println("Consumo acumulado atual: "+amount+" kWh");
        } while (amount < 500);

        System.out.println("Limite de 500 kWh atingido ou superado!");
        sc.close();
    }
}
