package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Content{

    private LocalDate date;

    @Override
    public double calculateXP() {
        return initialXP + 20d;
    }

    public Mentorship() {
    }

    public LocalDate getData() {
        return date;
    }

    public void setData(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title ='" + getTitle() + '\'' +
                ", description ='" + getDescription() + '\'' +
                ", date =" + date +
                '}';
    }
}