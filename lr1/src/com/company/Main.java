package com.company;

public class Main {

    public static void main(String[] args)
    {
        int h = 5;
        char s;
        for(int i = 0; i < h; i++)
        {
            s = (i % 2 != 1) ? 'a' : 'b';
            for(int j = 0; j <= i; j++)
            {
                System.out.print(s);
                s = (s == 'a') ? 'b' : 'a';
            }
            System.out.println();
        }
    }
}
