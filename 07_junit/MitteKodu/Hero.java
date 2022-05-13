package MitteKodu;

public class Hero {
    String name;
    String race;
    String specialization;
    int heroPrice;

    public Hero(String name, String race, String specialization) {
        this.name = name;
        this.race = race;
        this.specialization = specialization;
        this.heroPrice = heroPrice;

    }

    @Override
    public String toString() {
        return "MitteKodu.Hero{" +
                "name='" + name + '\'' +
        ", race='" + race + '\'' +
        ", specialization='" + specialization + '\'' + ", heroPrice='" + heroPrice +  "}";

    }}
