package entities;

import java.util.Date;

import entities.enums.ExercicioOrderEnum;

public class ClasseExercicioOrderEnum {

    private Integer id;
    private Date moment;
    private ExercicioOrderEnum status;

    public ClasseExercicioOrderEnum() {
    }

    public ClasseExercicioOrderEnum(Integer id, java.util.Date date, ExercicioOrderEnum status) {
        this.id = id;
        this.moment = date;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public Date getMoment() {
        return this.moment;
    }

    public ExercicioOrderEnum getStatus() {
        return this.status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setStatus(ExercicioOrderEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", moment='" + getMoment() + "'" +
                ", status='" + getStatus() + "'" +
                "}";
    }

}
