package teineosa;

public class JoogiPudel {
    double maht;
    double mass;
    String pudeliTyyp;
    double taaraMaksumus;
    Jook jook;

    public JoogiPudel(double maht, double mass, String pudeliTyyp, double taaraMaksumus) {
        this.maht = maht;
        this.mass = mass;
        this.pudeliTyyp = pudeliTyyp;
        this.taaraMaksumus = taaraMaksumus;
    }

    public double getMass() {
        if (jook == null){
            return mass;
        } else {
            return mass + jook.erikaal;
        }
    }

    public double getKoguhind() {
        if (jook == null){
            return taaraMaksumus;
        } else {
            return taaraMaksumus + jook.erikaal*jook.omahind;
        }
    }
}
