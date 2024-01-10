package fr.mbo.workshops.supplier;

public class PanneauAffichageDefault {

    protected String SEPARATEUR = "--------------------------------------------------";

    public PanneauAffichageDefault() {
    }

    public void envoyerPourAffichage(ContenuAffichable contenu) {
        contenu.chargerContenu()
                .stream()
                .map(Ligne::ligne)
                .forEach(System.out::println);
    }

}
