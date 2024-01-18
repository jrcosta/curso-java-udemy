import java.util.Scanner;
public class EstruturasSequenciaisExercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double largura, comprimento, valorMetroQuadrado, area, preco;

        System.out.println("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        valorMetroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = area * valorMetroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();

    }
}
