import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] ListDigits = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int tmp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < ListDigits.length-1; i++) {
                if(ListDigits[i] > ListDigits[i+1]){
                    isSorted = false;

                    tmp = ListDigits[i];
                    ListDigits[i] = ListDigits[i+1];
                    ListDigits[i+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ListDigits));
    }
}