import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner derScanner = new Scanner(System.in);
        // Boolean - true oder false - wahr oder falsch
        boolean antwort;    // Deklaration

        System.out.println("Funktioniert alles wie es soll?");
        antwort = false;
        System.out.println(antwort);

        if (antwort) {
            System.out.println("Lass es so!");
            System.out.println("Es gibt kein Problem!");
        } else {
            System.out.println("Hast du dran rumgefummelt?");
            antwort = false;
            System.out.println(antwort);

            if (antwort) {
                System.out.println("Du Blödmann!");

                System.out.println("Weiß jemand davon?");
                antwort = true;
                System.out.println(antwort);

                if (antwort) {
                    System.out.println("Du armes Schwein!");
                } else {
                    System.out.println("Behalt's für dich!");
                    System.out.println("Es gibt kein Problem!");
                }
            } else {
                System.out.println("Bist du dafür verantwortlich?");
                antwort = true;
                System.out.println(antwort);

                if (antwort) {
                    System.out.println("Kannst du es jemand anderem anhängen?");
                    antwort = true;
                    System.out.println(antwort);

                    if (antwort) {
                        System.out.println("Es gibt kein Problem");
                    } else {
                        System.out.println("Du armes Schwein!");
                    }

                } else {
                    System.out.println("Mehr Glück als Verstand!");
                    System.out.println("Es gibt kein Problem!");
                }

            }
        }


    }
}