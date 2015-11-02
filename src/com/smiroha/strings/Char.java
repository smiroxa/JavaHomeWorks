package com.smiroha.strings;


public class Char 
{
// Вывести в одну строку символы:
// английского алфавита от ‘A’ до ‘Z’
// английского алфавита от ‘z’ до ‘a’
// русского алфавита от ‘а’ до ‘я’
// цифры от ‘0’ до ‘9’
// печатного диапазона таблицы ASCII
    public static void printSymbols(char startS, int finishS, char way)
    {
        if (way == '+')
        {
            while (startS <= finishS)
            {
                System.out.print(" " + startS);
                startS++;
            }
        } else if (way == '-')
        {
            while (startS >= finishS)
            {
                System.out.print(" " + startS);
                startS--;
            }
        }
        System.out.println();
    }
}
