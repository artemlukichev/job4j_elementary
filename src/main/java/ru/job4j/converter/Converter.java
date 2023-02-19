package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euroIn = 140;
        float dollarIn = 120;
        float expected  = 2;
        float euroOut = Converter.rubleToEuro(euroIn);
        float dollarOut = Converter.rubleToDollar(dollarIn);
        boolean passed = expected == euroOut;
        System.out.println("140 rubles are " + euroOut + " euro. Test result : " + passed);
        passed = expected == dollarOut;
        System.out.println("120 rubles are " + dollarOut + " dollar. Test result : " + passed);
    }
}