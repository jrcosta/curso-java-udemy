import java.util.Scanner;

public class ExercicioDoWhile {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = 9.0 * celsius / 5.0 + 32.0;

        do {
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
            System.out.println("Digite a temperatura em Celsius: ");
            celsius = sc.nextDouble();
            fahrenheit = 9.0 * celsius / 5.0 + 32.0;
        } while (celsius != 0.0);

        sc.close();

    }
}
