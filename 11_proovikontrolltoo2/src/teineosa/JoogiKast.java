package teineosa;

public class JoogiKast {
    String kastiTyyp;
    double kastiHind;
    double kastiMass;
    int pesad;
    Jook jook;

    public JoogiKast(String kastiTyyp, double kastiHind, double kastiMass, int pesad) {
        this.kastiTyyp = kastiTyyp;
        this.kastiHind = kastiHind;
        this.kastiMass = kastiMass;
        this.pesad = pesad;
    }

    public double getMass(int jookideArv) {
        if (jookideArv > pesad) {
            jookideArv = pesad;
            System.out.println("Jookide arv oli suurem kui pesade arv," + "võtan kasutusele " + pesad + " jooki");
        }
        if (joogiPudel == null) {
            return kastiMass;
        } else {
            return kastiMass + (joogiPudel.mass + joogiPudel.jook.erikaal * joogiPudel.maht) * jookideArv;
        }
    }
}
