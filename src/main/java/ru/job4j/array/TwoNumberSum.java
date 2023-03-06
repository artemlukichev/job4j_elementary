package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        boolean back = true;
        int i = 0;
        int j = array.length - 1;
        while (j != i && i < array.length && j < array.length) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            }
            if (j == i + 1 && back) {
               i++;
               back = false;
            } else if (j == array.length - 1 && !back) {
                back = true;
            }
            j = back ? (j - 1) : (j + 1);
        }
        return new int[0];
    }
}