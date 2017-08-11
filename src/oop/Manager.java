package oop;

public class Manager extends Person {

    private int projectsCount;
    public int getProjectsCount() {
        return projectsCount;
    }
    public void setProjectsCount(int projectsCount) {
        this.projectsCount = projectsCount;
    }

    @Override
    int getSalary() {
        return projectsCount*100;
    }

    @Override
    public String toString() {
        return "Менеджер.";
    }
}
