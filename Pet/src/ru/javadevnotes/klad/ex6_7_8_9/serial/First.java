package ru.javadevnotes.klad.ex6_7_8_9.serial;

import java.io.Serializable;

public class First implements Serializable {

    /*
    Говорит reader'у, мол, новое поле появилось, ну и ничего страшного. Если какие-то поля непонятны,
    то и фиг с ними. Если мелочь какая-то изменилось, позволяет плавно перейти на новую функциональность.
    Если бы не было этого поля и Writer сериализовал бы с новой версией описания класса, а Reader читал бы со старой, то
    была бы ошибка, что мол serialVersionUID разный.
     */
    private static final long serialVersionUID = 199L;

    private String firstCode;
    private String firstName;
    private transient Processor processor;
    /*private String firstOther;


    public String getFirstOther() { return firstOther; }

    public void setFirstOther(String firstOther) { this.firstOther = firstOther; }*/

    public String getFirstCode() {
        return firstCode;
    }

    public void setFirstCode(String firstCode) {
        this.firstCode = firstCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

}
