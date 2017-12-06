package ru.javadevnotes.oop;

public abstract class AbstractPerson /*implements Roarable*/ {

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
    public AbstractPerson() {
        System.out.println("вызов конструктора абстрактоного класса");
    }

    /**
     * Абстрактный метод, должен быть переопределен
     * @return
     */
    abstract int getSalary();

    public void sayHello() {
        System.out.println("Абстрактный класс говорит привет.");
    }

    public final void sayZig() {
        System.out.println("Абстрактный класс говорит zig.");
    }
}
