public class Main {
    public static void main(String[] args) {
        int FCountDigits = 11;
        int FDigitFirst = 0;
        int FDigitSecond = 1;
        for (int i = 0; i<FCountDigits/2;i++)
        {
            System.out.printf("%d %d ",FDigitFirst, FDigitSecond);
            FDigitFirst+=FDigitSecond;
            FDigitSecond+=FDigitFirst;
        }
        System.out.print(FDigitFirst);
    }
}