import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class ProgramExercicioComOOMembrosEstaticos3 {

    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        double c = ClassExercicioCalculatorStatic.circumference(radius);
        
        double v = ClassExercicioCalculatorStatic.volume(radius);
        
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", ClassExercicioCalculatorStatic.PI);
        
        sc.close();

    }
    
}
