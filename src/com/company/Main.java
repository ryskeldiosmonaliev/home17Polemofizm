package com.company;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(),
                new Turtle(),
                new Eagle()
        };

        for (Animal a : animals) {
            if (a instanceof Shark) {
                ((Shark) a).attack();
            } else if (a instanceof Shark) {
                ((Shark) a).attack();
            } else if (a instanceof Turtle) {
                ((Turtle) a).swim();
            } else if (a instanceof Eagle) {
                ((Eagle) a).fly();
            }

        }
        for (Animal b : animals) {
            if (b.getClass().getName().equals("com.company.Shark")) {
                b.metod();
            } else if (b.getClass().getName().equals("com.company.Turtle")) {
                b.metod();
            } else if (b.getClass().getName().equals("com.company.Eagle")) {
                b.metod();
            }
        }
        Shark[] sharks = {new Shark()};
        for (Shark c : sharks) {
            c.metod();
        }
        Turtle[] turtles = {new Turtle()};
        for (Turtle d : turtles) {
            d.metod();
        }
        Eagle[] eagles = {new Eagle()};
        for (Eagle g : eagles) {
            g.fly();
        }

    }
}

