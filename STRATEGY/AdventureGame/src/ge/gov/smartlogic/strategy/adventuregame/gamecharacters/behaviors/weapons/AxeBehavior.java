package ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons;

/**
 * Created by loghadze on 17/12/2018.
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Axe Attack!");
    }
}
