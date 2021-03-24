package com.codecool.farm.animal;

public abstract class Animal {

    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract void feed();
}
/*
Animal osztály
Helye: com.codecool.farm.animal package
Tartalmazza a következő field-et:
méret int size
Az állatok mérete nem állítható a constructor-al, alapértelmezetten az állat létrejöttekor 0.
A méret field-hez tartozik egy getter.
Minden állatot meg lehet etetni a feed(), ennek megvalósítása állat típusonként különböző.
 */