package org.java.technologies;

public class Creator {
    public Device create(String type) {

       if (type.equalsIgnoreCase("Dvd")) {
           return new DvD();
       } else if (type.equalsIgnoreCase("playstation")) {

           return new Playstation();
       }
       else {
          throw new RuntimeException("Non ci sono dispositivi corrispondenti");
       }
    }
}
