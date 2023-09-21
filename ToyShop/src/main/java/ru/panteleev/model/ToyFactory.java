package ru.panteleev.model;

import java.util.Random;

public class ToyFactory implements IToyFactory {
    private int count;
    private final Random rand = new Random();

    public ToyFactory() {
        this.count = 0;
    }

    @Override
    public Toy create(String name, int FrequencyOfWin) {
        int max = 0;
        count++;
        for (int i = 0; i < FrequencyOfWin; i++) {
            int temp = rand.nextInt(100);
            if (temp > max) {
                max = temp;
            }
        }

        return new Toy(count, name, max);
    }
}
