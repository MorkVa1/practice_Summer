package figure;

import org.junit.Test;

import java.lang.reflect.*;
import java.util.Arrays;

public class FigureTest {
    private static final Figure PUBLIC_SQUARE = new Figure("Квадрат", 15.4);
    private static final Class<?> GET_MY_CLASS = PUBLIC_SQUARE.getClass();

    @Test
    public void fieldTest() throws IllegalAccessException, NoSuchFieldException {
        Field privateNameSquare = GET_MY_CLASS.getDeclaredField("name");
        privateNameSquare.setAccessible(true);
        privateNameSquare.set(PUBLIC_SQUARE, "неКвадрат");
        System.out.println((String) privateNameSquare.get(PUBLIC_SQUARE));
        System.out.println(GET_MY_CLASS.getDeclaredField("side").getName());
        System.out.println(GET_MY_CLASS.getDeclaredField("color").getType());
    }

    @Test
    public void methodsTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method privateMethod = GET_MY_CLASS.getDeclaredMethod("calculateArea");
        privateMethod.setAccessible(true);
        System.out.println(privateMethod.invoke(PUBLIC_SQUARE));
        System.out.println(Arrays.toString(GET_MY_CLASS.getSuperclass().getDeclaredMethods()));
        System.out.println(Arrays.toString(privateMethod.getExceptionTypes()));
    }

    @Test
    public void constructorsTest() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Figure> publicConstructorFigure = Figure.class.getDeclaredConstructor(String.class, double.class);
        System.out.println(publicConstructorFigure);

        Constructor<Figure> privateConstructorFigure = Figure.class.getDeclaredConstructor(String.class, String.class, double.class);
        privateConstructorFigure.setAccessible(true);
        Figure privateFigure = privateConstructorFigure.newInstance("Квадрат", "черный", 4.2);
        System.out.println(privateFigure.equals(null));

        System.out.println(Arrays.toString(publicConstructorFigure.getParameterTypes()));
    }
}
