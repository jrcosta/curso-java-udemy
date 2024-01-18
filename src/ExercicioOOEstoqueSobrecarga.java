import entities.ExercicioOOProductSobrecarga;

public class ExercicioOOEstoqueSobrecarga {
    
    public static void main(String[] args) {
        
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = System.console().readLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(System.console().readLine());
        
        ExercicioOOProductSobrecarga product = new ExercicioOOProductSobrecarga(name, price);

        System.out.println();
        System.out.println("Product data: " + product);
        
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = Integer.parseInt(System.console().readLine());
        product.addProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: " + product);
        
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = Integer.parseInt(System.console().readLine());
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: " + product);
        
    }

}
