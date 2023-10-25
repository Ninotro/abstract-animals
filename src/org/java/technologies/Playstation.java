package org.java.technologies;

public class Playstation extends Device{
    @Override
    public void play() {
        System.out.println("Sono una Playstation e sono in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono una Playstation e sono in modalità stop");
    }
}
