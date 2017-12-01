package ru.javadevnotes.klad.ex6.serial;

import java.io.Serializable;

public class First implements Serializable {
    private String firstCode;
    private String firstName;

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
}
