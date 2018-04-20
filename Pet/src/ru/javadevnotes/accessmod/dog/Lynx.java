package ru.javadevnotes.accessmod.dog;

import ru.javadevnotes.accessmod.cat.BigCat;

public class Lynx extends BigCat {

    @Override
    public void commonMethod() {
        System.out.println("lynx common method");
    }

    public static void main(String[] args) {
        /*BigCat cat = new BigCat();
        System.out.println(cat.namePublic);*/
        //System.out.println(cat.colorProtected);
        //System.out.println(cat.hasPaws);
        //System.out.println(cat.id);

        Lynx lynx = new Lynx();
        System.out.println(lynx.namePublic);
        System.out.println(lynx.colorProtected); //так переменная получает силу protected
        //System.out.println(lynx.hasPaws);
        //System.out.println(lynx.id);
    }
}
