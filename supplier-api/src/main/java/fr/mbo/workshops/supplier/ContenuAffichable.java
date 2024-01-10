package fr.mbo.workshops.supplier;

import java.util.List;

public interface ContenuAffichable {

    Ligne SEPARATEUR = new Ligne("--------------------------------------------------");

    List<Ligne> chargerContenu();

}
