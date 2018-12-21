package ge.gov.smartlogic.strategy.adventuregame.gamecharacters;

import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons.AxeBehavior;

/**
 * Created by loghadze on 17/12/2018.
 */
public class King extends GameCharacter {
    public King() {
        super(new AxeBehavior());
    }
}
