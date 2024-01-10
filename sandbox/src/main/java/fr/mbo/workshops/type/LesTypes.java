package fr.mbo.workshops.type;

public class LesTypes {

    public static void main(String[] args) {
        PanneauSolaire panneauSolaire = new PanneauSolaire();

        panneauSolaire.capaciteMax = 50;                    // Valeur maximale de capacité (petit nombre)
        panneauSolaire.nombreCellules = 4444;               // Nombre de cellules solaires (nombre court)
        panneauSolaire.anneeFabrication = 655555555;        // Année de fabrication
        panneauSolaire.identifiant = 999995559594545454L;   // Identifiant unique sur une longue plage
        panneauSolaire.efficacite = 12.12f;                 // Efficacité en pourcentage (nombre avec virgule flottante)
        panneauSolaire.prix = 12.2121212;                   // Prix en euros (nombre à virgule flottante avec plus de précision)
        panneauSolaire.type = 'C';                          // Type de panneau (un caractère, par exemple 'A', 'B', etc.)
        panneauSolaire.enFonction = false;                  // Indique si le panneau est en fonction ou non
    }

}
