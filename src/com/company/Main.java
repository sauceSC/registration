package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ID id = new ID();
        id.register();
        System.out.println(id);
        id.login();


        Scanner sc = new Scanner(System.in);
        String menu = "Добро пожаловать!" + "\n" + "Вы находитесь в меню: " + "\n"
                + "0 - Закрыть программу " + "\n" + "1 - Найти сумму двух чисел " + "\n" +
                "2 - Вычесть от числа " + "\n" + "3 - Разделить" + "\n" + "4 - умножить";
        System.out.println("Добро пожаловать в систему! Введите любое число, чтобы начать работу. Введите 0, чтобы отключить программу");
        int ask = sc.nextInt();
        while (ask != 0) {
            System.out.println(menu);
            ask = sc.nextInt();
            switch (ask) {
                case 1:
                    Plusable plus = new Сalculator();
                    plus.plus();
                    break;
                case 2:
                    Minusable minus = new Сalculator();
                    minus.minus();
                    break;
                case 3:
                    try {
                        Divideable divide = new Сalculator();
                        divide.divide();
                        break;
                    } catch (ArithmeticException zero){
                        System.out.println("На ноль делить нельзя!");
                        break;
                    }
                case 4:
                    Factorable factor = new Сalculator();
                    factor.factor();
                    break;
                case 0:
                    System.out.println("Завершение работы программы...");
                    break;
                default:
                    System.out.println("Невереное значение!");
                    break;
            }
        }
    }


}
