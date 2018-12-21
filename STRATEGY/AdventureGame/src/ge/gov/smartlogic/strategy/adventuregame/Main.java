package ge.gov.smartlogic.strategy.adventuregame;

import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.GameCharacter;
import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.King;
import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.Knight;
import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.Queen;
import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.Troll;
import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons.AxeBehavior;
import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons.BowAndArrowBehavior;
import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons.KnifeBehavior;
import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons.SwordBehavior;
import ge.gov.smartlogic.strategy.adventuregame.gamecharacters.behaviors.weapons.WeaponBehavior;

public class Main {

    public static void main(String[] args) {
        GameCharacter king = new King();
        GameCharacter queen = new Queen();
        GameCharacter knight = new Knight();
        GameCharacter troll = new Troll();
        GameCharacter[] characters = {king, queen, knight, troll};
        WeaponBehavior[] behaviors = {new KnifeBehavior(), new SwordBehavior(), new AxeBehavior(), new BowAndArrowBehavior()};

        for (GameCharacter character : characters) {
            character.fight();
            int randomNumber = (int)(Math.random() * 10) % behaviors.length;
            character.setWeaponBehavior(behaviors[randomNumber]);
        }

        System.out.println();

        for (GameCharacter character : characters) {
            character.fight();
        }
    }
}
