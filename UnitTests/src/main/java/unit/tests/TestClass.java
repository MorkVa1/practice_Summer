package unit.tests;

public class TestClass {
    public double areaCylinder(double r, double h) {
        return Arithmetic.multiplication(Figure.perimeterCircle(r), Arithmetic.summation(r, h));
    }

    public double volumeCylinder(double r, double h) {
        return Arithmetic.multiplication(Figure.areaCircle(r), h);
    }

    private String getFigureName() {
        return "Cylinder";
    }


}
