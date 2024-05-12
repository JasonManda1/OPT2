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
        System.out.println("Hier zie je alle verhuurde items:");
        System.out.println();
        for (Item item : items) {
            System.out.println("- " + item + ": " + item.duur() + " uur");
        }
    }

    public void toonPrijs() {
        System.out.println();
        System.out.println("Hier zie je in totaal de kosten voor elk verhuurde item: ");
        for (Item item : items) {
            System.out.println("- " + item + ": " + item.berekenPrijs() + " uur");
        }
    }
}
