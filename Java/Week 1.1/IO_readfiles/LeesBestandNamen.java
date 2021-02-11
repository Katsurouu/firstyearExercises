package IO_readfiles;

import java.io.File;

public class LeesBestandNamen {

    public static void printBestandsNamen(String folder){
        File directFolder = new File(folder);
        File[] listFiles = directFolder.listFiles();

        for (File file : listFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }

    }

}

