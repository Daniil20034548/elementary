package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 1; i <= number; i++) {
            if (number % 2 == 0 || number % 3 == 0 || number == 1) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}


