package baseTest;


import com.smiroha.base.SimpleArray;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class SimpleArrayTest {

    @Test
    public void minElementTest1()
    {
        int result = SimpleArray.minElement(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        assertEquals(result, 0);
    }
    @Test
    public void minElementTest2()
    {
        int result = SimpleArray.minElement(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        assertEquals(result, 1);
    }
    @Test
    public void minElementTest3()
    {
        int result = SimpleArray.minElement(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 10});
        assertEquals(result, 0);
    }


    @Test
    public void maxElementTest1()
    {
        int result = SimpleArray.maxElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(result, 10);
    }
    @Test
    public void maxElementTest2()
    {
        int result = SimpleArray.maxElement(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        assertEquals(result, 10);
    }
    @Test
    public void maxElementTest3()
    {
        int result = SimpleArray.maxElement(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 10});
        assertEquals(result, 10);
    }


    @Test
    public void indexMinElementTest1()
    {
        int result = SimpleArray.indexMinElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(result, 0);
    }
    @Test
    public void indexMinElementTest2()
    {
        int result = SimpleArray.indexMinElement(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        assertEquals(result, 9);
    }
    @Test
    public void indexMinElementTest3()
    {
        int result = SimpleArray.indexMinElement(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 10});
        assertEquals(result, 0);
    }


    @Test
    public void indexMaxElementTest1()
    {
        int result = SimpleArray.indexMaxElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(result, 9);
    }
    @Test
    public void indexMaxElementTest2()
    {
        int result = SimpleArray.indexMaxElement(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        assertEquals(result, 0);
    }
    @Test
    public void indexMaxElementTest3()
    {
        int result = SimpleArray.indexMaxElement(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 10});
        assertEquals(result, 9);
    }


    @Test
    public void sumElementsOddIndexTest1()
    {
        int result = SimpleArray.sumElementsOddIndex(new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50});
        assertEquals(result, 120);
    }


    @Test
    public void reversArrayTest1()
    {
        int[] result = SimpleArray.reversArray(new int[]{1, 2, 3, 4, 5});
        assertTrue(Arrays.equals(result, new int[]{5, 4, 3, 2, 1}));
    }


    @Test
    public void countOddElementsTest1()
    {
        int result = SimpleArray.countOddElements(new int[]{1, 2, 3, 4, 5});
        assertEquals(result, 3);
    }
    @Test
    public void countOddElementsTest2()
    {
        int result = SimpleArray.countOddElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(result, 5);
    }


    @Test
    public void replaceHalfArrayTest1()
    {
        int[] result = SimpleArray.replaceHalfArray(new int[]{1, 2, 3, 4});
        assertTrue(Arrays.equals(result, new int[]{3, 4, 1, 2}));
    }
    @Test
    public void replaceHalfArrayTest2()
    {
        int[] result = SimpleArray.replaceHalfArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertTrue(Arrays.equals(result, new int[]{6, 7, 8, 9, 10, 1, 2, 3, 4, 5}));
    }


    @Test
    public void BubbleSortTest1()
    {
        int[] result = SimpleArray.BubbleSort(new int[]{5, 4, 3, 2, 1});
        assertTrue(Arrays.equals(result, new int[]{1, 2, 3, 4, 5}));
    }
    @Test
    public void BubbleSortTest2()
    {
        int[] result = SimpleArray.BubbleSort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        assertTrue(Arrays.equals(result, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
    @Test
    public void BubbleSortTest3()
    {
        int[] result = SimpleArray.BubbleSort(new int[]{0, 0, 2, 10, 5, 4, 8, 1, 0, 7, 9, 0, 11, 12, 0, 14, 15});
        assertTrue(Arrays.equals(result, new int[]{0, 0, 0, 0, 0, 1, 2, 4, 5, 7, 8, 9, 10, 11, 12, 14, 15}));
    }

    @Test
    public void selectionSortTest1()
    {
        int[] result = SimpleArray.selectionSort(new int[]{89, 54, 3, 99, 18});
        assertTrue(Arrays.equals(result, new int[]{3, 18, 54, 89, 99}));
    }
}
