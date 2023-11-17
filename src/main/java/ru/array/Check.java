package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
            if (data[0] != data[index + 1]) {
                return result = false;
            }
        }
        return result;
    }
}
