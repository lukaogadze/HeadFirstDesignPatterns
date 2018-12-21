package ge.gov.smartlogic.strategy.adventuregame.gamecharacters;

import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons.BowAndArrowBehavior;

/**
 * Created by loghadze on 17/12/2018.
 */
public class Queen extends GameCharacter {
    public Queen() {
        super(new BowAndArrowBehavior());
    }
}
