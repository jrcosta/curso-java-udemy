import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class ProgramExercicioComOORetangulo {
    
    public static void main(String[] args) {
        
        ClassExercicioRetangulo retangulo = new ClassExercicioRetangulo();
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a largura e altura do retângulo:");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.println(retangulo);

        sc.close();

    }

}
