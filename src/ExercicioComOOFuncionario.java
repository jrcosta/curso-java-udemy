import java.util.Locale;
import java.util.Scanner;

import entities.ExercicioFuncionario;

public class ExercicioComOOFuncionario {
    
    public static void main(String[] args) {
        
        ExercicioFuncionario funcionario = new ExercicioFuncionario();
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + funcionario);

        System.out.println();
        System.out.print("Digite a porcentagem para aumentar o salário: ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);

        sc.close();

    }

}
