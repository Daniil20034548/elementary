package ru.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int three) {
        return three > max(first, second) ? three : second;
    }

    public static int max(int first, int second, int three, int four) {
        return four > max(first, second, three) ? four : first;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(30, 20));
        System.out.println(Max.max(30, 20, 50));
        System.out.println(Max.max(30, 20, 50, 90));
    }
}
