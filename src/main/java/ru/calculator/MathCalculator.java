package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return minus(first, second) + division(first, second);
    }

    public static double sumAndMultiplyAndMinusAndDivision(double first, double second) {
        return minus(first, second) + division(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndDivision(20, 5));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndMinusAndDivision(2, 2));
    }

}
