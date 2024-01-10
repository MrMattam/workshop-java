package fr.mbo.workshops.problem;

public record Etudiant(String nom, int age) {

    public Etudiant{
        if(age < 25 ){
            throw new EtudiantTropVieuxException("L'etudiant est trop jeune");
        }
    }


}
