import oop.Manager;
import oop.Person;
import oop.Programmer;

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

        Person person = new Manager();
        int projectsCount = ((Manager) person).getProjectsCount();
        Manager manager1 = new Manager();
        manager1.setProjectsCount(10);
        Programmer programmer1 = new Programmer();
        programmer1.setLinesOfCode(200);

        List<Person> personList = new ArrayList<>();
        personList.add(manager1);
        personList.add(programmer1);
        for (Person p : personList) {
            p.toString() + " " + p.g
        }
    }
}
