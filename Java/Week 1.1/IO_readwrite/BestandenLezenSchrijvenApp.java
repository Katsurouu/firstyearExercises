package IO_readwrite;

public class BestandenLezenSchrijvenApp {
    public static void main(String[] args) {
        LeesSteden.printStedenUitBestand("plaatsen.txt");
        SchrijfBestand.schrijfStedenNaarBestand("plaatsen.txt");
        LeesSteden.printStedenUitBestand("plaatsen.txt");
    }
}
