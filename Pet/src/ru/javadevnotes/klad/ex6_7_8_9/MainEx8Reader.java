package ru.javadevnotes.klad.ex6_7_8_9;

import ru.javadevnotes.klad.ex6_7_8_9.serial.First;

import java.io.*;

public class MainEx8Reader {
    public static void main(String[] args) {
        System.out.println("Тема: сериализация объекта, transient поля, serialVersionUID.");
        System.out.println("-----");

        testRead();
    }

    private static void testRead() {
        try (FileInputStream fs = new FileInputStream("klad.ex6_7_8_9.dat");
             ObjectInputStream ois = new ObjectInputStream(fs)) {

            First first = (First)ois.readObject();
            System.out.println(first.getFirstCode());
            System.out.println(first.getFirstName());
            System.out.println(first.getProcessor()); //transient поле
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
