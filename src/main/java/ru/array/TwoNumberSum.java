package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int var = array[i] + array[j];
            if (var == target) {
                return new int[]{i, j};
            } else if (var > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[0];
    }
}

