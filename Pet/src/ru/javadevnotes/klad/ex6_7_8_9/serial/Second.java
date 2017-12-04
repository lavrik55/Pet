package ru.javadevnotes.klad.ex6_7_8_9.serial;

import java.io.*;

public class Second extends First9 implements Externalizable {

    /*
    Externalizable. Для управления сохранением данных. Используется для сохранение данных класса,
    который про сериализацию ничего не знает. Или нужно сохранить поля, который не сериализуются.
    Т.е. не системы Java управляет сериализацией, а вы.
     */

    private String secondCode;
    private String secondName;


    public String getSecondCode() {
        return secondCode;
    }

    public void setSecondCode(String secondCode) {
        this.secondCode = secondCode;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /*
    Управлять записью объекта в выходной поток
     */
    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(getFirstCode());
        objectOutput.writeUTF(getFirstName());
        objectOutput.writeUTF(getSecondName());
        objectOutput.writeUTF(getSecondCode());
    }

    /*
    Управлять чтением объекта из входящего потока
     */
    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        setFirstCode(objectInput.readUTF());
        setFirstName(objectInput.readUTF());
        setSecondCode(objectInput.readUTF());
        setSecondName(objectInput.readUTF());
    }
}
