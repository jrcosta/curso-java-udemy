import java.util.Scanner;

public class ExercicioDeDebug {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double circunferencia = calculaCircunferencia(raio);

        double volume = calculaVolume(raio);

        System.out.printf("Circunferência: %.2f%n", circunferencia);
        System.out.printf("Volume: %.2f%n", volume);

        System.out.printf("Valor de PI: %.2f%n", Math.PI);

        sc.close();

    }

    public static double calculaCircunferencia(double raio) {
        return 2.0 * Math.PI * raio;
    }

    public static double calculaVolume(double raio) {
        return 4.0 * Math.PI * raio * raio * raio / 3.0;
    }

}
