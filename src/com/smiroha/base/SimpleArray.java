package com.smiroha.base;

public class SimpleArray {

//  Найти минимальный элемент массива
    public static int minElement (int[] arr)
    {
        int response = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] < response) 
            {
                response = arr[i];
            }
        }
        return response;
    }
    
//  Найти максимальный элемент массива
    public static int maxElement (int[] arr)
    {
        int response = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > response) 
            {
                response = arr[i];
            }
        }
        return response;
    }
    
//  Найти индекс минимального элемента массива
    public static int indexMinElement(int[] arr)
    {
        int response = 0, minValue = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] < minValue) 
            {
                response = i;
                minValue = arr[i];
            }
        }
        return response;
    }
    
//  Найти индекс максимального элемента массива
    public static int indexMaxElement(int[] arr)
    {
        int response = 0, maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > maxValue) 
            {
                response = i;
                maxValue = arr[i];
            }
        }
        return response;
    }
//  Посчитать сумму элементов массива с нечетными индексами
    public static int sumElementsOddIndex(int[] arr)
    {
        int response = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (i % 2 == 0)
            {
                response += arr[i];
            }
        }
        return response;
    }
//  Сделать реверс массива (массив в обратном направлении)
    public static int[] reversArray(int[] arr)
    {
        int response[] = new int[arr.length];
        int currentIndex = arr.length - 1;
        for (int i = 0; i <= (arr.length - 1); currentIndex--, i++)
        {
            response[currentIndex] = arr[i];
        }
    return response;
    }
    
//  Посчитать количество нечетных элементов массива
    public static int countOddElements(int[] arr)
    {
        int response = 0;
        for (int currentElement : arr)
        {
            if (currentElement % 2 != 0)
            {
                response++;
            }
        }
        return response;
    }
//  Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
    public static int[] replaceHalfArray(int[] arr)
    {
        int half = arr.length / 2;
        int div = half + arr.length % 2; // на случай нечетного количества элементов в массиве
        for (int i = 0; i < div; i++)
        {
            int currentElement = arr[i];
            arr[i] = arr[div + i];
            arr[div + i] = currentElement;
        }
        return arr;

    }
//  Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
//  Отсортировать массив (Quick, Merge, Shell, Heap)
}
