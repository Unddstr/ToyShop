package ru.panteleev.view;

import ru.panteleev.controller.Controller;

import java.util.Scanner;

public class View {
    Controller controller = new Controller();

    public void run() {

        System.out.println("*** Розыгрыш игрушек ***\n");
        do {
            try {
                String cmd = request("""
                        Введите 1 - добавить игрушку;
                        Введите 2 - начать розыгрыш;
                        Введите 3 - вывести наименования добавленных игрушек
                        """);
                if (cmd.equals("1")) {
                    String name = request("Введите имя игрушки и частоту выпадения\n" +
                            "Имя: ");
                    int frequencyOfWin = Integer.parseInt(request("Частота выполнения: "));
                    System.out.println();
                    controller.addToy(name, frequencyOfWin);
                    continue;
                }
                if (cmd.equals("2")) {
                    controller.logToyWin(controller.getResultLottery().toString());
                    continue;
                }
                if (cmd.equals("3")) {
                    controller.getNamesToy();
                    continue;
                }
                throw new RuntimeException();
            } catch (NumberFormatException e) {
                System.err.println("Введена неверная \"частота выпадения\"");
            } catch (RuntimeException e) {
                System.err.println("Введено неверное значение!");
            }
        } while (!controller.isEmpty());

    }

    private String request(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
