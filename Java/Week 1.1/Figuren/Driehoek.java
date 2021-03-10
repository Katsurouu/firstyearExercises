package Figuren;

public class Driehoek {
    private double lengteZijde1 = 1.0;
    private double lengteZijde2 = 1.0;
    private double lengteZijde3 = 1.0;
    private String achtergrondkleur = "wit";
    private String omtrekkleur = "zwart";

    public Driehoek() {

    }

    public Driehoek(double lengteZijde1, double lengteZijde2, double lengteZijde3, String achtergrondkleur, String omtrekkleur) {
        this.lengteZijde1 = lengteZijde1;
        this.lengteZijde2 = lengteZijde2;
        this.lengteZijde3 = lengteZijde3;
        this.achtergrondkleur = achtergrondkleur;
        this.omtrekkleur = omtrekkleur;
    }

    public double getLengteZijde1() {
        return lengteZijde1;
    }

    public void setLengteZijde1(double lengteZijde1) {
        this.lengteZijde1 = lengteZijde1;
    }

    public double getLengteZijde2() {
        return lengteZijde2;
    }

    public void setLengteZijde2(double lengteZijde2) {
        this.lengteZijde2 = lengteZijde2;
    }

    public double getLengteZijde3() {
        return lengteZijde3;
    }

    public void setLengteZijde3(double lengteZijde3) {
        this.lengteZijde3 = lengteZijde3;
    }

    public String getAchtergrondkleur() {
        return achtergrondkleur;
    }

    public void setAchtergrondkleur(String achtergrondkleur) {
        this.achtergrondkleur = achtergrondkleur;
    }

    public String getOmtrekkleur() {
        return omtrekkleur;
    }

    public void setOmtrekkleur(String omtrekkleur) {
        this.omtrekkleur = omtrekkleur;
    }

    public double berekenOmtrek(){
        return (getLengteZijde1() + getLengteZijde2() + getLengteZijde3());
    };

    public void toTekst(){
        System.out.println("De zijden hebben de lengtes " + getLengteZijde1() + "," + getLengteZijde2() + "," + getLengteZijde3() + ", die ervoor zorgen dat de driehoek een omtrek van " + berekenOmtrek() + " heeft.");
    };
}
