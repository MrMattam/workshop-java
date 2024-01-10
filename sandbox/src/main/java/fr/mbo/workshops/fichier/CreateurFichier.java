package fr.mbo.workshops.fichier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateurFichier {


    public static void main(String[] args) throws IOException {

        // target/classes/
        File fichier = new File(CreateurFichier.class.getResource("/").getFile() + "MonFichier.txt");
        fichier.createNewFile();

        FileWriter writer = new FileWriter(fichier);
        writer.write("Hello World");
        writer.close();


    }

}
