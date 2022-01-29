package br.com.dio.desafio.dominio;

public abstract class Contents {

    protected static final double XP_STANDARD = 10d;

    private String title;
    private String description;

    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
