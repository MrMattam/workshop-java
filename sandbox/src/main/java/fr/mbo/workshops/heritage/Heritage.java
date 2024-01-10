package fr.mbo.workshops.heritage;

import fr.mbo.workshops.heritage.model.Avion;
import fr.mbo.workshops.heritage.model.Moto;
import fr.mbo.workshops.heritage.model.Vehicule;
import fr.mbo.workshops.heritage.model.Voiture;

import java.util.List;

public class Heritage {

    public static void main(String[] args) {

        Voiture voiture = new Voiture("Peugeot", "207", 2001, 4);
        Avion avion = new Avion("Boeing", "747", 2001, 9000);
        Moto moto = new Moto("Suzuki", "Bandit", 2003, false);

        demarrerFlotte(List.of(voiture, avion, moto));

    }

    public static void demarrerFlotte(List<Vehicule> flotte){
        flotte.forEach(Vehicule::demarrer);
    }




}
