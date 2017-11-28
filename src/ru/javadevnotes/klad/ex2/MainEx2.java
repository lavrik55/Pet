package ru.javadevnotes.klad.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainEx2 {
    public static void main(String[] args) {
        System.out.println("Тема: тестовый файл в Java 6.");
        System.out.println("-----");

        final String fileName = "klad.ex2.txt";

        //List<String> list = readList_6(fileName);
        //List<String> list = readListClassic(fileName);
        List<String> list = readListLines(fileName);
        /*for(String s : list) {
            System.out.println(s);
        }*/
        list.forEach(System.out::println);

        //Самый тру метод Java 8
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
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
     * Java 8 lines
     */
    private static List<String> readListLines(String fileName) {
        List<String> result = new LinkedList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            //br returns as stream and convert it into a List
            result = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
