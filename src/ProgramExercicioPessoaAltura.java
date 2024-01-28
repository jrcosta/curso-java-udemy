import java.util.Locale;
import java.util.Scanner;

import entities.ClassExercicioPessoaAltura;

public class ProgramExercicioPessoaAltura {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai cadastrar? ");
        int n = sc.nextInt();

        ClassExercicioPessoaAltura[] vect = new ClassExercicioPessoaAltura[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.println();
            vect[i] = new ClassExercicioPessoaAltura(nome, idade, altura);
        }

        double soma = 0.0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();
        }

        int cont = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                cont++;
            }
        }

        double percent = (double) cont / vect.length * 100;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }
    
        double media = soma / vect.length;

        System.out.printf("Altura média: %.2f%n", media);

        sc.close();
    }

}
