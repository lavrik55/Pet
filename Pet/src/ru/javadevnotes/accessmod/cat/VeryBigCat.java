package ru.javadevnotes.accessmod.cat;

import ru.javadevnotes.accessmod.dog.Lynx;

import java.util.Objects;

public class VeryBigCat extends BigCat {

    String veryBigCatProp;
    String commonProp = "VeryBigCat commom";
    int random;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VeryBigCat that = (VeryBigCat) o;
        return random == that.random &&
                Objects.equals(veryBigCatProp, that.veryBigCatProp) &&
                Objects.equals(commonProp, that.commonProp);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), veryBigCatProp, random);
    }

    @Override
    public void commonMethod() {
        System.out.println("verybigcat common method");
    }

    public static void main(String[] args) {
        /*BigCat cat = new BigCat();
        System.out.println(cat.namePublic);
        System.out.println(cat.colorProtected);
        System.out.println(cat.speciesPackagePrivate);*/
        //System.out.println(cat.id);

        Lynx lynx = new Lynx();
        System.out.println(lynx.namePublic);
        System.out.println(lynx.colorProtected);
        //System.out.println(lynx.speciesPackagePrivate);
        //System.out.println(lynx.id);
    }
}
