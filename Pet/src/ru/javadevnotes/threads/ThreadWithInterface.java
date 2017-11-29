package ru.javadevnotes.threads;

public class ThreadWithInterface implements Runnable {

    Thread thread;

    public ThreadWithInterface() {
        //не обязательно это вызвать в конструкторе, можно и во вне
        thread = new Thread(this, "Демонстрационный поток");
        System.out.println("Дочерний поток создан:" + thread);
        thread.start();
    }

    /**
     * Точка входа во второй поток исполнения
     */
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Дочерний поток:" + i);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен.");
    }
}
