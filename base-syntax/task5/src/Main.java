import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ListDigits = new ArrayList<>();
        boolean IsPrimeNumber = true;
        for (int i = 2;i<101;i++) {
            if (ListDigits.isEmpty()) {
                ListDigits.add(i);
                continue;
            }
            for (int j : ListDigits)
                if (i % j == 0)
                {
                    IsPrimeNumber = false;
                    break;
                }
            if (IsPrimeNumber)
                ListDigits.add(i);
            IsPrimeNumber = true;
        }
        System.out.println(ListDigits);
    }
}