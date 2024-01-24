package fr.mbo.workshops.supplier;

public class PanneauAffichageDefault {

    protected String SEPARATEUR = "--------------------------------------------------";

    public PanneauAffichageDefault() {
    }

    public void envoyerPourAffichage(ContenuAffichable contenu) {
        contenu.chargerContenu()
                .stream()
                .map(Ligne::ligne)
                .map(it -> "| " + it)
                .map(it -> String.format("%-50s",it) + "x")
                .map(it -> it.subSequence(0, 50) + " |" )
                .forEach(System.out::println);
    }

}
