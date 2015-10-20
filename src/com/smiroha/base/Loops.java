package com.smiroha.base;

public class Loops 
{
    // Найти сумму четных чисел и их количество в диапазоне от 1 до 99
    public static String sumAndCountEvenElements()
    {
        int sum = 0, count = 0;
        for (int i = 1; i < 99; i++) {
            if (i % 2 == 0)
            {
                sum += i;
                count++;
            }
        }
    return sum + "_" + count;
    }

//  Проверить простое ли число? (число называется простым, если оно делится только само на себя и на 1)
    public static boolean isSimpleNumber(int in)
    {
        boolean response = true;
        for (int i = 2; i < in; i++) {
            if (in % i  == 0)
            {
                response = false;
            }
        }
        return response;
    }
    
//  Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного подбора и метод бинарного поиска)    
    public static int mySqrt(int a)
    {
        int current = 1, i = 1;
        while (current >= a)
        {
            System.out.println(current);
            current = i * i;
            i++;
        }
        return i;
    }

//  Вычислить факториал числа n. n! = 1*2*…*n-1*n;!
    public static int myFactorial(int a)
    {
        int response = 1;
        if (a > 1)
        {
            for (int i = 2; i <= a; i++) {
                response *= i;
            }
        }
        return response;
    }

//  Посчитать сумму цифр заданного числа
    public static int sumOfNumbers(int a)
    {
        int result = 0;

        while (a != 0)
        {
            result += a % 10;
            a /= 10;
        }
        return result;
    }

//  Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.
    public static int reversNumbers(int a)
    {
        return 1;        
    }

}
