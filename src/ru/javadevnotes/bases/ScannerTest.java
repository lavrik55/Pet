package ru.javadevnotes.bases;

import java.util.Scanner;

public class ScannerTest {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();

        System.out.printf("Слово: %s, Число с плавающей запятой: %f, Целое число: %d, Символ: %c",
                "Java", 2.5f, 20, 'e');
        //Слово: Java, Число с плавающей запятой: 2,500000, Целое число: 20, Символ: e
    }
}
