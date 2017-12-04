package ru.javadevnotes.klad.ex6_7_8_9;

import ru.javadevnotes.klad.ex6_7_8_9.serial.First;
import ru.javadevnotes.klad.ex6_7_8_9.serial.ProcessorImpl;

import java.io.*;

public class MainEx6 {
    public static void main(String[] args) {
        System.out.println("Тема: сериализация объекта, transient поля.");
        System.out.println("-----");

        testWrite();
        testRead();
    }

    private static void testWrite() {
        First first = new First();
        first.setFirstCode("FirstCode");
        first.setFirstName("FirstName");
        first.setProcessor(new ProcessorImpl()); //не Serializable, если закомментировать, то работать будет

        try (FileOutputStream fs = new FileOutputStream("klad.ex6_7_8_9.dat"); //байтовый поток, позволяющий что-либо записать в файл, можно было взять другой выходной поток
            ObjectOutputStream oos = new ObjectOutputStream(fs)) {

            oos.writeObject(first);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
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
