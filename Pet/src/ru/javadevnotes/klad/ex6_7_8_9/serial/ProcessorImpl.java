package ru.javadevnotes.klad.ex6_7_8_9.serial;

public class ProcessorImpl implements Processor {
    @Override
    public String processor(String code, String name) {
        return code + ": " + name;
    }
}
