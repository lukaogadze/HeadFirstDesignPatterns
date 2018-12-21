package ge.gov.smartlogic.strategy.adventuregame.gamecharacters;

import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons.KnifeBehavior;

/**
 * Created by loghadze on 17/12/2018.
 */
public class Troll extends GameCharacter {
    public Troll() {
        super(new KnifeBehavior());
    }
}
