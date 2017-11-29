package ru.javadevnotes.bases;

public class PrimitiveTypes {

    byte a = 10; //8-битное знаковое целое число, от -128 до 127
    short b = 2404; //16-битное знаковое целое число, от -32768 до 32767
    int c = 200000; //32-битное знаковое целое число, от -2'147'483'648 до 2'147'483'647.
    long d = 15000L; //64-битное знаковое целое число, от -9'223'372'036'854'775'808 до 9'223'372'036'854'775'807
    float e = 120.0f; //​32-битное знаковое число с плавающей запятой одинарной точности
    double f = 15.72775; //​64-битное знаковое число с плавающей запятой двойной точности
    boolean g = true;
    char h = 'A'; //16-битный тип данных, предназначенный для хранения символов в кодировке Unicode, от '\u0000' или 0 до '\uffff' или 65,535

    public void write() {
        int x = 1, y = 2, z = 3;
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
        x = y = z = 10; //присвоить значение 10 переменным x, y, z
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
    }

    public void switchEx() {
        int a = 3;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            case 5:
                System.out.println("a = 5");
                break;
            default:
                System.out.println("Ни один из case не сработал");
        }
    }
}
