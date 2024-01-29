package ExercicioTrabalhador;

import java.util.Date;

public class ContratoHoras {
    
    private Date data;
    private Double valorPorHora;
    private Integer horas;

    public ContratoHoras() {
    }

    public ContratoHoras(Date data, Double valorPorHora, Integer horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorPorHora() {
        return this.valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return this.horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double valorTotal() {
        return this.valorPorHora * this.horas;
    }

}
