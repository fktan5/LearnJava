package net.fktan5.designpattern;

/**
 * Created by nakamura on 15/03/18.
 */
public class BattleShipAdapter extends Kanmusu implements BattleShip {
    private Weapon mWeapon;

    public BattleShipAdapter(){
        mWeapon = new Weapon();
    }

    @Override
    public boolean fire() {
        return mWeapon.fire();
    }
}
