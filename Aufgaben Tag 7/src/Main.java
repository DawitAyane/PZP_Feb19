import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int anzahl = 1;
        Scanner derScanner = new Scanner(System.in);
        boolean nochmal = true;
        while(nochmal && anzahl <= 5) {
            // Zufallszahlen mit Math.random() halten sich zwischen 0 und 1 auf.
            // Wollen wir gewisse Grenzen vorgeben, können wir das mit *(obereGrenze-untereGrenze) + untereGrenze
            // In userem Fall: untereGrenze = 1, obereGrenze = 6
            // Durch Einsetzen erhalten wir Math.random() * 5 + 1
            // Wollen wir ganze Zahlen, müssen wir noch runden.
            // Dazu setzen wir den ganzen Ausdruck in Math.round() ein. (Zwischen die runden Klammern)
            // Math.round( *hier * )
            // Math.round(Math.random() * 5 + 1);

            int zufall = (int) Math.round(Math.random() * 5 + 1);

            // Um Kommazahlen in Ganzzahlen zu wandeln, casten wir auf int
            // (int) muss vor die Zahl / Variable / Ausdruck geschrieben werden
            // Dann wird das Ergebnis ohne Kommateil abgespeichert.

            // Aktuelle Runde ausgeben
            System.out.print("[" + anzahl + "] ");


            switch (zufall) {
                // Verloren
                case 1:
                case 2:
                    System.out.println("Leider verloren! Du hast eine " + zufall + " gewürfelt!");
                    break;
                // Gewonnen
                case 3:
                    System.out.println("Gewonnen! Du hast eine " + zufall + " gewürfelt!");
                    break;
                // Nochmal würfeln
                case 4:
                case 5:
                case 6:
                    System.out.println("Würfel nochmal! Du hast eine " + zufall + " gewürfelt!");
                    break;
            }

            System.out.println("Nochmal?");
            if(derScanner.nextLine().equalsIgnoreCase("nein")) {
                nochmal = false;
            }

            anzahl++;
        }


        // [1] Würfel nochmal! Du hast eine 5 gewürfelt!
        // [2] Würfel nochmal! Du hast eine 5 gewürfelt!
        // [3] Würfel nochmal! Du hast eine 5 gewürfelt!
        // [4] Würfel nochmal! Du hast eine 5 gewürfelt!
        // [5] Würfel nochmal! Du hast eine 5 gewürfelt!



//        double d = 145.8948;
//        d = Math.round(d*1000);
//        d = d / 1000;
//        System.out.println(d);


    }
}
