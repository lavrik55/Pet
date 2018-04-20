package ru.javadevnotes.accessmod.cat;

import java.util.Objects;

public class BigCat {
    public String namePublic = "cat";
    protected  String colorProtected = "red";
    String speciesPackagePrivate = "bigcat";
    private int idPrivate;
    String bigCatProp = "";
    String commonProp = "bigcat commom";

    @Override
    public int hashCode() {

        return Objects.hash(namePublic, colorProtected, speciesPackagePrivate, idPrivate, bigCatProp, commonProp);
    }

    protected void commonMethod() {};

    public static void main(String[] args) {
        /*BigCat cat = new BigCat();
        System.out.println(cat.namePublic);
        System.out.println(cat.colorProtected);
        System.out.println(cat.speciesPackagePrivate);
        System.out.println(cat.idPrivate);*/

        BigCat cat1 = new BigCat();
        BigCat cat2 = new BigCat();
        cat2.bigCatProp = null;
        System.out.println(cat1.equals(cat2));
    }

    /*@Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BigCat)) return false;
        BigCat otherCat = (BigCat)obj;
        return bigCatProp.equals(otherCat.bigCatProp);
    }*/
}
