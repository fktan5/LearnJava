package net.fktan5;

import net.fktan5.designpattern.BattleShip;
import net.fktan5.designpattern.BattleShipAdapter;
import net.fktan5.designpattern.Chinjufu;
import net.fktan5.designpattern.Kanmusu;


public class Main {

    public static void main(String[] args) {
        System.out.println("艦これで練習。デザインパターン");

        Kanmusu fuso = new Kanmusu.Builder()
                .name("扶桑")
                .shipType("扶桑")
                .shipSpecies("戦艦")
                .armor(79).endurance(67).build();

        System.out.println(fuso.getInfo());


        Chinjufu chinjufu = Chinjufu.getInstance();
        System.out.println(chinjufu.getName());

        BattleShip mutsu = new BattleShipAdapter();
        mutsu.fire();

    }
}
