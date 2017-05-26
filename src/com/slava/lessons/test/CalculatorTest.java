import homeworks.Calculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Shaddowrunner on 19.05.2017.
 */
//@RunWith(Parameterized.class)
@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator(2, 3);


    @Parameterized.Parameter(value = 1)
    public int valueOne;

    @Parameterized.Parameter(value = 0)
    public int valueTwo;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] params = new Object[][]{{3, 6}, {7, 8}};
        return Arrays.asList(params);
    }

    @Test
    public void shouldReturnAddedValues() {
        int result = valueOne + valueTwo;
        Assert.assertEquals("Should return " + result, result, calculator.plus(valueOne, valueTwo));
    }

    @Test
    @Parameters({"4|5", "8|7"})
    public void shouldReturnAddedValuesWithParams(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
        Assert.assertEquals("Should return " + result, result, calculator.plus(numberOne, numberTwo));
    }

    @Test
    public void shouldReturnMinusValues() {
        Assert.assertEquals("Should return 10",10,calculator.minus(12,2));
    }

    @BeforeClass
    public static void beforeAllTests() {
//        System.out.println("Before all tests");
    }

    @AfterClass
    public static void afterAllTests() {
//        System.out.println("After all tests");
    }

    @Before
    public void beforeEachTest() {
//        System.out.println("Before each test");
    }

    @After
    public void afterEachTest() {
//        System.out.println("After each test");
    }

//    @Ignore
    /*@Test
    public void shouldReturnAddedValues1() {
        Calculator calculator = new Calculator(2, 3);
        Assert.assertEquals("Should return 15", 15, calculator.plus(12, 3));
    }*/
}
