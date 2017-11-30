package ru.javadevnotes.klad.ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class MainEx5 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Тема: форматированный вывод.");
        System.out.println("-----");

        String s = "%1$tY.%1$tm.%1$td %1tR переведена сумма в размере %5.2f руб. по счету №'%s'.%n";
        String answer = String.format(Locale.forLanguageTag("ru"), s, new Date(), 99.8, "AC12345");
        System.out.println(answer);

        //можно вывести прямо в файл сразу
        try (Formatter fm = new Formatter(new File("klad.ex5.txt"))) {
            fm.format(s, new Date(), 99.8, "AC12345");
            fm.format(s, new Date(), 99.8, "AC12345");
            fm.format(s, new Date(), 99.8, "AC12345");
        }
    }
}
