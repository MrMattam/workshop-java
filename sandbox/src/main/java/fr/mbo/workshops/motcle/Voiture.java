package fr.mbo.workshops.motcle;

import fr.mbo.workshops.heritage.model.Vehicule;

public class Voiture extends Vehicule {
    private final int nombrePortes;

    public Voiture(String marque, String modele, int anneeFabrication, int nombrePortes) {
        super(marque, modele, anneeFabrication);
        this.nombrePortes = nombrePortes;
    }

    public void changerPortes(){
        //nombrePortes = 5
    }
    public void klaxonner() {
        System.out.println("La voiture klaxonne");
    }

    public static void voitureLaPlusRapideDuMonde(){
        System.out.println("C'est une fusée !");
    }

}