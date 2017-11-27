package oop;

public class Programmer extends AbstractPerson {

    private int linesOfCode;
    public int getLinesOfCode() {
        return linesOfCode;
    }
    public void setLinesOfCode(int linesOfCode) {
        this.linesOfCode = linesOfCode;
    }

    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int getSalary() {
        return linesOfCode*100;
    }
    public int getSalary(int k) { return k*100; }

    @Override
    public String toString() {
        return "Программист.";
    }
}
