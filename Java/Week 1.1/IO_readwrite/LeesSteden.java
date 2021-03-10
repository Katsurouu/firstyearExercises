package IO_readwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LeesSteden {

    public static void printStedenUitBestand(String bestandsnaam) {
        File file = new File(bestandsnaam);
        StringBuilder volledigeTekst = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String regel = bufferedReader.readLine();
            while (regel != null) {
                volledigeTekst.append(regel).append(" ");
                regel = bufferedReader.readLine();
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        ArrayList<String> tekst = new ArrayList<>(Arrays.asList(volledigeTekst.toString().split(" ")));
        for (String regel : tekst) {
            if (!regel.matches(".*\\d.*")) {
                System.out.println(regel);
            }
        }

    }
}
