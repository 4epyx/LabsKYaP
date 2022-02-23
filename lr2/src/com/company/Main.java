package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

	    System.out.print("x = ");
        double x = scanner.nextDouble();
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("e = ");
        double e = scanner.nextDouble();
        double sumN = 0;
        double sumE = 0;
        double sumE10 = 0;
        double math = Math.log(1+x);

        double elem = x;
        for(int i = 1; i <= n; i++)
        {
            sumN += elem/i;
            elem *= -x;
        }

        elem = x;
        for(int i = 1; Math.abs(elem/i) > e; i++)
        {
            sumE += elem/i;
            elem *= -x;
        }

        elem = x;
        for(int i = 1; Math.abs(elem/i) > e/10; i++)
        {
            sumE10 += elem/i;
            elem *= -x;
        }

        System.out.println("Сумма " + n + " членов ряда: " + sumN);
        System.out.println("Сумма членов ряда, которые меньше " + e + ": " + sumE);
        System.out.println("Сумма членов ряда, которые меньше " + e/10 + ": " + sumE10);
        System.out.println("Результат вычислений Math.ln: " + math);
    }
}
