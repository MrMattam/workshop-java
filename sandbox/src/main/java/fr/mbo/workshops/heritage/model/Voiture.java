package fr.mbo.workshops.heritage.model;

public class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(String marque, String modele, int anneeFabrication, int nombrePortes) {
        super(marque, modele, anneeFabrication);
        this.nombrePortes = nombrePortes;
    }

    // Méthodes spécifiques à la voiture
    public void klaxonner() {
        System.out.println("La voiture klaxonne");
    }

}
