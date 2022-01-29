package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    //private static final Object SubscribedContent = null;
    private String name;
    private Set<Contents> subscribedContent = new LinkedHashSet<>();
    private Set<Contents> ContentsCompleted = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getDevsSubscribers().add(this);
    }

    public void progress() {
        Optional<Contents> contents = this.subscribedContent.stream().findFirst();
        if(contents.isPresent()) {
            this.ContentsCompleted.add(contents.get());
            this.subscribedContent.remove(contents.get());
        } else {
            System.err.println("You are not enrolled in any content!");
        }
    }

    public double calculateTotalXp() {
        return this.ContentsCompleted
                .stream()
                .mapToDouble(Contents::calculateXp)
                .sum();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Contents> getsubscribedContent() {
        return subscribedContent;
    }

    public void setsubscribedContent(Set<Contents> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Contents> getContentsCompleted() {
        return ContentsCompleted;
    }

    public void setContentsCompleted(Set<Contents> ContentsCompleted) {
        this.ContentsCompleted = ContentsCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(ContentsCompleted, dev.ContentsCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, ContentsCompleted);
    }
}
