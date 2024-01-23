package entities;

public class ClassExercicioAluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f", notaFinal());
    }

    public Object pontosFaltantes() {
        return 60.0 - notaFinal();
    }

}
