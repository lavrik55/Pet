package ru.javadevnotes.klad.ex6_7_8_9;

import ru.javadevnotes.klad.ex6_7_8_9.serial.Second;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainEx9Writer {
    public static void main(String[] args) {
        System.out.println("Тема: сериализация объекта, интерфейс Externalizable.");
        System.out.println("-----");

        testWrite();
    }

    private static void testWrite() {
        Second first = new Second();
        first.setFirstCode("FirstCode");
        first.setFirstName("FirstName");
        first.setSecondCode("SecondCode");
        first.setSecondName("SecondName");

        try (FileOutputStream fs = new FileOutputStream("klad.ex9.dat"); //байтовый поток, позволяющий что-либо записать в файл, можно было взять другой выходной поток
             ObjectOutputStream oos = new ObjectOutputStream(fs)) {

            oos.writeObject(first);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
