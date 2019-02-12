import java.util.Scanner;

public class Wechselgeld {
    public static void main(String[] args) {
        Scanner derScanner = new Scanner(System.in);

        System.out.print("Welcher Betrag soll aufgeteilt werden? ");
        double betrag = derScanner.nextDouble();

        // 500er
        double rest500 = betrag % 500;             // rest500: Was bleibt nach der Modulo Operation
        double aufteilen = betrag - rest500;        // restWert: Was bleibt, wenn ich Rest vom Betrag abziehe
        int anzahl500 = (int)(aufteilen / 500);      // anzahl500: Anzahl an 500er - Scheinen

        // 200er
        double rest200 = rest500 % 200;
        aufteilen = rest500 - rest200;
        int anzahl200 = (int)(aufteilen / 200);

        // 100er
        double rest100 = rest200 % 100;
        aufteilen = rest200 - rest100;
        int anzahl100 = (int)(aufteilen / 100);

        // 50er
        double rest50 = rest100 % 50;
        aufteilen = rest100 - rest50;
        int anzahl50 = (int)(aufteilen / 50);

        // 20er
        double rest20 = rest50 % 20;
        aufteilen = rest50 - rest20;
        int anzahl20 = (int)(aufteilen / 20);

        // 10er
        double rest10 = rest20 % 10;
        aufteilen = rest20 - rest10;
        int anzahl10 = (int)(aufteilen / 10);

        // 5er
        double rest5 = rest10 % 5;
        aufteilen = rest10 - rest5;
        int anzahl5 = (int)(aufteilen / 5);

        // 2er
        double rest2 = rest5 % 2;
        aufteilen = rest5 - rest2;
        int anzahl2 = (int)(aufteilen / 2);

        // 1er
        double rest1 = rest2 % 1;
        aufteilen = rest2 - rest1;
        int anzahl1 = (int)(aufteilen / 1);

        // 50ct
        double rest_50 = rest1 % 0.5;
        aufteilen = rest1 - rest_50;
        int anzahl_50 = (int)(aufteilen / 0.5);

        // 20ct
        double rest_20 = rest_50 % 0.2;
        aufteilen = rest_50 - rest_20;
        int anzahl_20 = (int)(aufteilen / 0.2);

        // 10ct
        double rest_10 = rest_20 % 0.1;
        aufteilen = rest_20 - rest_10;
        int anzahl_10 = (int)(aufteilen / 0.1);

        // 5ct
        double rest_5 = rest_10 % 0.05;
        aufteilen = rest_10 - rest_5;
        int anzahl_5 = (int)(aufteilen / 0.05);

        // 2ct
        double rest_2 = rest_5 % 0.02;
        aufteilen = rest_5 - rest_2;
        int anzahl_2 = (int)(aufteilen / 0.02);

        // 1ct
        double rest_1 = rest_2 % 0.01;
        aufteilen = rest_2 - rest_1;
        int anzahl_1 = (int)(aufteilen / 0.01);



        System.out.println("500: " + "\t" + anzahl500);
        System.out.println("200: " + "\t" + anzahl200);
        System.out.println("100: " + "\t" + anzahl100);
        System.out.println("50: " + "\t" + anzahl50);
        System.out.println("20: " + "\t" + anzahl20);
        System.out.println("10: " + "\t" + anzahl10);
        System.out.println("5: " + "\t\t" + anzahl5);
        System.out.println("2: " + "\t\t" + anzahl2);
        System.out.println("1: " + "\t\t" + anzahl1);
        System.out.println("0,50: " + "\t" + anzahl_50);
        System.out.println("0,20: " + "\t" + anzahl_20);
        System.out.println("0,10: " + "\t" + anzahl_10);
        System.out.println("0,05: " + "\t" + anzahl_5);
        System.out.println("0,02: " + "\t" + anzahl_2);
        System.out.println("0,01: " + "\t" + anzahl_1);

        double probe =  anzahl500*500 + anzahl200*200 + anzahl100*100 +
                        anzahl50*50 + anzahl20*20 + anzahl10*10 + anzahl5*5 +
                        anzahl2*2 + anzahl1*1 +
                        anzahl_50*0.5 + anzahl_20 * 0.2 + anzahl_10 * 0.1 +
                        anzahl_5*0.05 + anzahl_2*0.02 + anzahl_1*0.01;
        System.out.println("\nProbe: " + probe);
    }
}
