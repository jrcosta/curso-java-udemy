import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ClasseExercicioFuncionario;

public class ProgramExercicioListFuncionario {
    
    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Quantos funcionários serão registrados? ");
            int n = sc.nextInt();
            
            List<ClasseExercicioFuncionario> list = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                System.out.println();
                System.out.println("Funcionário #" + (i + 1) + ":");
                System.out.print("Id: ");
                int id = sc.nextInt();
                System.out.print("Nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.print("Salário: ");
                String salario = sc.nextLine();
                list.add(new ClasseExercicioFuncionario(id, nome, salario));
            }
            
            System.out.println();
            System.out.print("Entre com o id do funcionário que terá aumento de salário: ");
            int id = sc.nextInt();
            ClasseExercicioFuncionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if (func == null) {
                System.out.println("Este id não existe!");
            } else {
                System.out.print("Entre com a porcentagem:");
                double porcentagem = sc.nextDouble();
                func.aumentarSalario(porcentagem);
            }
            
            System.out.println();
            System.out.println("Lista de funcionários:");
            for (ClasseExercicioFuncionario obj : list) {
                System.out.println(obj);
            }
            
            sc.close();    
    }

}
