package com.smiroha.triangles;


public class TrianglesAndSquares
{
    public static void printSquare()
    {
        System.out.println("");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printBorderSquare()
    {
        System.out.println("");
        for(int currentRow = 1; currentRow <= 7; currentRow++)
        {
            for(int position = 1; position <= 7; position++)
            {
                if (currentRow == 1 || currentRow == 7 || position == 1 || position == 7)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void printTriangle1()
    {
        for(int currentRow = 1; currentRow <= 7; currentRow++)
        {
            for(int position = 1; position <= 7; position++)
            {
                if (position >= position - currentRow)
                {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

    public static void printTriangle2()
    {
        for(int currentRow = 1; currentRow <= 7; currentRow++)
        {
            for(int position = 1; position <= 1; position++)
            {
                if (currentRow >= position)
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public static void printTriangle3()
    {
        System.out.println("");
        for(int currentRow = 1; currentRow <= 7; currentRow++)
        {
            for(int position = 7; position <= 1; position++)
            {
                if (currentRow >= position)
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public static void printTriangle4()
    {
        System.out.println("");
        for(int currentRow = 1; currentRow <= 7; currentRow++)
        {
            for(int position = 1; position <= 7; position++)
            {
                if (currentRow >= position)
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}
