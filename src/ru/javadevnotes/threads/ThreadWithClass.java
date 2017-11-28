package ru.javadevnotes.threads;

public class ThreadWithClass extends Thread {

    public ThreadWithClass() {
        super("Демонстрационный поток");
        System.out.println("Дочерний поток создан:" + this);
        start();
    }

    /**
     * Точка входа во второй поток исполнения
     */
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Дочерний поток:" + i);
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен.");
    }
}
