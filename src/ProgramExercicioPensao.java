import java.util.Locale;
import java.util.Scanner;

import entities.ClassExercicioPensao;

public class ProgramExercicioPensao {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        ClassExercicioPensao[] vect = new ClassExercicioPensao[10];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Aluguel #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            System.out.println();
            vect[quarto] = new ClassExercicioPensao(nome, email);
        }

        System.out.println("Quartos ocupados:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
        
    }

}
