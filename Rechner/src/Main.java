import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner derScanner = new Scanner(System.in);
        System.out.print("A: ");
        double a = derScanner.nextDouble();
        System.out.print("B: ");
        double b = derScanner.nextDouble();
        // Folgende Zeile dient als Bug Fix, da der Scanner sonst bei der nächsten Eingabe einen Fehler ausgibt
        derScanner.nextLine();
        System.out.print("Operation [+,-,*,/,%]: ");
        char operation = derScanner.nextLine().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(a + " + " + b + " = " + addiere(a, b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + subtrahiere(a, b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + multipliziere(a, b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + dividiere(a, b));
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + modulo(a, b));
                break;
        }


    }


    static double addiere(double a, double b) {
        return a + b;
    }

    static double subtrahiere(double a, double b) {
        return a - b;
    }

    static double multipliziere(double a, double b) {
        return a * b;
    }

    static double dividiere(double a, double b) {
        return a / b;
    }

    static double modulo(double a, double b) {
        return a % b;
    }
}
