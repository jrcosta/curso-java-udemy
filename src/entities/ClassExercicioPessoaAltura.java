package entities;

public class ClassExercicioPessoaAltura {
    
    private String nome;
    private int idade;
    private double altura;

    public ClassExercicioPessoaAltura(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public ClassExercicioPessoaAltura() {
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
    }

}
