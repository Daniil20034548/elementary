package ru.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number");
        }
        if (number > 0) {
            System.out.println("This number " + number);
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(-5);
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(20);
    }
}
