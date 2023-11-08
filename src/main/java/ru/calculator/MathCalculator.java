package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.math.MathFunction.sum(first, second)
                + ru.math.MathFunction.multiply(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return ru.math.MathFunction.minus(first, second) + ru.math.MathFunction.division(first, second);
    }

    public static double sumAndMultiplyAndMinusAndDivision(double first, double second) {
        return ru.math.MathFunction.minus(first, second) + ru.math.MathFunction.division(first, second)
                + ru.math.MathFunction.sum(first, second)
                + ru.math.MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndDivision(20, 5));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndMinusAndDivision(2, 2));
    }

}
