package org.java.animals;

public class Dog extends Animals{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("BauBau");
    }

    @Override
    public void eat() {
        System.out.println("Mi sto mangiando i croccantini");
    }


}
