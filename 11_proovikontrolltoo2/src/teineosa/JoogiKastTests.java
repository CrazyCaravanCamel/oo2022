package teineosa;

import org.junit.Test;

public class JoogiKastTests {

    @Test
    public void t2idaPudelKuiSaab() {
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook();
        JoogiPudel joogiPudel = new JoogiPudel();
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        joogiKast.getMass(14);
    }
}
