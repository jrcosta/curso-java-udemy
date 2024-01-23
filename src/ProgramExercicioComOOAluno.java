import java.util.Locale;
import java.util.Scanner;

import entities.ClassExercicioAluno;

public class ProgramExercicioComOOAluno {
    
    public static void main(String[] args) {
        
        ClassExercicioAluno aluno = new ClassExercicioAluno();
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println();
        System.out.println("FINAL GRADE = " + String.format("%.2f", aluno.notaFinal()));
        
        if (aluno.notaFinal() < 60.0) {
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", aluno.pontosFaltantes()) + " POINTS");
        } else {
            System.out.println("PASS");
        }

        sc.close();

    }

}
