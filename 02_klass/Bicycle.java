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
        if (tüüp.equals("mägiratas")) {
            System.out.println("Mäkketõusuks valmis!");
        } if (tüüp.equals("maanteejalgratas")) {
            System.out.println("Kiiruseks valmis!");
        } if (tüüp.equals("mägiratas") && käik >= 3) {
            System.out.println("Langeta käiku, tõus on raske!");
        } if (tüüp.equals("maanteejalgratas") && käik <= 2) {
            System.out.println("Tõsta käiku, liigud kiiremini!");
        } if (vanus >= 5) {
            System.out.println("Kaalu uuema ratta ostmist. Praegune on " + vanus + " aastat vana.");
        }
    }

    public String toString() {
        return "Bicycle{" +
                "tüüp='" + tüüp + '\'' +
                ", vanus=" + vanus +
                ", käik=" + käik +
                '}';
    }
}


