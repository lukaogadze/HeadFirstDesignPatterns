package ge.gov.smartlogic.strategy.adventuregame.gamecharacters;

import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons.WeaponBehavior;

/**
 * Created by loghadze on 17/12/2018.
 */
public abstract class GameCharacter {
    private WeaponBehavior weaponBehavior;

    protected GameCharacter(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }
}
