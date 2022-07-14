package figure;

public class Figure {
    private final String name;
    protected String color;
    public double side;

    private double calculateArea() throws NullPointerException, IllegalArgumentException {
        System.out.print("Площадь квадрата: ");
        return side * side;
    }

    public double calculatePerimeter() throws NullPointerException, IllegalArgumentException {
        System.out.println("Периметр квадрата: ");
        return side * 4;
    }

    public Figure(String n, double s) {
        this.name = n;
        this.side = s;
    }

    private Figure(String n, String c, double s) {
        this.name = n;
        this.color = c;
        this.side = s;
    }
}
