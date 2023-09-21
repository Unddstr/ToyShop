package ru.panteleev.model;

public class Toy implements Comparable<Toy> {
    private final int ID;
    private String name;
    private int frequencyOfWin;

    public Toy(int ID, String name, int frequencyOfWin) {
        this.ID = ID;
        this.name = name;
        this.frequencyOfWin = frequencyOfWin;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequencyOfWin() {
        return frequencyOfWin;
    }

    public void setFrequencyOfWin(int frequencyOfWin) {
        this.frequencyOfWin = frequencyOfWin;
    }

    @Override
    public String toString() {
        return "Серийный номер: " + ID +
                ", наименование игрушки: " + name;
    }

    @Override
    public int compareTo(Toy o) {
        Integer a = this.frequencyOfWin;
        Integer b = o.frequencyOfWin;
        return b.compareTo(a);
    }
}
