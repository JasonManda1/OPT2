import java.util.ArrayList;

// Klasse voor evenementen
class Evenement {
    private String naam;
    private ArrayList<Item> items;

    public Evenement(String naam, ArrayList<Item> items) {
        this.naam = naam;
        this.items = items;
    }

    public Evenement (String naam) {
        this.naam = naam;

    }

    public String getNaam() {
        return naam;
    }

    public void toonVerhuur() {
        System.out.println();
        System.out.println("Evenement: " + naam);
        System.out.println();
        System.out.println("Verhuurde items:");
        for (Item item : items) {
            System.out.println("- " + item + ": " + item.duur() + " uur");
        }
    }
}
