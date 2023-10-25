package org.java.animals;

public class Eagle extends Animals implements CanFly{
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("PIUPIU DA AQUILA");
    }

    @Override
    public void eat() {
        System.out.println("Mi sto mangiando le persone");
    }

    @Override
    public void startFly() {
        System.out.println("Sto volando!!");
    }
}
