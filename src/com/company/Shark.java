package com.company;

public class Shark extends Animal{
    @Override
    public void metod() {
        System.out.println("акула: атака metod");
    }

    public void attack(){
        System.out.println("акула: атака");
    }
}
