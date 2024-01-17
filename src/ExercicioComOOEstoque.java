import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class ExercicioComOOEstoque {
    
    public static void main(String[] args) {
            
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
    
            ExercicioEstoque produto = new ExercicioEstoque();
    
            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            produto.name = sc.nextLine();
            System.out.print("Price: ");
            produto.price = sc.nextDouble();
            System.out.print("Quantity in stock: ");
            produto.quantity = sc.nextInt();
    
            System.out.println();
            System.out.println("Product data: " + produto);
    
            System.out.println();
            System.out.print("Enter the number of products to be added in stock: ");
            int quantity = sc.nextInt();
            produto.addProducts(quantity);
    
            System.out.println();
            System.out.println("Updated data: " + produto);
    
            System.out.println();
            System.out.print("Enter the number of products to be removed from stock: ");
            quantity = sc.nextInt();
            produto.removeProducts(quantity);
    
            System.out.println();
            System.out.println("Updated data: " + produto);
    
            sc.close();

    }

}
