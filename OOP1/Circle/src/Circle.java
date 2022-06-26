public class Circle {
    //1
    private double radius;
    private String color;

    //2
    public double area()
    {
        return 3.14 * this.radius*this.radius;
    }
    public double perimeter()
    {
        return 2*3.14*this.radius;
    }
    //3
    public Circle(double r, String c)
    {
        this.radius = r;
        this.color = c;
    }
    //4
    public String toString(Circle c)
    {
        String tmp = "radius = "+Double.toString(c.radius)+", color - "+c.color+", area = "+Double.toString(c.area())+", perimeter = "+Double.toString(c.perimeter());
        return tmp;
    }
}
