// Scanner importieren, damit wir ihn später verwenden können.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner
        Scanner derScanner = new Scanner(System.in);

        System.out.println("Wie heißt du?");
        String name = derScanner.nextLine();
        System.out.println("Aha, du bist also " + name);
        System.out.println("Woher kommst du?");
        String herkunft = derScanner.nextLine();
        System.out.println("Interessant, aus " + herkunft);
        System.out.println("Wie alt bist du?");
        int alter = derScanner.nextInt();
        System.out.println(alter + " Jahre");

        // Prüfe Zahl ab
        int antwort;

        System.out.println("Frage");
        antwort = derScanner.nextInt();
        if(antwort == 1) {
            // Wenn ja
        }
        else {
            // Wenn nein
        }

        String response;
        System.out.println("Frage");
        response = derScanner.nextLine();
        // Vorgestellt von Sören

        if(response.equalsIgnoreCase("ja")) {

        } else {

        }

    }
}
