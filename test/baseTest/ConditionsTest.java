package baseTest;

import com.smiroha.base.Conditions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConditionsTest {

    @Test
    public void sumOrAddTest1()
    {
        int result = Conditions.sumOrAdd(1, 10);
        assertEquals(result, 11);
    }
    @Test
    public void sumOrAddTest2()
    {
        int result = Conditions.sumOrAdd(5, 10);
        assertEquals(result, 15);
    }
    @Test
    public void sumOrAddTest3()
    {
        int result = Conditions.sumOrAdd(10, 5);
        assertEquals(result, 50);
    }


    @Test
    public void findQuarterTest1()
    {
        int result = Conditions.findQuarter(5, 5);
        assertEquals(result, 1);
    }
    @Test
    public void findQuarterTest2()
    {
        int result = Conditions.findQuarter(-5, 5);
        assertEquals(result, 2);
    }
    @Test
    public void findQuarterTest3()
    {
        int result = Conditions.findQuarter(-5, -5);
        assertEquals(result, 3);
    }
    @Test
    public void findQuarterTest4()
    {
        int result = Conditions.findQuarter(5, -5);
        assertEquals(result, 4);
    }


    @Test
    public void sumOfPositiveElementsTest1()
    {
        int result = Conditions.sumOfPositiveElements(-10, 10, 10);
        assertEquals(result, 20);
    }
    @Test
    public void sumOfPositiveElementsTest2()
    {
        int result = Conditions.sumOfPositiveElements(10, -10, 10);
        assertEquals(result, 20);
    }
    @Test
    public void sumOfPositiveElementsTest3()
    {
        int result = Conditions.sumOfPositiveElements(10, 10, -10);
        assertEquals(result, 20);
    }
    @Test
    public void sumOfPositiveElementsTest4()
    {
        int result = Conditions.sumOfPositiveElements(-10, -10, -10);
        assertEquals(result, 0);
    }
    @Test
    public void sumOfPositiveElementsTest5()
    {
        int result = Conditions.sumOfPositiveElements(10, 10, 10);
        assertEquals(result, 30);
    }


    @Test
    public void calculateMaxTest1()
    {
        int result = Conditions.calculateMax(10, 10, 10);
        assertEquals(result, 1003);
    }
    @Test
    public void calculateMaxTest2()
    {
        int result = Conditions.calculateMax(10, -10, 10);
        assertEquals(result, 13);
    }
    @Test
    public void calculateMaxTest3()
    {
        int result = Conditions.calculateMax(10, 0, 10);
        assertEquals(result, 23);
    }


    @Test
    public void findStudentMarkTest1()
    {
        int result = Conditions.findStudentMark(19);
        assertEquals(result, 'F');
    }
    @Test
    public void findStudentMarkTest2()
    {
        int result = Conditions.findStudentMark(39);
        assertEquals(result, 'E');
    }
    @Test
    public void findStudentMarkTest3()
    {
        int result = Conditions.findStudentMark(59);
        assertEquals(result, 'D');
    }
    @Test
    public void findStudentMarkTest4()
    {
        int result = Conditions.findStudentMark(74);
        assertEquals(result, 'C');
    }
    @Test
    public void findStudentMarkTest5()
    {
        int result = Conditions.findStudentMark(89);
        assertEquals(result, 'B');
    }
    @Test
    public void findStudentMarkTest6()
    {
        int result = Conditions.findStudentMark(99);
        assertEquals(result, 'A');
    }
}