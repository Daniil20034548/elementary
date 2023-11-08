package ru.calculator;

import  ru.math.MathFunction;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return MathFunction.minus(first, second) + MathFunction.division(first, second);
    }

    public static double sumAndMultiplyAndMinusAndDivision(double first, double second) {
        return MathFunction.minus(first, second) + MathFunction.division(first, second)
                + MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndDivision(20, 5));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndMinusAndDivision(2, 2));
    }

}
