import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int CountRows = in.nextInt();
        for (int i = 0;i<CountRows;i++)
            System.out.println("* * * * *");
    }
}