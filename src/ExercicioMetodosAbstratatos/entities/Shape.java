package ExercicioMetodosAbstratatos.entities;

import ExercicioMetodosAbstratatos.entities.enums.Colors;

public abstract class Shape {
    
    protected Colors color;

    public Shape() {
    }

    public Shape(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public abstract double area();
    

}
