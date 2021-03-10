package IO_readwrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SchrijfBestand {

    public static void schrijfStedenNaarBestand(String bestandsnaam) {
        LeesSteden.printStedenUitBestand(bestandsnaam);
        PrintWriter printWriter = null;
        FileWriter fileWriter = null;
        try {
            File myFile = new File(bestandsnaam);
            fileWriter = new FileWriter(myFile, true);
            printWriter = new PrintWriter(myFile);

            printWriter.append("Amsterdam 900000\n");
            printWriter.append("Bunnink 500\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

