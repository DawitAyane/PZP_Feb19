import java.util.Scanner;
public class Telefonauswahl {
    public static void main(String[] args) {
        Scanner derScanner = new Scanner(System.in);

        // Telefonmenü
        // 1 - Info über Prdukte
            // 1 - Neues Microsoft Surface
            // 2 - Neue Office Suite
            // 3 - Zurück zum Hauptmenü
        // 2 - Produktregistrierung
            // Frage nach Seriennummer
            // Ausgabe: Seriennummer wurde aktiviert
        // 3 - Verbindung zum Kundensupport
        // 4 - Beenden
        boolean nochmal = true;

        while(nochmal) {
            System.out.println("1: Infos über unsere Produkte");
            System.out.println("2: Produktregistrierung");
            System.out.println("3: Kundensuppert");
            System.out.println("4: Ende");

            int auswahl = derScanner.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.println("Neue Produkte");
                    System.out.println("1: Neue Geräte");
                    System.out.println("2: Neue Software");
                    System.out.println("3: Zurück");
                    int auswahl2 = derScanner.nextInt();
                    switch (auswahl2) {
                        case 1:
                            System.out.println("Microsoft Surface");
                            break;
                        case 2:
                            System.out.println("Microsoft Office Suite");
                            break;
                        case 3:
                            System.out.println("Kehre zurück zum Hauptmenü");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Produktregistrierung");
                    break;
                case 3:
                    System.out.println("Verbindung zum Kundensupport wird hergestellt");
                    nochmal = false;
                    break;
                case 4:
                    System.out.println("Gespräch beendet");
                    nochmal = false;
                    break;
            }

        }
    }
}
