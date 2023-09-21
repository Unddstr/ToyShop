package ru.panteleev.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ToyShopLogger implements IToyShopLogger {
    @Override
    public void logger(String string) {
        try {
            File logFile = new File("logToyShop.txt");
            FileWriter fileWriter = new FileWriter(logFile, true);

            fileWriter.write(string + "\n");
            fileWriter.close();

        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }
}
