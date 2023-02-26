package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
        int[][] exercise = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int i = 0; i < exercise.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + exercise[i].length
            );
        }
    }
}