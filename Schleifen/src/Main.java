import java.util.Scanner;

public class Main {
    // Länge und Breite deklarieren
    static int laenge;
    static int breite;
    static Scanner derScanner = new Scanner(System.in);

    public static void main(String[] args) {
        willkommen();
        leseLaengeBreite();
        // Abfrage: Ob gefüllt oder ungefüllt gezeichnet werden soll.
        // Ausgabe, Eingabe
        // if - else
        zeichneRechteckGefuellt();
        zeichneRechteckUngefuellt();
        beende();
    }

    static void leseLaengeBreite() {
        // 1. Länge und Breite einlesen
        // Scanner einbinden
        // Zwei Zahlen einlesen und als laenge und breite abspeichern

        System.out.print("Geben Sie die Länge ein: ");
        laenge = derScanner.nextInt();
        System.out.print("Geben Sie die Breite ein: ");
        breite = derScanner.nextInt();
        System.out.println();
    }

    static void zeichneRechteckGefuellt() {
        // 2. Gefülltes Rechteck
        for (int i = 1; i <= laenge; i++) {
            for (int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void zeichneRechteckUngefuellt() {
        // 3. Ungefülltes Rechteck
        System.out.print("Geben Sie die Rahmenstärke an: ");
        int rahmen = derScanner.nextInt();

        // Schleifen - For Schleife
        // Schleifenkopf:   1. Teil:    Zählvariable und Startwert
        //                  2. Teil:    Grenze (Möglich sind hier alle Operatoren)
        //                              <, <=, >, >=, ==, !=
        //                  3. Teil:    Anweisung nach einem Durchlauf
        //                              i++: Erhöhe um eines
        //                              i--: Erniedrige um eins

        // Erste Zeile
        for (int i = 1; i <= rahmen; i++) {
            for (int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        // 2. - vorletzte Zeile
        for (int i = 1; i <= laenge - rahmen * 2; i++) {
            // Rahmen Teil 1 - Teil vor der Aussparung
            for (int k = 1; k <= rahmen; k++) {
                System.out.print("#");
            }
            // Aussparung
            for (int j = 1; j <= breite - 2 * rahmen; j++) {
                System.out.print(" ");
            }
            // Rahemen Teil 2 - Teil nach der Aussparung
            for (int k = 1; k <= rahmen; k++) {
                System.out.print("#");
            }
            // Zeilenumbruch am Ende der Zeile
            System.out.println();
        }
        // Letzte Zeile
        for (int i = 1; i <= rahmen; i++) {
            for (int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void beende() {
        System.out.println("Programm beendet!");
    }

    static void willkommen() {
        System.out.println("Geometrie Zeichner V2.0");

    }
}

#class ##