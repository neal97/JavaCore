package javacore.chapter01.variable.exercise;

public class FahrenheitCelsiusConverter {
    public static void main(String[]  args) {

        double Fahrenheit = 30 ;

        double Celsius = (Fahrenheit - 32) / 1.8;

        Celsius = Math.round(Celsius * 10.0) / 10.0;

        System.out.println(Fahrenheit + "F° font " + Celsius + "C°");
    }
}
