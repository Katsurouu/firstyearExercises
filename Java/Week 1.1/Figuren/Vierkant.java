package Figuren;

public class Vierkant {
    private double lengteZijde1 = 1.0;
    private String achtergrondKleur = "wit";
    private String omtrekkleur = "zwart";

    public Vierkant() {
    }

    public Vierkant(double lengteZijde1, String achtergrondKleur, String omtrekkleur) {
        this.lengteZijde1 = lengteZijde1;
        this.achtergrondKleur = achtergrondKleur;
        this.omtrekkleur = omtrekkleur;
    }

    public double getLengteZijde1() {
        return lengteZijde1;
    }

    public void setLengteZijde1(double lengteZijde1) {
        this.lengteZijde1 = lengteZijde1;
    }

    public String getAchtergrondKleur() {
        return achtergrondKleur;
    }

    public void setAchtergrondKleur(String achtergrondKleur) {
        this.achtergrondKleur = achtergrondKleur;
    }

    public String getomtrekkleur() {
        return omtrekkleur;
    }

    public void setOmtrekkleuir(String omtrekkleur) {
        this.omtrekkleur = omtrekkleur;
    }

    public double berekenOmtrek(){
        return (getLengteZijde1() * 4);
    };

    public void toTekst(){
        System.out.println("De zijden hebben elk een lengte van " + getLengteZijde1() + ", die ervoor zorgen dat de driehoek een omtrek van " + berekenOmtrek() + " heeft.");
    };
}
