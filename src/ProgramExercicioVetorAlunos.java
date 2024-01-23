import java.util.Locale;
import java.util.Scanner;

import entities.ClassExercicioVetorAluno;

public class ProgramExercicioVetorAlunos {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int n = sc.nextInt();

        ClassExercicioVetorAluno[] alunos = new ClassExercicioVetorAluno[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nAluno #" + (i + 1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Matrícula: ");
            int matricula = sc.nextInt();
            alunos[i] = new ClassExercicioVetorAluno(nome, idade, matricula);
            System.out.println("Notas:");
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                alunos[i].getNotas()[j] = sc.nextDouble();
            }
        }

        System.out.println("\nAlunos cadastrados:");
        for (ClassExercicioVetorAluno aluno : alunos) {
            System.out.println(aluno);
        }

        sc.close();

    }
}
