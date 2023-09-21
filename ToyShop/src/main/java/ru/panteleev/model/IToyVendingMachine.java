package ru.panteleev.model;

import java.util.PriorityQueue;

public interface IToyVendingMachine {
    void addToy(Toy toy);

    PriorityQueue<Toy> getListToy();
}
