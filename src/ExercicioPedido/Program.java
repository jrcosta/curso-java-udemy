package ExercicioPedido;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import ExercicioPedido.entities.Client;
import ExercicioPedido.entities.Order;
import ExercicioPedido.entities.OrderItem;
import ExercicioPedido.entities.Product;
import ExercicioPedido.enums.OrderStatus;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        Order order = new Order(new Date(), OrderStatus.valueOf(status));   
        Client client = new Client(name, email, birthDate);
        order.setClient(client);

        for (int i=1; i<=n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(quantity, productPrice);
            order.addItem(it);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
        
    }

}
