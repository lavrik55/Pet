package ru.javadevnotes.oop;

public interface Payable {
    /*
    Чтобы реализовать интерфейс, в классе должен быть реализован полный набор методов,
    определенных в интерфейса
     */
    void payForCorpor(int sum) ;
    void payForWoman() ;

    //можно и совместно используемые контакты использовать
    public int WOMEN_COUNT = 15;

    /**
     * В Java 8 теперь можно создавать интерфейсы с конкретными методам, тем самым не нарушая
     * существующий код других классов
     */
    default void concrMethod() {
        System.out.println("Вызов дефолтного метода concrMethod интерфейса в самом интерфейса.");
    }

    default void concrMethod2() {
        System.out.println("Вызов дефолтного метода concrMethod2 интерфейса в самом интерфейса.");
    }
}
