package ArrayList;

import java.util.ArrayList;

public class PersonenApp {
    public static void main(String[] args) {
        Persoon p1 = new Persoon("Bart", 20);
        Persoon p2 = new Persoon("Barta", 21);
        Persoon p3 = new Persoon("Barte", 22);
        Persoon p4 = new Persoon("Barti", 23);
        Persoon p5 = new Persoon("Barto", 24);
        Persoon p6 = new Persoon("Barty", 25);
        ArrayList<Persoon> personenlijst = new ArrayList<>();
        personenlijst.add(p1);
        personenlijst.add(p2);
        personenlijst.add(p3);
        personenlijst.add(p4);
        personenlijst.add(p5);
        personenlijst.add(p6);

    }

    public static void vindLettersEnPrint(ArrayList<Persoon> personen, String letters) {
        for (Persoon persoon : personen) {
            if (persoon.bevatLetters(letters)) {
                System.out.println(persoon.getNaam());
            }
        }
    }

    }
}
