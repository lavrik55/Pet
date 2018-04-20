package ru.javadevnotes.accessmod.cat;

import ru.javadevnotes.accessmod.dog.Lynx;

public class CatAdmirer {
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

        BigCat cat1 = new VeryBigCat();
        System.out.println(cat1.commonProp);
        cat1.commonMethod();
        //cat1.bigCatProp
        //VeryBigCat cat2 = (VeryBigCat)new BigCat();
        //cat2.bigCatProp;
        //cat2.veryBigCatProp;
    }

}
