package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui1 = context.getBean(StartUI.class);
        ui1.readInput("What is your name?  > ");
        ui1.readInput("How old are you?  > ");
        ui1.readInput("What is your occupation?  > ");
        ui1.print();
        StartUI ui2 = context.getBean(StartUI.class);
        ui2.add("Another bean");
        ui2.readInput("Anything else? > ");
        ui2.print();
    }
}