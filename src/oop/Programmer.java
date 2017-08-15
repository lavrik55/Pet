package oop;

public class Programmer extends Person {

    private int linesOfCode;
    public int getLinesOfCode() {
        return linesOfCode;
    }
    public void setLinesOfCode(int linesOfCode) {
        this.linesOfCode = linesOfCode;
    }

    public Programmer(String name) {
        super(name); //- возможность обратиться к конструктору родительского класса
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
