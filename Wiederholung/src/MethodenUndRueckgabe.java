public class MethodenUndRueckgabe {
    // Globale Variablen
    // Wir definierern mit static
    static String name = "Max";

    public static void main(String[] args) {
        name = "Andre";
        String meinName = "Anton";
        helloWorld();
        helloName();
        helloParam("Gustav");
        System.out.println(gebeName());
        System.out.println(verbinde(meinName, "wie", "geht's?"));
    }

    // Methode ohne Rückgabewert und ohne Parameter
    // void - steht für KEINEN Rückgabewert
    // leeren runden Klammern - keine Parameter werden erwartet
    static void helloWorld() {
        System.out.println("Hello World!");
    }

    // Zugriff auf globale Variablen ist nur dann möglich,
    // wenn diese außerhalb der main Methode definiert wurden.
    static void helloName() {
        System.out.println("Hello " + name + "!");
    }

    // Methoden mit Parameter und ohne Rückgabewert
    // Paramter sind Informationen die wir der Methode bei Aufruf mitgeben
    // Wir definieren die Parameter in den runden Klammern und geben sie bei Aufruf
    // auch dort mit.
    // Wichtig! Datentyp muss gleich sein, Name aber nicht!
    static void helloParam(String parameter) {
        System.out.println("Hello " + parameter + "!");
    }

    // Methode mit Rückgabewert und ohne Parameter
    // Gibt einen String zurück, das sehen wir an dem Schlüsselwort String, wo sonst void stand.
    // Kann immer dann genutzt werden, wo wir sonst Strings genutzt haben.
    static String gebeName() {
        // Vor dem return Statement, darf alles stehen, was wir bisher angewandt haben!
        return "Max Frisch";
    }

    // Methoden mit Parameter und mit Rückgabewert
    // Nimmt Paramter an, in unserem Fall drei Worte und gibt sie als Ganzes, getrennt durch Leerzeichen zurück.
    static String verbinde(String wort1, String wort2, String wort3) {
        return (wort1 + " " + wort2 + " " + wort3);
    }

    // Methode mit Rückgabewert - ABER INT, nicht String
    static int gebeZahl() {
        return 324;
    }
}
