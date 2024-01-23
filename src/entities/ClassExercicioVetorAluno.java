package entities;
import java.text.DecimalFormat;

public class ClassExercicioVetorAluno {
    
    private String nome;
    private int idade;
    private int matricula;
    private double[] notas = new double[3];

    public ClassExercicioVetorAluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNmae() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return this.matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public double getMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / this.notas.length;
    }

    public String getAprovacao() {
        return this.getMedia() >= 7 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Nome: " + this.nome
            + "\nIdade: " + this.idade
            + "\nMatricula: " + this.matricula
            + "\nNotas: " + this.notas[0] + ", " + this.notas[1] + ", " + this.notas[2]
            + "\nMedia: " + df.format(this.getMedia())
            + "\nAprovacao: " + this.getAprovacao()
            + "\n-------------------------";
    }
}
