import com.smiroha.base.Conditions;
import com.smiroha.base.Loops;
import com.smiroha.base.SimpleArray;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class BaseTasksTest {

    @Test
    public void conditionsTest()
    {
        assertEquals(Conditions.sumOrAdd(1, 10), 11);
        assertEquals(Conditions.sumOrAdd(5, 10), 15);
        assertEquals(Conditions.sumOrAdd(10, 5), 50);

        assertEquals(Conditions.findQuarter(5, 5), 1);
        assertEquals(Conditions.findQuarter(-5, 5), 2);
        assertEquals(Conditions.findQuarter(-5, -5), 3);
        assertEquals(Conditions.findQuarter(5, -5), 4);

        assertEquals(Conditions.sumOfPositiveElements(-10, 10, 10), 20);
        assertEquals(Conditions.sumOfPositiveElements(10, -10, 10), 20);
        assertEquals(Conditions.sumOfPositiveElements(10, 10, -10), 20);
        assertEquals(Conditions.sumOfPositiveElements(-10, -10, -10), 0);
        assertEquals(Conditions.sumOfPositiveElements(10, 10, 10), 30);

        assertEquals(Conditions.calculateMax(10, 10, 10), 1003);
        assertEquals(Conditions.calculateMax(10, -10, 10), 13);
        assertEquals(Conditions.calculateMax(10, 0, 10), 23);

        assertEquals(Conditions.findStudentMark(19), 'F');
        assertEquals(Conditions.findStudentMark(39), 'E');
        assertEquals(Conditions.findStudentMark(59), 'D');
        assertEquals(Conditions.findStudentMark(74), 'C');
        assertEquals(Conditions.findStudentMark(89), 'B');
        assertEquals(Conditions.findStudentMark(99), 'A');
    }
    
    @Test
    public void loopsTest()
    {
        assertEquals(Loops.sumAndCountEvenElements(), "2450_49");
        
        assertEquals(Loops.isSimpleNumber(17), true);
        assertEquals(Loops.isSimpleNumber(21), false);

        assertEquals(Loops.mySqrtChecking(4), 2);
        assertEquals(Loops.mySqrtChecking(9), 3);
        assertEquals(Loops.mySqrtChecking(16), 4);

        assertEquals(Loops.mySqrtBinSearch(4), 2);
        assertEquals(Loops.mySqrtBinSearch(9), 3);
        assertEquals(Loops.mySqrtBinSearch(16), 4);
        assertEquals(Loops.mySqrtBinSearch(25), 5);
        assertEquals(Loops.mySqrtBinSearch(36), 6);
        assertEquals(Loops.mySqrtBinSearch(121), 11);

        assertEquals(Loops.myFactorial(0), 1);
        assertEquals(Loops.myFactorial(1), 1);
        assertEquals(Loops.myFactorial(2), 2);
        assertEquals(Loops.myFactorial(5), 120);

        assertEquals(Loops.sumOfNumbers(1234), 10);
        assertEquals(Loops.sumOfNumbers(1000), 1);

        assertEquals(Loops.reversNumbers(1234), 4321);
        assertEquals(Loops.reversNumbers(6789), 9876);
    }

    @Test
    public void simpleArrayTest()
    {
        assertEquals(SimpleArray.minElement(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 1);
        assertEquals(SimpleArray.minElement(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}), 1);
        assertEquals(SimpleArray.minElement(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 10}), 0);

        assertEquals(SimpleArray.maxElement(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 10);
        assertEquals(SimpleArray.maxElement(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}), 10);
        assertEquals(SimpleArray.maxElement(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 10}), 10);

        assertEquals(SimpleArray.indexMinElement(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 0);
        assertEquals(SimpleArray.indexMinElement(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}), 9);
        assertEquals(SimpleArray.indexMinElement(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 10}), 0);

        assertEquals(SimpleArray.indexMaxElement(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 9);
        assertEquals(SimpleArray.indexMaxElement(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}), 0);
        assertEquals(SimpleArray.indexMaxElement(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 10}), 9);
        
        assertEquals(SimpleArray.sumElementsOddIndex(new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50}), 120);
        
        assertTrue(Arrays.equals(SimpleArray.reversArray(new int[]{1, 2, 3, 4, 5}), new int[]{5, 4, 3, 2, 1}));

        assertEquals(SimpleArray.countOddElements(new int[]{1, 2, 3, 4, 5}), 3);
        assertEquals(SimpleArray.countOddElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 5);

        assertTrue(Arrays.equals(SimpleArray.replaceHalfArray(new int[]{1, 2, 3, 4}), new int[]{3, 4, 1, 2}));
        assertTrue(Arrays.equals(SimpleArray.replaceHalfArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), new int[]{6, 7, 8, 9, 10, 1, 2, 3, 4, 5}));
    }
}
