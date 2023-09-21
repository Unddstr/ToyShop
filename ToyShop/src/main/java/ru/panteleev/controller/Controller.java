package ru.panteleev.controller;

import ru.panteleev.model.*;

public class Controller {
    private final IToyFactory iToyFactory;
    private final IToyVendingMachine iToyVendingMachine;
    private final IToyShopLogger iToyShopLogger;

    public Controller() {
        this.iToyShopLogger = new ToyShopLogger();
        this.iToyFactory = new ToyFactory();
        this.iToyVendingMachine = new ToyVendingMachine();
    }

    public void addToy(String name, int frequencyOfWin) {
        iToyVendingMachine.addToy(iToyFactory.create(name, frequencyOfWin));
    }

    public boolean isEmpty() {
        return iToyVendingMachine.getListToy().isEmpty();
    }

    public Toy getResultLottery() {
        return iToyVendingMachine.getListToy().poll();
    }

    public void logToyWin(String s) {
        iToyShopLogger.logger(s);
    }

    public void getNamesToy() {
        for (Toy toy : iToyVendingMachine.getListToy()) {
            System.out.println(toy.getName());
        }
    }
}
