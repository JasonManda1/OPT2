import java.util.Scanner;
public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void printMenu () {
        System.out.println("Welkom bij het hoofdmenu van Hourly");
        System.out.println();
        System.out.println("Kies een evenement om de uren te bekijken: ");
        System.out.println("1: Kunstpiraten__Cultuurgebaar");
        System.out.println("2: UkkieConcert");
        System.out.println("3: Het_Eerste_Avondmaal");
        System.out.println("4: Powerstage");
    }


    public void menuStart() {
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Voer uw keuze in: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    Kunstpiraten__Cultuurgebaar();
                    break;
                case 2:
                    UkkieConcert();
                    break;
                case 3:
                    Het_Eerste_Avondmaal();
                    break;
                case 4:
                    PowerStage();
                    break;
                case 5:
                    running = false;
                    System.out.println("Programma wordt afgesloten.");
                    break;

                default:
                    System.out.println("Dit is een ongeldige keuze. Probeer het opnieuw.");
            }
        }
    }

    public void Kunstpiraten__Cultuurgebaar () {

        System.out.println("Je bekijkt hier alle gegevens van het Evenement");


    }

    public void UkkieConcert () {


    }

    public void Het_Eerste_Avondmaal () {


    }

    public void PowerStage(){


    }
}