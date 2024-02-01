package ExercicioTrabalhador;

import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ExercicioTrabalhador.entities.Departamento;
import ExercicioTrabalhador.entities.Trabalhador;
import ExercicioTrabalhador.entities.enums.NivelTrabalhador;

public class Program {
    
    public static void main(String[] args) throws ParseException {
     
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();

        System.out.println("Entre com os dados do trabalhador:");
        System.out.print("Data (DD/MM/YYYY): ");
        String dataString = sc.next();
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nível: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos para esse trabalhador? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            dataString = sc.next();
            data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int horas = sc.nextInt();
            ContratoHoras contrato = new ContratoHoras(data, valorPorHora, horas);
            trabalhador.adicionarContrato(contrato);
        }

        System.out.println();
        System.out.print("Entre com o mês e o ano para calcular a renda (MM/YYYY): ");
        dataString = sc.next();

        int mes = Integer.parseInt(dataString.substring(0, 2));
        int ano = Integer.parseInt(dataString.substring(3));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda para " + dataString + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));

        sc.close();
        
    }

}
