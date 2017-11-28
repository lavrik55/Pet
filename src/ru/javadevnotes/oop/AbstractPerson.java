package ru.javadevnotes.oop;

public abstract class AbstractPerson {

    private String firstName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public AbstractPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Абстрактный метод, должен быть переопределен
     * @return
     */
    abstract int getSalary();

    public void sayHello() {
        System.out.println("Абстрактный класс говорит привет.");
    }
}
