public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(16, "red");
        Circle c2 = new Circle(2, "blue");
        //технически, методы area() и perimeter() используются внутри toString()
        System.out.println(c.toString(c));
        System.out.println(c.toString(c2));
    }
}