import oop.Manager;
import oop.AbstractPerson;
import oop.Programmer;
import threads.ThreadWithClass;
import threads.ThreadWithInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    //константы всегда большими буквами
    final static String WELCOME_TEXT = "Да будут базовые знания!"; //константа, переменная не может менять своего значения в процессе выполнения программы


    public static void main(String[] args) {
	    System.out.println(WELCOME_TEXT);


        Random rand = new Random();
        //получить случайное целое число от 0 до 19
        int x = rand.nextInt(20);

        new ThreadWithInterface();
        new ThreadWithClass();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Главный поток:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток завершен.");
        }

        Manager man1 = new Manager("Иван", "Петров");
        man1.sayHello();
        man1.payForCorpor(10);
        man1.concrMethod();
        man1.concrMethod2();

        AbstractPerson person = new Manager("Сергей", "Лавров");
        int projectsCount = ((Manager) person).getProjectsCount();
        Manager manager1 = new Manager("Еще один", "хороший");
        manager1.setProjectsCount(10);
        Programmer programmer1 = new Programmer("программист какой-то", "lastname");
        programmer1.setLinesOfCode(200);
        //programmer1.getSalary()

        List<AbstractPerson> personList = new ArrayList<>();
        personList.add(manager1);
        personList.add(programmer1);
        for (AbstractPerson p : personList) {
            System.out.println(p.toString() + " " + p.getFirstName());
        }
    }
}
