package unit.tests;

public class Arithmetic {
    public static double summation(double a, double b) {
        return a + b;
    }
    public double subtraction(double a, double b) {
        return a - b;
    }
    public static double multiplication(double a, double b) {
        return a * b;
    }
    public double division(double a, double b) {
        return a / b;
    }
    public static double involution(double a, int power) {
        double result = 1;
        for (int i = 0; i < power;i++) {
            result = result * a;
        }
        return result;
    }

}
