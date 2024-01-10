package fr.mbo.workshops.heritage.model;

public class Vehicule {
    private final String marque;
    private final String modele;
    private final int anneeFabrication;

    public Vehicule(String marque, String modele, int anneeFabrication) {
        this.marque = marque;
        this.modele = modele;
        this.anneeFabrication = anneeFabrication;
    }

    // Méthodes communes à tous les véhicules
    public void demarrer() {
        System.out.println(this.getClass().getSimpleName() + " " + this.marque + " vient de démarrer");
    }

    public void arreter() {
        System.out.println("Le véhicule s'arrête");
    }

    protected void afficherNumeroChassis(){
        System.out.println(anneeFabrication+modele);
    }
}