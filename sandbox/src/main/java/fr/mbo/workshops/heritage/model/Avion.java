package fr.mbo.workshops.heritage.model;

public class Avion extends Vehicule {
    private int altitudeMax;

    public Avion(String marque, String modele, int anneeFabrication, int altitudeMax) {
        super(marque, modele, anneeFabrication);
        this.altitudeMax = altitudeMax;
    }

    // Méthodes spécifiques à l'avion
    public void decoller() {
        System.out.println("L'avion décolle");
    }

}
