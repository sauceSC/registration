package com.company;

import java.util.Scanner;

public class ID implements Registerable, Loginable{
    String username;
    int age;
    String password;

    public ID(String username, int age, String status) {
        this.username = username;
        this.age = age;
        this.password = status;
    }

    public ID() {

    }

    public String getUsername() throws FalseNickname{
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() throws FalsePassword{
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Ваш профиль: " +
                "Никнейм: " + username + "\n" +
                "Возраст: " + age +  "\n" +
                "Ваш статус: " + password + "\n";
    }

    @Override
    public void register() {
        Scanner scan11 = new Scanner(System.in);
        Scanner scan22 = new Scanner(System.in);
        System.out.println("Пожалуйста, зарегистрируйтесь, чтобы начать " +
                "работу: ");
        System.out.println("Придумайте никнейм: ");
        setUsername(scan11.nextLine());
        System.out.println("Сколько вам лет? ");
        setAge(scan22.nextInt());
        System.out.println("Придумайте пароль: ");
        setPassword(scan11.nextLine());
    }

    @Override
    public void login() {
        Scanner scan11 = new Scanner(System.in);
        System.out.println("Войдите в аккаунт: ");
        System.out.println("Введите никнейм: ");
        String nick = scan11.nextLine();
        try {
            if (nick.toString() == getUsername()){
                System.out.println("✔");
            } else if (nick.toString() != getUsername()){
                throw new FalseNickname();
            }
        } catch (FalseNickname falseNickname) {
            System.out.println(falseNickname);
        }
        String pass = scan11.nextLine();
        try {
            if(pass == getPassword()){
                System.out.println("✔");
            } else {
                throw new FalsePassword();
            }
        } catch (FalsePassword falsePassword){
            System.out.println(falsePassword);
        }
    }
}
