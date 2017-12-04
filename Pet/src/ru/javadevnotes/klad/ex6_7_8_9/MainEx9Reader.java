package ru.javadevnotes.klad.ex6_7_8_9;

import ru.javadevnotes.klad.ex6_7_8_9.serial.Second;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainEx9Reader {
    public static void main(String[] args) {
        System.out.println("Тема: сериализация объекта, интерфейс Externalizable.");
        System.out.println("-----");

        testRead();
    }

    private static void testRead() {
        try (FileInputStream fs = new FileInputStream("klad.ex9.dat");
             ObjectInputStream ois = new ObjectInputStream(fs)) {

            Second first = (Second)ois.readObject();
            System.out.println(first.getFirstCode());
            System.out.println(first.getFirstName());
            System.out.println(first.getSecondCode());
            System.out.println(first.getSecondName());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
