package ExercicioTrabalhador.entities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import ExercicioTrabalhador.ContratoHoras;
import ExercicioTrabalhador.entities.enums.NivelTrabalhador;

public class Trabalhador {

    private String nome;
    private NivelTrabalhador nivel;
    private Double salarioBase;
    private Departamento departamento;
    private List<ContratoHoras> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return this.nome;
    }

    public NivelTrabalhador getNivel() {
        return this.nivel;
    }

    public Double getSalarioBase() {
        return this.salarioBase;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void adicionarContrato(ContratoHoras contrato) {
        contratos.add(contrato);
    }

    public Double renda(int ano, int mes) {
        double soma = salarioBase;
        for (ContratoHoras contrato : contratos) {
            Date data = contrato.getData();
            LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (localDate.getYear() == ano && localDate.getMonthValue() == mes) {
                soma += contrato.valorTotal();
            }
        }
        return soma;
    }

}
