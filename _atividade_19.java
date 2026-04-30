package Java_Lista_7_Faca_Enquanto;

public class _atividade_19 {
    public static void main(String[] args) {
        int rpm,total;

        total = 0;

        do {
            rpm = 500;
            total = total + rpm;
            System.out.println(total+" rpm");
        } while (total<3000);
    }
}
