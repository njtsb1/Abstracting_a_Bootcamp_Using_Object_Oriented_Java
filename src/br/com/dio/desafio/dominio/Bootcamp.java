package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initialdate = LocalDate.now();
    private final LocalDate finaldate = initialdate.plusDays(45);
    private Set<Dev> devsSubscribers = new HashSet<>();
    private Set<Contents> contents = new LinkedHashSet<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getinitialdate() {
        return initialdate;
    }

    public LocalDate getfinaldate() {
        return finaldate;
    }

    public Set<Dev> getDevsSubscribers() {
        return devsSubscribers;
    }

    public void setDevsSubscribers(Set<Dev> devsSubscribers) {
        this.devsSubscribers = devsSubscribers;
    }

    public Set<Contents> getContents() {
        return contents;
    }

    public void setContents(Set<Contents> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initialdate, bootcamp.initialdate) && Objects.equals(finaldate, bootcamp.finaldate) && Objects.equals(devsSubscribers, bootcamp.devsSubscribers) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialdate, finaldate, devsSubscribers, contents);
    }
}
