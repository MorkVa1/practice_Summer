package unit.tests;

import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TestClassTest {
    private final static double DELTA = 1e-15;
    private final static TestClass TESTED_CLASS = new TestClass();
    private final static double TESTED_AREA_CIRCLE = 28.26;
    private final static double TESTED_PERIMETER_CIRCLE = 12.56;
    private final static double TESTED_MULTIPLICATION = 6.0;
    private final static double TESTED_SUMMATION = 5.0;

    @Test
    public void getArithmeticOperations() {
        Arithmetic arithmetic = mock(Arithmetic.class);
        when(arithmetic.multiplication(2,3)).thenReturn(TESTED_MULTIPLICATION);
        assertEquals(TESTED_MULTIPLICATION, TESTED_CLASS.multiplication(2,3), DELTA);

        when(arithmetic.summation(3,2)).thenReturn(TESTED_SUMMATION);
        assertEquals(TESTED_SUMMATION, TESTED_CLASS.summation(3,2), DELTA);
    }

    @Test
    public void getFigure() {
        Figure figure = mock(Figure.class);
        when(figure.areaCircle(3)).thenReturn(TESTED_AREA_CIRCLE);
        assertEquals(TESTED_AREA_CIRCLE, TESTED_CLASS.areaCircle(3), DELTA);

        OngoingStubbing<T> tOngoingStubbing = when(figure.multiplication(3, 2)).thenReturn(TESTED_MULTIPLICATION);
        assertEquals(TESTED_MULTIPLICATION, TESTED_CLASS.multiplication(3,2), DELTA);

        when(figure.perimeterCircle(2)).thenReturn(TESTED_PERIMETER_CIRCLE);
        assertEquals(TESTED_PERIMETER_CIRCLE, TESTED_CLASS.perimeterCircle(2), DELTA);
    }

    @Test
    public void getSpiedAreaCylinder() {
        TestClass testedClass = Mockito.spy(TestClass.class);
        testedClass.areaCylinder(3,2);
        testedClass.volumeCylinder(3,2);

        verify(testedClass, times(1)).perimeterCircle(3);
        verify(testedClass, times(1)).summation(3,2);
        verify(testedClass, times(1)).multiplication(18.84, 5);
        verify(testedClass, times(1)).multiplication(28.26, 2);
        verify(testedClass, times(1)).areaCircle(3);
    }

    @Test(expected = IllegalStateException.class)
    public void testedMethodTest() {
        TestClass testClass = mock(TestClass.class);
        when(testClass.areaCylinder(anyDouble(), anyDouble())).thenThrow(new IllegalStateException());
        testClass.areaCylinder(3, 2);
        when(testClass.volumeCylinder(anyDouble(), anyDouble())).thenThrow(new IllegalStateException());
        testClass.volumeCylinder(3,2);
    }

    @Test
    public void privateMethodTest() throws Exception {
        Method privateMethod = TestClass.class.getDeclaredMethod("getFigureName", null);
        privateMethod.setAccessible(true);
        String returnValue = (String) privateMethod.invoke(TESTED_CLASS, null);
        assertEquals("Cylinder", returnValue);
    }

}
