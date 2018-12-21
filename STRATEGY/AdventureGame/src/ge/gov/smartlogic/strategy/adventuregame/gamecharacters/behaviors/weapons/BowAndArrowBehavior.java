package ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons;

/**
 * Created by loghadze on 17/12/2018.
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Bow and arrows Attack!");
    }
}
