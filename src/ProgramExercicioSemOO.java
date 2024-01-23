import java.util.Scanner;

public class ProgramExercicioSemOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com as medidas do triângulo X:");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Entre com as medidas do triângulo Y:");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Área de X = %.4f%n", areaX);
        System.out.printf("Área de Y = %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }

        scanner.close();

    }
}