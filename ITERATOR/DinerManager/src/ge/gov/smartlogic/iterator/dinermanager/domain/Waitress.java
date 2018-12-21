package ge.gov.smartlogic.iterator.dinermanager.domain;


import java.util.Iterator;

/**
 * Created by loghadze on 18/12/2018.
 */
public class Waitress {
    private final Menu<MenuItem> pancakeHouseMenu;
    private final Menu<MenuItem> dinerMenu;
    private final Menu<MenuItem> cafeMenu;

    public Waitress(Menu<MenuItem> pancakeHouseMenu, Menu<MenuItem> dinerMenu, Menu<MenuItem> cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerMenuIterator);
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
