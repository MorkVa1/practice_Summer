import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        String Ans = "троллейбус";
        int CountOfAttempts = 3;
        while (CountOfAttempts!=0)
        {
            String UsersAns = in.nextLine().toLowerCase();
            if (UsersAns.equals(Ans))
            {
                System.out.println("1. Правильно!");
                break;
            } else if (UsersAns.equals("сдаюсь")) {

                    System.out.printf("2. правильный ответ: %s", Ans);
                    break;
                }
               else {
                System.out.println("3. Подумай ещё");
                CountOfAttempts--;
            }
        }
        if (CountOfAttempts==0)
            System.out.println("Попытки закончились");
}
}