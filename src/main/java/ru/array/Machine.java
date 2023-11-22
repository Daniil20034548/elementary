package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int сhange = money - price;
        for (int coin : coins) {
            while (сhange >= coin) {
                rsl[size++] = coin;
                сhange -= coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
