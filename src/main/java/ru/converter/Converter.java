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
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 1.4. Test result : " + passed);
        float in2 = 900;
        float expected2 = 10f;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("900 rubles are 10 Test result : " + passed2);
        float euro = Converter.rubleToEuro(555);
        float dollar = Converter.rubleToDollar(999);
        System.out.println("555 rubles are " + euro + " euro.");
        System.out.println("999 rubles are " + dollar + " dollar.");
    }
}



