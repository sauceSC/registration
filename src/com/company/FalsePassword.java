package com.company;

public class FalsePassword extends Exception{
    @Override
    public String toString() {
        return "Неправильный пароль!";
    }
}
