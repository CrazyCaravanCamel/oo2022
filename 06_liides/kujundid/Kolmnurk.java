package kujundid;

public class Kolmnurk implements Kujund {
    double kylg1;
    double kylg2;
    double kylg3;

    public Kolmnurk(double v, double v1, double v2) {
    }


    @Override
    public double arvutaYmbermoot() {
        return kylg1 + kylg2 + kylg3;
    }

    @Override
    public double arvutaPindala() {
        return Math.sqrt((kylg1-arvutaYmbermoot()/2)*(kylg2-arvutaYmbermoot()/2-kylg2)*(kylg3-arvutaYmbermoot()/2-kylg3));
    }
}
