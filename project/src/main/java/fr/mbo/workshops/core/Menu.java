package fr.mbo.workshops.core;

import fr.mbo.workshops.supplier.ContenuAffichable;
import fr.mbo.workshops.supplier.Ligne;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ContenuAffichable {

    private final List<Pizza> pizzas = new ArrayList<>();

    public void add(Pizza pizza) {
        pizzas.add(pizza);
    }

    @Override
    public List<Ligne> chargerContenu() {

        List<Ligne> contenu = new ArrayList<>();
        contenu.add(SEPARATEUR);
        contenu.add(new Ligne("- MENU "));
        contenu.add(SEPARATEUR);
        pizzas.forEach(pizza -> contenu.add(new Ligne(pizza.toString())));
        contenu.add(SEPARATEUR);

        return contenu;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }
}
