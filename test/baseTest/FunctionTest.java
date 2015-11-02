package baseTest;

import com.smiroha.base.Function;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionTest 
{
    @Test (expected = IndexOutOfBoundsException.class)
    public void getDayOfWeekTest1()
    {
        Function.getDayOfWeek(0);
    }
    @Test
    public void getDayOfWeekTest2()
    {
        String response = Function.getDayOfWeek(1);
        assertEquals(response, "Понедельник");
    }
    @Test
    public void getDayOfWeekTest3()
    {
        String response = Function.getDayOfWeek(2);
        assertEquals(response, "Вторник");
    }
    @Test
    public void getDayOfWeekTest4()
    {
        String response = Function.getDayOfWeek(3);
        assertEquals(response, "Среда");
    }
    @Test
    public void getDayOfWeekTest5()
    {
        String response = Function.getDayOfWeek(4);
        assertEquals(response, "Четверг");
    }
    @Test
    public void getDayOfWeekTest6()
    {
        String response = Function.getDayOfWeek(5);
        assertEquals(response, "Пятница");
    }
    @Test
    public void getDayOfWeekTest7()
    {
        String response = Function.getDayOfWeek(6);
        assertEquals(response, "Суббота");
    }
    @Test
    public void getDayOfWeekTest8()
    {
        String response = Function.getDayOfWeek(7);
        assertEquals(response, "Воскресенье");
    }
    @Test (expected = IndexOutOfBoundsException.class)
    public void getDayOfWeekTest9()
    {
        Function.getDayOfWeek(8);
    }
    
    
    @Test
    public void calculateDistanceTest1()
    {
        float response = Function.calculateDistance(10,10,10,10);
        assertEquals(response, 0);
    }
}
