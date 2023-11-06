package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(555);
        float dollar = Converter.rubleToDollar(999);
        System.out.println("555 rubles are " + euro + " euro.");
        System.out.println("999 rubles are " + dollar + " dollar.");
    }
}



