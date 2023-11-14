package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number % 2 != 0 && number % 3 != 0 && number != 1;
        for (int i = 2; i <= number; i++) {
            if (number % 2 == 1) {
                System.out.println(prime);
                break;
            } else {
                System.out.println(prime);
                break;
            }
        }
        return prime;
    }
}


