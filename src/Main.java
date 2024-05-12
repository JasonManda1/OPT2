import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lijst van beschikbare evenementen
        ArrayList<Evenement> evenementen = new ArrayList<>();
        evenementen.add(maakEvenement("Kunstpiraten_Cultuurgebaar", 4, 5, 4, 3, 5));
        evenementen.add(maakEvenement("Ukkieconcert", 5, 6, 0, 5, 0));
        evenementen.add(maakEvenement("Het_Eerste_Avondmaal", 3, 1, 3, 3, 3));
        evenementen.add(maakEvenement("Powerstage", 2, 2, 0, 2, 0));


        // Menu voor het kiezen van evenementen
        boolean doorgaan = true;
        while (doorgaan) {
            System.out.println();
            System.out.println("Welkom bij Hourly");
            System.out.println();
            System.out.println("Kies een evenement om door te gaan:");
            for (int i = 0; i < evenementen.size(); i++) {
                System.out.println((i + 1) + ". " + evenementen.get(i).getNaam());
            }
            System.out.println();
            System.out.println("0. Programma Afsluiten");

            int keuze = scanner.nextInt();
            if (keuze == 0) {
                doorgaan = false;
            } else if (keuze >= 1 && keuze <= evenementen.size()) {
                Evenement evenement = evenementen.get(keuze - 1);
                evenement.toonVerhuur();
                System.out.println();
                System.out.println("Druk op Enter om terug te keren naar het menu.");
                scanner.nextLine(); // Wacht op Enter
                scanner.nextLine(); // Wacht op daadwerkelijke Enter
            } else {
                System.out.println();
                System.out.println("Ongeldige keuze. Probeer opnieuw.");
            }
        }

        scanner.close();
    }

    // Hulpmethode voor het maken van evenementen
    private static Evenement maakEvenement(String naam, int theaterzaal, int techniek, int tafels, int stoelen, int bar) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Theaterzaal("Theaterzaal", theaterzaal));
        items.add(new Techniek("Techniek", techniek));
        items.add(new Tafels("Tafels", tafels));
        items.add(new Stoelen("Stoelen", stoelen));
        items.add(new Bar("Bar", bar));
        return new Evenement(naam, items);
    }
}
