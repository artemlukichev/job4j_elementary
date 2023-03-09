package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (j != i) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            }
            if (j == i + 1) {
               i++;
               j = array.length - 1;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}