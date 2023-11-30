package ru.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int three) {
        return Max.max(three, max(first, second));
    }

    public static int max(int first, int second, int three, int four) {
        return Max.max(four, max(first, second, three));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(30, 20));
        System.out.println(Max.max(30, 20, 50));
        System.out.println(Max.max(30, 20, 50, 90));
    }
}
