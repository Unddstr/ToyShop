package ru.panteleev.model;

import java.util.PriorityQueue;

public class ToyVendingMachine implements IToyVendingMachine {
    private PriorityQueue<Toy> listToy;

    public ToyVendingMachine(PriorityQueue<Toy> listToy) {
        this.listToy = listToy;
    }

    public ToyVendingMachine() {
        this.listToy = new PriorityQueue<>();
    }

    public PriorityQueue<Toy> getListToy() {
        return listToy;
    }

    public void setListToy(PriorityQueue<Toy> listToy) {
        this.listToy = listToy;
    }

    @Override
    public void addToy(Toy toy) {
        this.listToy.add(toy);
    }
}
