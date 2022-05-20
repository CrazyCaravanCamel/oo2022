public class Main {

    public static void main(String[] args) {

        Raisakotkas raisakotkas = new Raisakotkas();
        raisakotkas.suudanLennata();
        raisakotkas.onTiivad();

        Pingviin pingviin = new Pingviin();
        pingviin.eiSuudaLennata();
        pingviin.onTiivad();

        Pääsuke pääsuke = new Pääsuke();
        pääsuke.suudanLennata();
        pääsuke.onTiivad();

        Gorilla gorilla = new Gorilla();
        gorilla.olenImetaja();
        gorilla.soonTaimi();

        Gepard gepard = new Gepard();
        gepard.olenKaslane();
        gepard.soonLiha();


        Metskits metskits = new Metskits();
        metskits.olenImetaja();
        metskits.soonTaimi();

        Rästik rästik = new Rästik();
        rästik.olenRoomaja();

    }
}
