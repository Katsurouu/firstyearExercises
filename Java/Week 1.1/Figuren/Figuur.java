package Figuren;

public class Figuur {
    private double lengteZijde1;
    private String achtergrondkleur;
    private String omtrekkleur;

    public Figuur() {
    }

    public Figuur(double lengteZijde1, String achtergrondkleur, String omtrekkleur) {
        this.lengteZijde1 = lengteZijde1;
        this.achtergrondkleur = achtergrondkleur;
        this.omtrekkleur = omtrekkleur;
    }

    public double getLengteZijde1() {
        return lengteZijde1;
    }

    public void setLengteZijde1(double lengteZijde1) {
        this.lengteZijde1 = lengteZijde1;
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
}
