package ru.javadevnotes.klad.ex1;

public interface MyInterface2 {
    default void sayHi() {
        System.out.println("Вызов метода по-умолчанию sayHi MyInterface2.");
    }
}
