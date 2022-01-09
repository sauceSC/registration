package com.company;

import java.util.Scanner;

public class Сalculator implements Plusable, Minusable, Divideable, Factorable{

    @Override
    public void divide() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int divA = scan2.nextInt();
        System.out.println("Введите второе число: ");
        int divB = scan2.nextInt();
        int divC = divA / divB;
        System.out.println("Получилось: " + divC);
    }

    @Override
    public void factor() {
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int facA = scan3.nextInt();
        System.out.println("Введите второе число: ");
        int facB = scan3.nextInt();
        int facC = facA * facB;
        System.out.println("Получилось: " + facC);
    }

    @Override
    public void minus() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int minA = scan1.nextInt();
        System.out.println("Введите второе число: ");
        int minB = scan1.nextInt();
        int minC = minA - minB;
        System.out.println("Получилось: " + minC);
    }

    @Override
    public void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numA = scan.nextInt();
        System.out.println("Введите второе число: ");
        int numB = scan.nextInt();
        int numC = numA + numB;
        System.out.println("Получилось: " + numC);
    }
}
