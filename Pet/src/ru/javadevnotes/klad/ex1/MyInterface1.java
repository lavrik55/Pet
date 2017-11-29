package ru.javadevnotes.klad.ex1;

public interface MyInterface1 {
    void sayHello();

    default void sayDefault() {
        System.out.println("Вызов метода по-умолчанию sayDefault MyInterface1.");
    }

    default void sayHi() {
        System.out.println("Вызов метода по-умолчанию sayHi MyInterface1.");
    }

    static void sayStatic() {
        System.out.println("Вызов статического метода sayStatic MyInterface1.");
    }
}
