public class Arrays {
    public static void main(String[] args) {
        // Direkte Initialisierung
        String[] namen = {"Hans", "Peter", "Maria", "Mark", "Max", "Magda", "Christoph"};

        // Indirekte Initialisierung
        int[] alter = new int[7];

        alter[0] = 20;
        alter[1] = 53;
        alter[2] = 32;
        alter[3] = 23;
        alter[4] = 16;
        alter[5] = 93;
        alter[6] = 22;

        // Auslesen können wir beide gleich!
        for(int i = 0; i < namen.length; i++) {
            System.out.println(namen[i] + " ist " + alter[i] + " Jahre alt!");
        }
    }
}
