package ru.condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int three) {
        return Math.max(three, max(first, second));
    }

    public static int max(int first, int second, int three, int four) {
        return Math.max(four, max(first, second, three));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(30, 20));
        System.out.println(Max.max(30, 20, 50));
        System.out.println(Max.max(30, 20, 50, 90));
    }
}
