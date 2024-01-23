package entities;

public class ClassExercicioProductEncapsulamento {

    private String name;
    private double price;
    private int quantity;

    public ClassExercicioProductEncapsulamento() {
    }

    public ClassExercicioProductEncapsulamento(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public ClassExercicioProductEncapsulamento(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double totalValueInStock() {
        return this.price * this.quantity;
    }

    public void addProducts(int quantity) {
       if (quantity > 0) {
            this.quantity += quantity;
            System.err.println("Quantity added: " + quantity);
        } else if (quantity == 0) {
            System.out.println("Value typed: " + quantity);
            System.out.println("Invalid quantity!");
       }
    }

    public void removeProducts(int quantity) {
        if (quantity > 0) {
            this.quantity -= quantity;
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    public String toString() {
        return this.name
                + ", $ "
                + String.format("%.2f", this.price)
                + ", "
                + this.quantity
                + " units, Total: $ "
                + String.format("%.2f", this.totalValueInStock());
    }

}
