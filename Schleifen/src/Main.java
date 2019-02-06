import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner einbinden
        // Zwei Zahlen einlesen und als laenge und breite abspeichern

       /* Scanner derScanner = new Scanner(System.in);
        System.out.print("Geben Sie die Länge ein: ");
        int laenge = derScanner.nextInt();
        System.out.print("Geben Sie die Breite ein: ");
        int breite = derScanner.nextInt();
        System.out.println("Länge: " + laenge + " Breite: " + breite);*/

        // Schleifen - For Schleife
        // Schleifenkopf:   1. Teil:    Zählvariable und Startwert
        //                  2. Teil:    Grenze (Möglich sind hier alle Operatoren)
        //                              <, <=, >, >=, ==, !=
        //                  3. Teil:    Anweisung nach einem Durchlauf
        //                              i++: Erhöhe um eines
        //                              i--: Erniedrige um eins

        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
