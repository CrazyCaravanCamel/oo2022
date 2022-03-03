public class Video {
    double pikkus;
    String nimi;
    int reklaamideArv;
    String žanr;
    double reklaamiPikkus;

    public Video(double pikkus, String nimi, String žanr, int reklaamideArv, double reklaamiPikkus) {
        this.pikkus = pikkus;
        this.nimi = nimi;
        this.žanr = žanr;
        this.reklaamideArv = reklaamideArv;
        this.reklaamiPikkus = reklaamiPikkus;
    }

    public String toString() {
        return "Video{" +
                "nimi='" + nimi + '\'' +
                ", žanr='" + žanr + '\'' +
                ", pikkus=" + pikkus  +
                ", reklaamideArv=" + reklaamideArv +
                ", reklaamiPikkus=" + reklaamiPikkus +
                '}';
    }
}
