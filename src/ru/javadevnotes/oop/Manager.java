package ru.javadevnotes.oop;

public final class Manager extends AbstractPerson implements Payable {

    private int projectsCount;
    public int getProjectsCount() {
        return projectsCount;
    }
    public void setProjectsCount(int projectsCount) {
        this.projectsCount = projectsCount;
    }

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    int getSalary() {
        return projectsCount*100;
    }

    @Override
    public String toString() {
        return "Менеджер.";
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Переопределенный метод абстрактного класса.");
    }
    // ----- реализация интерфейса

    @Override
    public void payForCorpor(int sum) {
        System.out.println(getFirstName() + " " + getLastName() + " paid " + sum);
    }

    @Override
    public void payForWoman() {
        System.out.println(getFirstName() + " заплатил за " + WOMEN_COUNT + " женщин.");
    }

    @Override
    public void concrMethod2() {
        System.out.println("Вызов переопределённого дефолтного метода concrMethod2 интерфейса из класса.");
    }
}
