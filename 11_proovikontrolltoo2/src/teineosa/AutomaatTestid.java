package teineosa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTestid {

    @Test
    public void arvutaKoguMassKuiJookiPole() {
        JoogiPudel joogiPudel = new JoogiPudel(12.0, 20.0, "Klaas,", 0.2);
        double mass = joogiPudel.getMass();
        assertEquals(20.0, mass, 0.1);
    }

    @Test
    public void arvutaKoguMassKuiJookOn(){
        JoogiPudel joogiPudel = new JoogiPudel(12.0, 20.0, "Klaas,", 0.2);
        Jook coca = new Jook("Coca cola", 0.6, 1.4);
        joogiPudel.jook = coca;
        double mass = joogiPudel.getMass();
        assertEquals(21.4, mass, 0.1);

    }


    @Test
    public void arvutaKoguHindKuiJookiPole() {
        JoogiPudel joogiPudel = new JoogiPudel(12.0, 20.0, "Klaas,", 0.2);
        double hind = joogiPudel.getKoguhind();
        assertEquals(20.0, hind, 0.1);
    }

    @Test
    public void arvutaKoguHindKuiJookOn(){
        JoogiPudel joogiPudel = new JoogiPudel(12.0, 20.0, "Klaas,", 0.2);
        Jook coca = new Jook("Coca cola", 0.6, 1.4);
        joogiPudel.jook = coca;
        double hind = joogiPudel.getKoguhind();
        assertEquals(21.4, hind, 0.1);

    }
}
