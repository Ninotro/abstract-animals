package org.java.animals;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Sleep() {
        System.out.println("Sto dormendo zzzzzzz");
    }


    public abstract void makeSound();

    public abstract void eat();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


