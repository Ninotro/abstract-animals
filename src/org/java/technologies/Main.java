package org.java.technologies;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Device dvd1 = creator.create("Dvd");
        Device playstation1= creator.create("Playstation");


        playstation1.play();
        playstation1.stop();
        dvd1.play();
        dvd1.stop();
    }
}
