package ru.javadevnotes.klad.ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;

public class MainEx2 {
    public static void main(String[] args) {
        System.out.println("Тема: тестовый файл в Java 6.");
        System.out.println("-----");

        final String fileName = "klad.ex2.txt";

        List<String> list = readList_6(fileName);
        for(String s : list) {
            System.out.println(s);
        }
    }

    /**
     * Java 6
     */
    private static List<String> readList_6(String fileName) {
        List<String> result = new LinkedList<>();
        try {
            //можно еще указать размер буфера, может пригодиться для оптимизации, по умолчанию 8 Кб,
            //хватает в большинстве случаев
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            try {
                String line;
                while ((line = br.readLine()) != null) {
                    result.add(line);
                }
            } finally {
                br.close(); //внутренние reader'ы и stream'ы тоже закрывает
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Java 8 try-with-resources
     */
    private static List<String> readListClassic(String fileName) {
        List<String> result = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Java 8 try-with-resources
     * https://www.mkyong.com/java8/java-8-stream-read-a-file-line-by-line/
     */
    /*private static List<String> readListClassic(String fileName) {
        List<String> result = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }*/
}
