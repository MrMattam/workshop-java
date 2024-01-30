package fr.mbo.workshops.annotation.exemple1;

import java.lang.reflect.Field;

public class Main {

    public static boolean validerUtilisateur(Utilisateur utilisateur) {
        Field[] champs = utilisateur.getClass().getDeclaredFields();

        for (Field champ : champs) {
            if (champ.isAnnotationPresent(LongueurMinimale.class)) {
                champ.setAccessible(true);
                LongueurMinimale annotation = champ.getAnnotation(LongueurMinimale.class);
                try {
                    String valeur = (String) champ.get(utilisateur);
                    if (valeur.length() < annotation.valeur()) {
                        System.out.println("Le champ " + champ.getName() + " doit avoir au moins " + annotation.valeur() + " caractères.");
                        return false;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Utilisateur utilisateur = new Utilisateur("Jean", "password123");
        boolean estValide = validerUtilisateur(utilisateur);
        System.out.println("Validation de l'utilisateur : " + estValide);
    }
}
