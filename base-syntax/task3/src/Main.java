import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину последовательности:");
        int CountOfElements =in.nextInt();
        for(int i = 1; i<=CountOfElements;i++)
        {
            System.out.printf("%d ", i*7);
        }
    }
}