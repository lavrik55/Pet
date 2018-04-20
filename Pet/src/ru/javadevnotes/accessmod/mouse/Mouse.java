package ru.javadevnotes.accessmod.mouse;

import ru.javadevnotes.accessmod.cat.BigCat;
import ru.javadevnotes.accessmod.dog.Lynx;

public class Mouse {
    public static void main(String[] args) {
        /*BigCat cat = new BigCat();
        System.out.println(cat.namePublic);*/
        //System.out.println(cat.colorProtected);
        //System.out.println(cat.hasPaws);
        //System.out.println(cat.id);

        Lynx lynx = new Lynx();
        System.out.println(lynx.namePublic);
        //System.out.println(lynx.colorProtected);
        //System.out.println(lynx.hasPaws);
        //System.out.println(lynx.id);
    }
}
