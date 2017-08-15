package oop;

public abstract class Person {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    abstract int getSalary(); //если класс абстрактный, то класс тоже должен быть абстрактным
    //у абстрактного метода нет тела
    //экземпляр абстрактного класса создать не можем
}
