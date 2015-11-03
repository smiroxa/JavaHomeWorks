package stringTest;


import com.smiroha.string.Strings;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class StringTest 
{

    @Test
    public void printSymbolsTest1()
    {
        String response = Strings.printSymbols('A', 'Z', '+');
        assertEquals(response, "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z ");
    }
    @Test
    public void printSymbolsTest2()
    {
        String response = Strings.printSymbols('z', 'a', '-');
        assertEquals(response, "z y x w v u t s r q p o n m l k j i h g f e d c b a ");
    }
    @Test
    public void printSymbolsTest3()
    {
        String response = Strings.printSymbols('0', '9', '+');
        assertEquals(response, "0 1 2 3 4 5 6 7 8 9 ");
    }
    @Test
    public void printSymbolsTest4()
    {
        String response = Strings.printSymbols('а', 'я', '+');
        assertEquals(response, "а б в г д е ж з и й к л м н о п р с т у ф х ц ч ш щ ъ ы ь э ю я ");
    }
    @Test
    public void printSymbolsTest5()
    {
        String response = Strings.printASCIITable();
        System.out.println(response);
    }

    @Test
    public void convertNumberToStringTest1()
    {
        String response = Strings.convertRealNumberToString(100);
        assertEquals(response, "100");
    }
    @Test
    public void convertNumberToStringTest2()
    {
        String response = Strings.convertNumberToString(100.05);
        assertEquals(response, "100");
    }    
    @Test
    public void convertNumberToStringTest3()
    {
        int response = Strings.convertStringToRealNumber("100");
        assertEquals(response, 100);
    }
    @Test
    public void convertStringToNumberTest4()
    {
        float response = Strings.convertStringToNumber("100.00");
        System.out.println(response);
    }
}
