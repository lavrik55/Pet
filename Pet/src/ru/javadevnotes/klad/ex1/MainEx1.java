package ru.javadevnotes.klad.ex1;

public class MainEx1 {
    public static void main(String[] args) {
        System.out.println("Тема: интерфейсы, default-методы, static-методы.");
        System.out.println("-----");
        MyClass1 mc1 = new MyClass1();
        mc1.sayHello();
        mc1.sayDefault();
        mc1.sayHi();
        MyInterface1.sayStatic();
    }
}


