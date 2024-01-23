import java.util.Scanner;

public class ProgramExercicioEntradaDados1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        var x = "";
        x = sc.next();

        System.out.println("Você digitou: " + x);

        sc.close();
    }

}
