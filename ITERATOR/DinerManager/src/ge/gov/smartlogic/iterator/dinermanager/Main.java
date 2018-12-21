package ge.gov.smartlogic.iterator.dinermanager;

import ge.gov.smartlogic.iterator.dinermanager.domain.CafeMenu;
import ge.gov.smartlogic.iterator.dinermanager.domain.DinerMenu;
import ge.gov.smartlogic.iterator.dinermanager.domain.Menu;
import ge.gov.smartlogic.iterator.dinermanager.domain.MenuItem;
import ge.gov.smartlogic.iterator.dinermanager.domain.PancakeHouseMenu;
import ge.gov.smartlogic.iterator.dinermanager.domain.Waitress;

public class Main {

    public static void main(String[] args) {
        Menu<MenuItem> pancakeHouseMenu = new PancakeHouseMenu();
        Menu<MenuItem> dinerMenu = new DinerMenu();
        Menu<MenuItem> cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
