public class Kanal {
    String kanaliNimi;
    String kanaliInfo;
    Video videoInfo;
    int tellijateArv;

    public Kanal(String kanaliNimi, String kanaliInfo, int tellijateArv, Video videoInfo) {
        this.videoInfo = videoInfo;
        this.kanaliNimi = kanaliNimi;
        this.kanaliInfo = kanaliInfo;
        this.tellijateArv = tellijateArv;
    }

    public String getInfo() {
        return "Kanal on nimega: " + this.kanaliNimi + ". Kanalil on " + this.tellijateArv + " tellijat. Kanali infotabel ütleb järgmist: " + this.kanaliInfo + ". \nUusima video info on: " + this.videoInfo;
    }
}

