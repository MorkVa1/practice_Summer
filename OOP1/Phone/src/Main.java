public class Main {
    public static void main(String[] args) {

        Phone p5 = new Phone();
        Phone p3 = new Phone("8 964 555 55 77", "Samsung", 15);
        Phone p4 = new Phone("8 444 444 44 44", "Nokia");


        //2
        p5.receiveCall("Олег");

        //3
        System.out.println(p3.toString(p3));
        //4
        System.out.println(p4.toString(p4));
        //5
        System.out.println(p5.toString(p5));
        //6
        p5.receiveCall("Не Олег", "8 777 777 55 22");
        //7
        p5.sendMessage();

    }
}