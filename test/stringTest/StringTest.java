package stringTest;


import com.smiroha.strings.Char;
import org.junit.Test;


public class StringTest {
    @Test
    public void findStudentMarkTest6()
    {
        Char.printSymbols('A', 'Z', '+');
        Char.printSymbols('z', 'a', '-');
        Char.printSymbols('0', '9', '+');
        Char.printSymbols('а', 'я', '+');
    }
}
