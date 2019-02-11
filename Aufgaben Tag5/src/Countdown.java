import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner derScanner = new Scanner(System.in);
        System.out.print("Startwert: ");
        int startwert = derScanner.nextInt();

        // Zur Wiederholung: Countup
        for(int i = 0; i <= startwert; i++) {
            System.out.print(i + " ");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println();

        // Eigentliche Aufgabe: Countdown
        for(int i = startwert; i >= 0; i--) {
            System.out.print(i + " ");

            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
