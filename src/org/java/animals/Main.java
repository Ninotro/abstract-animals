package org.java.animals;

public class Main {
    public static void main(String[] args) {
       Dog Charlie = new Dog("charlie" , 5);
       Bird Candeggina = new Bird("Candeggina",3);
       Dolphin Flipper = new Dolphin("Flipper",10);
       Eagle HawkEye = new Eagle("Hawkeye",5);

       Animals [] fattoria = {Charlie,Candeggina,Flipper,HawkEye};

       for (Animals animali : fattoria) {
           System.out.println(animali.getName());
           animali.eat();
           animali.Sleep();
           animali.makeSound();
           if (animali instanceof CanSwim) {
               ((CanSwim) animali).startSwim();
           }
           if (animali instanceof CanFly) {
               ((CanFly) animali).startFly();
           }
       }


    }
}
