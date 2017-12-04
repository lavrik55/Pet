package ru.javadevnotes.klad.ex6_7_8_9;

import ru.javadevnotes.klad.ex6_7_8_9.serial.First;
import ru.javadevnotes.klad.ex6_7_8_9.serial.ProcessorImpl;

import java.io.*;

public class MainEx8Writer {
    public static void main(String[] args) {
        System.out.println("Тема: сериализация объекта, transient поля, serialVersionUID.");
        System.out.println("-----");

        testWrite();
    }

    private static void testWrite() {
        First first = new First();
        first.setFirstCode("FirstCode");
        first.setFirstName("FirstName");
        //first.setFirstOther("FirstOther");
        first.setProcessor(new ProcessorImpl()); //не Serializable, если закомментировать, то работать будет

        try (FileOutputStream fs = new FileOutputStream("klad.ex6_7_8_9.dat"); //байтовый поток, позволяющий что-либо записать в файл, можно было взять другой выходной поток
             ObjectOutputStream oos = new ObjectOutputStream(fs)) {

            oos.writeObject(first);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
