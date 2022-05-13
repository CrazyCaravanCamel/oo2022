package MitteKodu;

import java.util.Scanner;

import static MitteKodu.main.gold;

public class Tavern {
    Scanner myGold = new Scanner(System.in);
    Hero hero;
    int price;

    public Tavern(Hero person, int price){
        this.hero = person;
        this.price = price;

    }


    public String getInfo() {
        return "To hire: " + this.hero + ". You need: " + this.price + " gold.";
    }


    public boolean EnoughGold() { return price <= gold;
    }
}