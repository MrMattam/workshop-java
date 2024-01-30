package fr.mbo.workshops.annotation.exemple1;

public class Utilisateur {
    @LongueurMinimale(valeur = 5)
    private String nom;

    @LongueurMinimale(valeur = 8)
    private String motDePasse;

    public Utilisateur(String nom, String motDePasse) {
        this.nom = nom;
        this.motDePasse = motDePasse;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }
}
