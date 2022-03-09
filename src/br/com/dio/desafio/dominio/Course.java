package br.com.dio.desafio.dominio;

public class Course extends Content{

    private int workload;

    @Override
    public double calculateXP() {
        return initialXP * workload;
    }

    public Course() {
    }


    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course={" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }
}