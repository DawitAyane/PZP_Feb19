import java.util.Scanner;
public class TicTacToe {
    // Golbale Variablen
    static int[][] feld = new int[3][3];
    static Scanner derScanner = new Scanner(System.in);
    static boolean freiesFeld = true;
    static int aktSpieler = 1;

    public static void main(String[] args) {
        // Spielfeld mit 0 füllen
        initFeld();

        // Spielablauf
        while(freiesFeld) {
            // Spielstein setzen
            System.out.print("X: ");
            int x = derScanner.nextInt();
            System.out.print("Y: ");
            int y = derScanner.nextInt();
            boolean freiesFeld = pruefeFeld(x,y);
            if(pruefeFeld(x, y)) {
                setzeStein(x, y, aktSpieler);
                spielerWechseln();
            }

            // Spielfeld ausgeben
            gebeFeld();

            // Prüfe, ob noch freie Felder vorhanden
            pruefeFeld();
        }
    }

    // Einzelnes Feld prüfen
    static boolean pruefeFeld(int x, int y) {
        if(feld[x][y] == 0) {
            return true;
        }
        return false;
    }

    // Spieler wechseln
    static void spielerWechseln() {
        aktSpieler = (aktSpieler == 1) ?  -1 : 1;       // Ternärer Operator
    }
    // Spielstein setzen
    static void setzeStein(int x, int y, int wert) {
        feld[x][y] = wert;
    }

    // Spielfeld initialisieren
    static void initFeld() {
        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 3; x++) {
                feld[x][y] = 0;
            }
        }
    }




    // Prüfe Feld
    static void pruefeFeld() {
        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 3; x++) {
                if(feld[x][y] == 0) {
                    // Es wurde ein freies Feld gefunden
                    return;
                }
            }
        }

        // Es wurde kein Freies Feld gefunden
        freiesFeld = false;
    }

    // Spielfeld ausgeben
    static void gebeFeld() {
        for(int y = 2; y >= 0; y--) {
            for(int x = 0; x < 3; x++) {
                System.out.print("[");
                switch(feld[x][y]){
                    case 1:
                        System.out.print("X");
                        break;
                    case -1:
                        System.out.print("O");
                        break;
                    case 0:
                        System.out.print(" ");
                        break;
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }
}

