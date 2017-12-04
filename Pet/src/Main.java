import ru.javadevnotes.oop.AbstractPerson;
import ru.javadevnotes.oop.Manager;
import ru.javadevnotes.oop.Programmer;
import ru.javadevnotes.threads.ThreadWithClass;
import ru.javadevnotes.threads.ThreadWithInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

/**
 * Главный класс приложения
 */
public class Main {

    //константы всегда большими буквами
    private final static String WELCOME_TEXT = "Да будут базовые знания!"; //константа, переменная не может менять своего значения в процессе выполнения программы

    public static void main(String[] args) {
	    System.out.println(WELCOME_TEXT);

	    LocalDate ld = LocalDate.of(2018, Month.APRIL, 30);
	    ld = ld.plusDays(2);
	    ld = ld.plusYears(3);
        System.out.println(ld.getYear() + " " + ld.getMonth() + " " + ld.getDayOfMonth());

	    List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);

        LocalDateTime now = LocalDateTime.now();
        String time1Str = "9:00";
        String time2Str = "18:00";
        LocalDateTime time1 = now.withHour(Integer.parseInt(time1Str.split(":")[0])).withMinute(Integer.parseInt(time1Str.split(":")[1])).withSecond(0);
        LocalDateTime time2 = now.withHour(Integer.parseInt(time2Str.split(":")[0])).withMinute(Integer.parseInt(time2Str.split(":")[1])).withSecond(0);
        //проверим текущее время находится внутри установленного промежутка времени
        if (time1.isBefore(now) && now.isBefore(time2))
            System.out.println("online");
        else
            System.out.println("offline");

        System.out.println();
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
