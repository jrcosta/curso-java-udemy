import java.util.Scanner;

public class ProgramExercicioCondicional2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", conta);

        sc.close();
    }

}
