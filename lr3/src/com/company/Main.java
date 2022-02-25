package com.company;

import java.util.Scanner;

public class Main {

    public static int Solution(int[] Arr)
    {
        int min, min2, index = -1;
        if(Arr[0] <  Arr[1])
        {
            min = Arr[0];
            min2 = Arr[1];
        }
        else
        {
            min = Arr[1];
            min2 = Arr[0];
        }

        for(int i = 2; i < Arr.length; i++)
        {
            if(Arr[i] < min)
            {
                min2 = min;
                index = i - 1;
                min = Arr[i];
            }
            else
            {
                min2 = Arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Количество элементов:");
        int n = in.nextInt();
        int[] Arr = new int[n];

	    System.out.println("Введите массив:");
        for(int i = 0; i < n; i++)
        {
            Arr[i] = in.nextInt();
        }

        int index = Solution(Arr);

        System.out.println("Массив:");

        for(int i = 0; i < n; i++)
        {
            System.out.println("Arr[" + i + "] = " + Arr[i]);
        }

        if(index != -1) {
            System.out.println("Второй минимальный элемент: " + Arr[index] + "\nИндекс: " + index);
        }
        else
        {
            System.out.println("Все элементы в массиве одинаковые.");
        }
    }
}
