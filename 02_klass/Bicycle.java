public class Bicycle {
    double käik;
    String tüüp;
    int vanus;


    public Bicycle (String tüüp, double käik, int vanus) {
        this.tüüp = tüüp;
        this.käik = käik;
        this.vanus = vanus;
    }

    public void Riding() {
        System.out.println("Sinu valitud jalgrattatüüp on " + tüüp + ".");
    }

    public String toString() {
        return "Bicycle{" +
                "tüüp='" + tüüp + '\'' +
                ", vanus=" + vanus +
                ", käik=" + käik +
                '}';
    }
}


