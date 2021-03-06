package lambda;

import java.util.function.*;

public class Lambda {
    public static String methodOne(ZeroArgsInterface zeroInterface) {
        return zeroInterface.zeroArgsMethod();
    }

    public static double methodTwo(double a, OneArgInterface oneInterface) {
        return oneInterface.oneArgMethod(a);
    }

    public static double methodThree(double a, double b, TwoArgsInterface twoInterface) {
        return twoInterface.twoArgsMethod(a, b);
    }

    public static String methodFunction(String a, Function<String, String> function) {
        return function.apply(a);
    }

    public static Integer methodIntSupplier(IntSupplier intSupplier) {
        return intSupplier.getAsInt();
    }

    public static void methodConsumer(Consumer<String> consumer) {
        consumer.accept("Cons");
    }

    public static boolean methodPredicate(String a, Predicate<String> b) {
        return b.test(a);
    }

}
