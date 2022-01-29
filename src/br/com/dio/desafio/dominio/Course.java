package br.com.dio.desafio.dominio;

public class Course extends Contents{

    private int Workload;

    @Override
    public double calculateXp() {
        return XP_STANDARD * Workload;
    }

    public Course() {
    }


    public int getWorkload() {
        return Workload;
    }

    public void setWorkload(int Workload) {
        this.Workload = Workload;
    }

    @Override
    public String toString() {
        return "Cuouse{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", Workload=" + Workload +
                '}';
    }
}
