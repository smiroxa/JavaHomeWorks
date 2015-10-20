import com.smiroha.base.Conditions;
import com.smiroha.base.Loops;
import com.smiroha.base.SimpleArray;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;


public class BaseTasksTest {

    @Test
    public void conditionsTest()
    {
        assertEquals(Conditions.first(1, 10), 11);
        assertEquals(Conditions.first(5, 10), 15);
        assertEquals(Conditions.first(10, 5), 50);

        assertEquals(Conditions.second( 5,  5), 1);
        assertEquals(Conditions.second(-5,  5), 2);
        assertEquals(Conditions.second(-5, -5), 3);
        assertEquals(Conditions.second( 5, -5), 4);

        assertEquals(Conditions.third(-10, 10, 10), 20);
        assertEquals(Conditions.third(10, -10, 10), 20);
        assertEquals(Conditions.third(10, 10, -10), 20);
        assertEquals(Conditions.third(-10, -10, -10), 0);
        assertEquals(Conditions.third(10, 10, 10), 30);

        assertEquals(Conditions.fourth(10, 10, 10), 1003);
        assertEquals(Conditions.fourth(10, -10, 10), 13);
        assertEquals(Conditions.fourth(10, 0, 10), 23);

        assertEquals(Conditions.fifth(19), 'F');
        assertEquals(Conditions.fifth(39), 'E');
        assertEquals(Conditions.fifth(59), 'D');
        assertEquals(Conditions.fifth(74), 'C');
        assertEquals(Conditions.fifth(89), 'B');
        assertEquals(Conditions.fifth(99), 'A');
    }
    
    @Test
    public void loopsTest()
    {
        assertEquals(Loops.first(), "2450_49");
        
        assertEquals(Loops.second(17), true);
        assertEquals(Loops.second(21), false);



        assertEquals(Loops.fourth(0), 1);
        assertEquals(Loops.fourth(1), 1);
        assertEquals(Loops.fourth(2), 2);
        assertEquals(Loops.fourth(3), 6);
        assertEquals(Loops.fourth(4), 24);
        assertEquals(Loops.fourth(5), 120);
        assertEquals(Loops.fourth(10), 3628800);
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
