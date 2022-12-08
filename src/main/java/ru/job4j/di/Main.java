package ru.job4j.di;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);
        StartUI ui = context.get(StartUI.class);
        ui.readInput("What is your name?");
        ui.readInput("How old are you?");
        ui.readInput("What is your occupation?");
        ui.print();
    }
}