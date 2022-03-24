package Kodutöö;

import java.util.concurrent.ThreadLocalRandom;

public class Klass implements Liides{

    int number;

    public Klass(int number) {
        this.number = number;
    }


    public boolean isLoaded(){
        return number == 4;
    }
}
