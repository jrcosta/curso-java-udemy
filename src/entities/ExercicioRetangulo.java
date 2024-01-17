package entities;

public class ExercicioRetangulo {
    
    public double largura;
    public double altura;
    
    public double area() {
        return largura * altura;
    }
    
    public double perimetro() {
        return 2 * (largura + altura);
    }
    
    public double diagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
    
    public String toString() {
        return "AREA = " + String.format("%.2f", area()) + "\n"
                + "PERIMETRO = " + String.format("%.2f", perimetro()) + "\n"
                + "DIAGONAL = " + String.format("%.2f", diagonal());
    }

}
