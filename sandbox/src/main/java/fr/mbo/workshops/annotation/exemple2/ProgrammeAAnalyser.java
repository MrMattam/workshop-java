package fr.mbo.workshops.annotation.exemple2;

public class ProgrammeAAnalyser {

        @MesurerTempsExecution
        public void methodeLongue() {
            try {
                Thread.sleep(1000); // Simule un traitement long
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        @MesurerTempsExecution
        public void methodeRapide() {
            // Exécute une tâche rapidement
        }

        public static void main(String[] args) {
            ProgrammeAAnalyser exemple = new ProgrammeAAnalyser();
            MesureurDeTemps.executerAvecMesureTemps(exemple);
        }


}
