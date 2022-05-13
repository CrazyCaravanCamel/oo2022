package teineosa;

import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JoogivaatTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void t2idaPudelKuiSaab() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, 0.2, "Plastik", 0.1);
        Joogivaat joogivaat = new Joogivaat(12.8, 3);
        boolean isT2idetud = joogivaat.t2idaJoogipudel(joogiPudel);
        assertTrue(isT2idetud);
    }

    @Test
    public void t2idaPudelKuiEiSaa() {

    }


    @Test
    public void villidaSaabNull() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, 0.2, "Plastik", 0.1);
        Joogivaat joogivaat = new Joogivaat(12.8, 3);
        int pudeliteArv = joogivaat.villiPudelid(joogiPudel);
        assertEquals(0, pudeliteArv);
    }


    @Test
    public void villidaSaabRohkemKuiNull() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, 0.2, "Plastik", 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 3);
        int pudeliteArv = joogivaat.villiPudelid(joogiPudel);
        assertEquals(6, pudeliteArv);
    }
}
