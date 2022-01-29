package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Contents{

    private LocalDate date;

    @Override
    public double calculateXp() {
        return XP_STANDARD + 20d;
    }

    public Mentoring() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
