import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        // While Schleife
    Scanner derScanner = new Scanner(System.in);
//        int zahl = 5;
//
//        // Achtung! Bedingung sollte nicht zu einer Dauerschleife führen.
//        while(zahl > 0) {
//            System.out.println("Zahl ist größer 0!");
//            zahl--;
//        }
//
//        while(true) {
//
//            System.out.println("Endlosschleife");
//
//            System.out.print("Nochmal? ");
//            if(derScanner.nextInt() == 0) {
//                break;
//            }
//        }

        System.out.print("Zahl eingeben: ");
        int zahl = derScanner.nextInt();

        if(zahl == 0) {
            System.out.println("Zahl ist 0");
        }
        else if (zahl == 1) {
            System.out.println("Zahl ist 1");
        }
        else if (zahl == 2) {
            System.out.println("Zahl ist 2");
        }
        else if (zahl > 20 && zahl < 30) {
            System.out.println("Zahl ist größer als 20");
        }
        else {
            System.out.println("Zahl ist nicht 0, 1 oder 2");

        }

        switch(zahl) {
            // if(zahl == 0)
            case 0:
                System.out.println("Zahl ist 0");
                break;
            // if(zahl == 1)
            case 1:
                System.out.println("Zahl ist 1");
                break;
            // if(zahl == 2)
            case 2:
                System.out.println("Zahl ist 2");
                break;
            case 15:
            case 10:
                System.out.println("Zahl ist 10 oder größer");
                break;

            // else
            default:
                if(zahl > 20) {
                    System.out.println("Zahl größer 20");
                }
                //System.out.println("Zahl ist nicht 0, 1 oder 2");
                break;
        }
    }
}
