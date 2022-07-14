package unit.tests;

public class Figure {
    private final static double PI = 3.14;

    public double perimeterSquare(int a) {
        return Arithmetic.multiplication(4,a);
    }
    public double areaSquare(int a) {
        return Arithmetic.involution(a, 2);
    }
    public double perimeterRectangle(int a, int b) {
        return Arithmetic.multiplication(Arithmetic.summation(a, b), 2);
    }
    public double areaRectangle(int a, int b) {
        return Arithmetic.multiplication(a, b);
    }
    public static double perimeterCircle(double r) {
        return Arithmetic.multiplication(Arithmetic.multiplication(2, PI), r);
    }
    public static double areaCircle(double r) {
        return Arithmetic.multiplication(PI, Arithmetic.involution(r, 2));
    }

}
