package ru.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (0 < amount) {
            amount = amount + (amount * percent) / 100;
            amount = amount - salary;
            year++;
        }
        return year;
    }

}
