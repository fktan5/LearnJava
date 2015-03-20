package net.fktan5.designpattern;

import java.util.Date;

/**
 * Singleton Pattern
 *
 * 鎮守府は一つというつもりで
 *
 * Created by nakamura on 15/03/17.
 */
public class Chinjufu {
    private static Chinjufu chinjufu = null;

    public static Chinjufu getInstance(){
        if(chinjufu == null){
            chinjufu = new Chinjufu();
        }
        return chinjufu;
    }

    private String name = "鹿屋基地";
    private Date startDate = new Date();
    public String getName(){
        return name;
    }
}
