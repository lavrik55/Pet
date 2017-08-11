package oop;

public class Programmer extends Person {

    private int linesOfCode;
    public int getLinesOfCode() {
        return linesOfCode;
    }
    public void setLinesOfCode(int linesOfCode) {
        this.linesOfCode = linesOfCode;
    }

    @Override
    int getSalary() {
        return linesOfCode*100;
    }

    @Override
    public String toString() {
        return "Программист.";
    }
}
