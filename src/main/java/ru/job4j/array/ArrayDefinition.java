package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] agees = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(agees.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        String[] names = new String[4];
        names[0] = "Pavel";
        names[1] = "Darya";
        names[2] = "Alex";
        names[3] = "Artem";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
