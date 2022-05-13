package Kodu;

import MitteKodu.Hero;
import MitteKodu.Tavern;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {
    @Test
    public void mis_ilm_on(){
        Hero hero = new Hero("Magnus", "Human", "Nerd");
        Tavern gold = new Tavern(hero, 1000);
        boolean result = gold.EnoughGold();
        if(result){
            System.out.println("Saad osta seda kangelast");
        }
        else{
            System.out.println("Ei saa osta seda kangelast");
        }}}