import java.util.Scanner;

public class ProgramExercicioFor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero ou 0 para sair: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            if (numero % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }
            System.out.println("Digite um numero ou 0 para sair: ");
            numero = sc.nextInt();
            System.out.println("Você verificou " + i + " números");
        }

        sc.close();

    }

}
