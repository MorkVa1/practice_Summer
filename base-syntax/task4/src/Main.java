import java.util.Scanner;


public class Main {public static void main(String[] args) {
        System.out.println("Введите длину последовательности:");
        Scanner in = new Scanner(System.in);
        int CountList = in.nextInt();
        double [] ListOfDigits = new double[CountList];
        for (int i = 0; i<CountList;i++)
            ListOfDigits[i] = Math.random();
        double SumDigits = ListOfDigits[0], MaxDigit = ListOfDigits[0];
        for (int i = 1; i<CountList;i++)
        {
            SumDigits+=ListOfDigits[i];
            if (MaxDigit<ListOfDigits[i])
                MaxDigit = ListOfDigits[i];
        }
        System.out.printf("Наибольшее значение: %f,\nСреднее значение: %f", MaxDigit, SumDigits/CountList);
    }
}