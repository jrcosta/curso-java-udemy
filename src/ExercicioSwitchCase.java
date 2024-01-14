import java.util.Scanner;

public class ExercicioSwitchCase {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = sc.nextInt();

        String diaSemana;

        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6:
                diaSemana = "Sexta";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + diaSemana);

        sc.close();
    }

}
