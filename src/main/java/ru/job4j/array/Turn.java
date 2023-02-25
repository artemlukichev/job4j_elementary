package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int last = 1;
        for (int index = 0; index < array.length / 2; index++) {
            temp = array[index];
            array[index] = array[array.length - last];
            array[array.length - last] = temp;
            last++;
        }
        return array;
    }
}