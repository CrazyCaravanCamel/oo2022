import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Video video = new Video(12.48, "Top 10 TOP 10s within my TOP 10 TOP 10s", "Tragöödia", 3, 0.15);
        Kanal kanal = new Kanal("MadMinerMonkey Gaming", "Laen üles oma poliitilisi vaateid", 1468, video);

        Scanner tellimus = new Scanner(System.in);
        String valik;



        String kanaliInfo = kanal.getInfo();
        System.out.println(kanaliInfo);
        System.out.println("Kas soovite kanali tellida?[yes/no]");
        valik = tellimus.nextLine();
        if (valik.contains ("yes")) {
            System.out.println("Olete kanali tellinud!");
            kanal.tellijateArv += 1;
            System.out.println("Tellijate arv on nüüd " + kanal.tellijateArv);
        } else if (valik.contains("no")) {
            System.out.println("Kanal pole tellitud!");
        } else {
            System.out.println("Sisestus polnud arusaadav, kanal on tellimata!");
        }
    }
}
