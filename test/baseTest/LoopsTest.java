package baseTest;

import com.smiroha.base.Loops;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class LoopsTest {

    @Test
    public void sumAndCountEvenElementsTest()
    {
        int[] result = Loops.sumAndCountEvenElements();
        assertTrue(Arrays.equals(result, new int[]{2450, 49}));
    }


    @Test
    public void isSimpleNumberTestTrue()
    {
        boolean result = Loops.isSimpleNumber(21);
        assertEquals(result, false);
    }
    @Test
    public void isSimpleNumberTestFalse()
    {
        boolean result = Loops.isSimpleNumber(17);
        assertEquals(result, true);
    }


    @Test
    public void mySqrtCheckingTest1()
    {
        int result = Loops.mySqrtChecking(4);
        assertEquals(result, 2);
    }
    @Test
    public void mySqrtCheckingTest2()
    {
        int result = Loops.mySqrtChecking(9);
        assertEquals(result, 3);
    }
    @Test
    public void mySqrtCheckingTest3()
    {
        int result = Loops.mySqrtChecking(16);
        assertEquals(result, 4);
    }


    @Test
    public void mySqrtBinSearchTest1()
    {
        int result = Loops.mySqrtBinSearch(121);
        assertEquals(result, 11);
    }
    @Test
    public void mySqrtBinSearchTest2()
    {
        int result = Loops.mySqrtBinSearch(16);
        assertEquals(result, 4);
    }
    @Test
    public void mySqrtBinSearchTest3()
    {
        int result = Loops.mySqrtBinSearch(9);
        assertEquals(result, 3);
    }


    @Test
    public void myFactorialTest1()
    {
        int result = Loops.myFactorial(0);
        assertEquals(result, 1);
    }
    @Test
    public void myFactorialTest2()
    {
        int result = Loops.myFactorial(1);
        assertEquals(result, 1);
    }
    @Test
    public void myFactorialTest3()
    {
        int result = Loops.myFactorial(2);
        assertEquals(result, 2);
    }
    @Test
    public void myFactorialTest4()
    {
        int result = Loops.myFactorial(5);
        assertEquals(result, 120);
    }


    @Test
    public void sumOfNumbersTest1()
    {
        int result = Loops.sumOfNumbers(1234);
        assertEquals(result, 10);
    }
    @Test
    public void sumOfNumbersTest2()
    {
        int result = Loops.sumOfNumbers(123456789);
        assertEquals(result, 45);
    }


    @Test
    public void reversNumbersTest1()
    {
        int result = Loops.reversNumbers(123);
        assertEquals(result, 321);
    }
    @Test
    public void reversNumbersTest2()
    {
        int result = Loops.reversNumbers(321);
        assertEquals(result, 123);
    }
}
