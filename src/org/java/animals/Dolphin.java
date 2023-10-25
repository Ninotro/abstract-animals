package org.java.animals;

public class Dolphin extends Animals implements CanSwim {

    public Dolphin(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("GLUGLUGLU");
    }

    @Override
    public void eat() {
        System.out.println("Mi sto mangiando la carbonara");
    }


    @Override
    public void startSwim() {
        System.out.println("Sto nuotando!");
    }
}
