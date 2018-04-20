package ru.javadevnotes.bases;

public enum Seasons {
    WINTER("зима"), SPRING("весна"), SUMMER("лето"), FALL("осень");
    private Seasons(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        //Seasons s = Seasons.WINTER;
        //s = Seasons.SPRING;
    }
}
