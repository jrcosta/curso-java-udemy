import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class ExercicioComOOEstoqueEncapsulamento {
    
    public static void main(String[] args) {
            
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
    
            ExercicioProductEncapsulamento produto = new ExercicioProductEncapsulamento();
    
            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            produto.setName(sc.nextLine());
            System.out.print("Price: ");
            produto.setPrice(sc.nextDouble());
            System.out.print("Quantity in stock: ");
            produto.addProducts(sc.nextInt());
    
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
