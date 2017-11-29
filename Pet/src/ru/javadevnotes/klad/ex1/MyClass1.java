package ru.javadevnotes.klad.ex1;

public class MyClass1 implements MyInterface1, MyInterface2 {
    @Override
    public void sayHello() {
        System.out.println("Вызов реализации метода sayHello MyInterface1.");
    }

    @Override
    public void sayHi() {
        System.out.println("Пришлось переопределить метод по-умолчанию sayHi, т.к. у MyInterface1 и MyInterface2 есть уже метод с одинаковой сигнатурой.");
    }
}
