package model;

import control.MainController;

public class AllgemeineLeitung {
    //Attribute
    protected String name;
    protected int alter;

    //Referenzen
    protected Kurs[] kurse;

    public AllgemeineLeistung(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void addKurs(Kurs neuerKurs) {
    }
}



