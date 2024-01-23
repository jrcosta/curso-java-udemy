import java.util.Locale;
import java.util.Scanner;

import entities.ExercicioProdutoVetor;

public class ExercicioVetor2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        ExercicioProdutoVetor[] vect = new ExercicioProdutoVetor[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("\nProduct #" + (i + 1) + " data:");
            System.out.print("Product name: ");
            String name = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            vect[i] = new ExercicioProdutoVetor(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double maxPrice = 0.0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getPrice() > maxPrice) {
                maxPrice = vect[i].getPrice();
            }
        }

        double minPrice = 0.0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getPrice() < minPrice) {
                minPrice = vect[i].getPrice();
            }
        }

        double avg = sum / vect.length;

        System.out.println("\nPRICE TAGS:");
        System.out.println("The most expensive product: " + maxPrice);
        System.out.println("The cheapest product: " + minPrice);
        System.out.printf("The average price is: %.2f%n", avg);

        sc.close();
    }

}
