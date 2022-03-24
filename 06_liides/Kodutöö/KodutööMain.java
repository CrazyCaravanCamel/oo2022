package Kodutöö;

import java.util.concurrent.ThreadLocalRandom;

public class KodutööMain {
    public static void main(String[] args) {
        Klass relv = new Klass(4);
        System.out.println(relv.isLoaded());
    }
}
