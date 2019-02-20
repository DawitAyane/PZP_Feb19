public class Verzoegerung {
    public static void main(String[] args) {
        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
            pause(250);
        }
        System.out.println("BOOM!");
    }

    static void pause(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
