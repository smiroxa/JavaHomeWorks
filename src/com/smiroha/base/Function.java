package com.smiroha.base;

public class Function {
    
//  Получить строковое название дня недели по номеру дня.
    public static String getDayOfWeek(int a)
    {
        String response;
        switch (a)
        {
            case 1: 
                response = "Понедельник"; 
                break;
            case 2: 
                response = "Вторник"; 
                break;
            case 3: 
                response = "Среда"; 
                break;
            case 4: 
                response = "Четверг"; 
                break;
            case 5: 
                response = "Пятница"; 
                break;
            case 6: 
                response = "Суббота"; 
                break;
            case 7: 
                response = "Воскресенье"; 
                break;
            default: throw new IndexOutOfBoundsException();
        }
        return response;
    }
    
//  Вводим число (0-999), получаем строку с прописью числа.
    public static String convertNumberToStr(int a)
    {
        return "двадцать";
    }
    
//  Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число
    public static int convertStrToNumber(String a)
    {
        return 20;
    }

//  Найти расстояние между двумя точками в двумерном декартовом пространстве.
    public static float calculateDistance(int x1, int y1, int x2, int y2)
    {
        return (float) Math.sqrt( ( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) ) );
    }
//  Для задания 2 расширить диапазон до 999 миллиардов
//  Для задания 3 расширить диапазон до 999 миллиардов

}
