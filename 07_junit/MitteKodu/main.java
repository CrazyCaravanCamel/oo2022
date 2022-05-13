package MitteKodu;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import MitteKodu.Tavern;

import static org.junit.Assert.assertEquals;

public class main {
    static ArrayList<String> heroes = new ArrayList<String>();
    static int gold = 1000;
    public static void main(String[] args){
        Hero one = new Hero("Johny", "Orc", "Warrior");
        Hero two = new Hero("Grandalf", "Elf", "Sorcerer");
        Tavern tavern = new Tavern(one,  1000);
        Tavern tavern1 =  new Tavern(two, 2500);
        heroes.add(String.valueOf(tavern));
        heroes.add(String.valueOf(tavern1));
        Scanner scanner = new Scanner(System.in);

        String tavernHero = String.valueOf(tavern.getInfo());
        System.out.println(tavernHero);
        String tavern1Hero = String.valueOf(tavern1.getInfo());
        System.out.println(tavern1Hero);
        System.out.println("You currently have " + gold + " gold.");

        if(gold >= tavern.price || gold >= tavern1.price){
            System.out.println("Do you want to hire any of these heroes ?");
            String answer = scanner.next();
            while(answer != "yes" || answer != "no"){
                if(Objects.equals(answer, "yes")){
                    System.out.println("Enter a number of hero you want to hire: ");
                    int choice = scanner.nextInt();
                    System.out.println(heroes.get(choice - 1) + " has been hired");
                }
                else{
                    System.exit(0);
                }


            }}
        else{
            System.out.println("You don't have enough gold to hire any heroes!");
        }



    }
}