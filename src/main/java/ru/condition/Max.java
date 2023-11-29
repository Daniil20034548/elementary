package ru.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int first) {
        int result = max(left, right);
        result = first > result ? first : right;
        return result;
    }

    public static int max(int left, int right, int first, int second) {
        int result = max(left, right, first);
        result = second > result ? second : right;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(30, 20));
        System.out.println(Max.max(30, 20, 50));
        System.out.println(Max.max(30, 20, 50, 90));
    }
}
