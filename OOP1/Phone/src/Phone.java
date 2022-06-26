public class Phone {
    //1
    private String number;
    private String model;
    double weight;

    //2
    public void receiveCall(String name)
    {
        System.out.printf("Call %s\n", name);
    }
    public String getNumber()
    {
        return this.number;
    }

    //3
    public Phone(String n, String m, double w)
    {
        this.number = n;
        this.model = m;
        this.weight = w;
    }

    //4
    public Phone(String n, String m)
    {
        this.number = n;
        this.model = m;
    }

    //5
    public Phone()
    {
        this.number = "8 800 555 35 35";
        this.model = "Redmi Note 4";
        this.weight = 1.0;
    }
    //6
    public void receiveCall(String name, String phoneNumber)
    {
        System.out.printf("Call %s; phone number: %s\n", name, phoneNumber);
    }

    //7
    public void sendMessage()
    {
        String[] ListPhoneNumbers = {"8 951 545 78 78", "8 962 999 65 54", "8 999 666 66 66"};
        for (String item:ListPhoneNumbers) {
            System.out.println(item);
        }
    }

    //8

    public String toString(Phone p) {
        String tmp = "phone number " + p.number + ", phone model " + p.model + ", phone weight " + Double.toString(p.weight);
        return tmp;
    }
}

