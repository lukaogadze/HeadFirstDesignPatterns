package ge.gov.smartlogic.strategy.adventuregame.gamecharacters;

import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons.SwordBehavior;

/**
 * Created by loghadze on 17/12/2018.
 */
public class Knight extends GameCharacter {
    public Knight() {
        super(new SwordBehavior());
    }
}
