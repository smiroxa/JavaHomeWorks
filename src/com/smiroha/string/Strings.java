package com.smiroha.string;


public class Strings
{
// Вывести в одну строку символы:
// английского алфавита от ‘A’ до ‘Z’
// английского алфавита от ‘z’ до ‘a’
// русского алфавита от ‘а’ до ‘я’
// цифры от ‘0’ до ‘9’
// печатного диапазона таблицы ASCII
    public static String printSymbols(char startS, int finishS, char way)
    {
        String response = "";
        if (way == '+')
        {
            while (startS <= finishS)
            {
                response += startS + " ";
                startS++;
            }
        } else if (way == '-')
        {
            while (startS >= finishS)
            {
                response += startS + " ";
                startS--;
            }
        }
        return response;
    }
    public static String printASCIITable()
    {
        String response = "";
        char currCounter = 0;
        {
            while (currCounter <= 127)
            {
                response += currCounter + " ";
                currCounter++;
            }
        }
        return response;
    }

// Написать и протестировать функции преобразования:
// целого числа в строку
// вещественного числа в строку
// строки в целое число
// строки в вещественное число
    public static String convertRealNumberToString(int num)
    {
        return "100";
    }
    public static String convertNumberToString(double num)
    {
        return "100";
    }

    public static int convertStringToRealNumber(String str)
    {
        return 100;
    }

    public static float convertStringToNumber(String str)
    {
        return 100;
    }

//    Написать и протестировать функции работы со строками:
//    Дана строка, состоящая из слов, разделенных пробелами и знаками препинания. Определить длину самого короткого слова.
//    Дан массив слов. Заменить последние три символа слов, имеющих заданную длину на символ "$"
//    Добавить в строку пробелы после знаков препинания, если они там отсутствуют.
//    Оставить в строке только один экземпляр каждого встречающегося символа.
//    Подсчитать количество слов во введенной пользователем строке.
//    Удалить из строки ее часть с заданной позиции и заданной длины.
//    Перевернуть строку, т.е. последние символы должны стать первыми, а первые последними.
//    В заданной строке удалить последнее слово
}
