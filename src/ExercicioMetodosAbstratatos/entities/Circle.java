package ExercicioMetodosAbstratatos.entities;

import ExercicioMetodosAbstratatos.entities.enums.Colors;

public class Circle extends Shape{
    
    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Colors color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}
