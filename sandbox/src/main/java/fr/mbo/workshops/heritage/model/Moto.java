package fr.mbo.workshops.heritage.model;

public class Moto extends Vehicule {
    private boolean aSidecar;

    public Moto(String marque, String modele, int anneeFabrication, boolean aSidecar) {
        super(marque, modele, anneeFabrication);
        this.aSidecar = aSidecar;
    }

    // Méthodes spécifiques à la moto
    public void faireUnWheelie() {
        System.out.println("La moto fait un wheelie");
    }

}
