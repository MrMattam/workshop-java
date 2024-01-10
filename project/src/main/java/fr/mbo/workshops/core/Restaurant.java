package fr.mbo.workshops.core;

public class Restaurant {

    private Menu menu;

    private void loadMenu(){
        this.menu = new Menu();
        menu.add(new Pizza("Margherita", 11.0f));
        menu.add(new Pizza("Savoyarde", 15.0f));
    }

    public Restaurant(){
        loadMenu();
    }

    public Menu getMenu() {
        return menu;
    }
}
