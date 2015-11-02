package com.smiroha.strings;


public class Char 
{

//    1. Вывести в одну строку символы:
//      английского алфавита от ‘A’ до ‘Z’
//      английского алфавита от ‘z’ до ‘a’
//      русского алфавита от ‘а’ до ‘я’
//      цифры от ‘0’ до ‘9’
//    печатного диапазона таблицы ASCII
    public static void printSymbols(char startS, int finishS, char way)
    {
        while (startS <= finishS)
        {
            System.out.print(" " + startS);
            if (way == '-') {
                startS--;
            }
            else startS++;
        }
        System.out.println();
    }
}
