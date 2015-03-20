package net.fktan5.designpattern;

/**
 * Created by nakamura on 15/03/17.
 */
public class Weapon {
    private String name;
    private int reality;
    private int type;
    private String typeName;
    private String effect;

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReality() {
        return reality;
    }

    public void setReality(int reality) {
        this.reality = reality;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean fire(){
        System.out.print("全砲門開け！");
        return true;
    }
}
