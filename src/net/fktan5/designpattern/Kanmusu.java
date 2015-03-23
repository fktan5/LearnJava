package net.fktan5.designpattern;

/**
 * Builderパターン。
 * Created by nakamura on 15/03/11.
 */
public class Kanmusu {
    //BaseInfo
    private String name;
    private String shipType;
    private String shipSpecies;
    private String rarity;

    private KanmusuParameters mKanmusuParameters;

    public Kanmusu() {
    }

    private Kanmusu(Builder builder) {
        this.name = builder.name;
        this.shipSpecies = builder.shipSpecies;
        this.shipType = builder.shipType;
    }

    public String getInfo() {
        String str = shipType + "型" + shipSpecies + "、" + name + "です。";
        return str;
    }

    public static class Builder {
        private String name;
        private String shipType;
        private String shipSpecies;
        private int endurance;
        private int armor;

        public Builder() {
        }

        public Builder(String name, String shipType, String shipSpecies, int endurance, int armor) {
            this.name = name;
            this.shipType = shipType;
            this.shipSpecies = shipSpecies;
            this.armor = armor;
            this.endurance = endurance;
        }

        public Builder shipType(String shipType) {
            this.shipType = shipType;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder shipSpecies(String shipSpecies) {
            this.shipSpecies = shipSpecies;
            return this;
        }

        public Builder endurance(int endurance) {
            this.endurance = endurance;
            return this;
        }

        public Builder armor(int armor) {
            this.armor = armor;
            return this;
        }

        public Kanmusu build() {
            if (name == null || shipSpecies == null || shipType == null) {
                throw new NullPointerException();
            }

            return new Kanmusu(this);
        }
    }
}
