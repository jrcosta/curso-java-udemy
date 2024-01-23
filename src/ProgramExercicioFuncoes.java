import java.util.Scanner;

public class ProgramExercicioFuncoes {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três números inteiros: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(exibirResultado(a, b, c));


        scanner.close();
    }

    public static int maior(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int menor(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static String exibirResultado(int a, int b, int c) {
        return "O maior número é: " + maior(a, b, c) + "\nO menor número é: " + menor(a, b, c);
    }

}
