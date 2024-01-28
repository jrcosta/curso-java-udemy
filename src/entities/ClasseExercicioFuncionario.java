package entities;

public class ClasseExercicioFuncionario {
    
    private int id;
    private String nome;
    private String salario;

    public ClasseExercicioFuncionario(int id, String nome, String salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        double salarioAtualizado = Double.parseDouble(salario) + (Double.parseDouble(salario) * porcentagem / 100);
        salario = String.format("%.2f", salarioAtualizado);
    }

    public String toString() {
        return id + ", " + nome + ", " + salario;
    }

}
