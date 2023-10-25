package org.java.animals;

public class Bird extends Animals implements CanFly {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("PIUPIU");
    }

    @Override
    public void eat() {
        System.out.println("Mi sto mangiando il concime");
    }


    @Override
    public void startFly() {
        System.out.println("Sto volando!");
    }
}
