package entities;

public class ExercicioProdutoVetor {
    
    private String name;
    private double price;

    public ExercicioProdutoVetor(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNmae() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

}
