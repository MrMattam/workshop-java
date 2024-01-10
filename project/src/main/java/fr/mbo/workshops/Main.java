package fr.mbo.workshops;

import fr.mbo.workshops.core.Restaurant;
import fr.mbo.workshops.supplier.PanneauAffichageDefault;

public class Main {
    public static void main(String[] args) {
        PanneauAffichageDefault panneau = new PanneauAffichageDefault();
        Restaurant restaurant = new Restaurant();
        panneau.envoyerPourAffichage(restaurant.getMenu());
    }
}