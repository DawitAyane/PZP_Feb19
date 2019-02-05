# Tag 1

## Kommentare
Werden vom Compiler ignoriert.
### Einzeilig
Eingeleitet mit zwei Schrägstrichen <br>
// Das ist ein Kommentar
### Mehrzeilige
Eingeleitet durch Schrägstrich und Sternchen, beendet durch Sternchen und Schrägstich <br>
/*  Das ist ein mehrzeiliger Kommentar <br>
    Das gehört noch dazu <br>
    Ende des Kommentars */
    
## Ausgaben auf der Konsole
### Mit Zeilenumbruch
System.out.println("Hello World");

### Ohne Zeilenumbruch
System.out.print("Hello World ohne Zeilenumbruch");

### Fehlermeldungen
Fehlermeldungen werden auf der Konsole rot dargestellt. <br>
System.err.print("Fehlermeldung ohne Zeilenumbruch"); <br>
System.err.println("Fehlermeldung mit Zeilenumbruch"); <br>

#Tag 2
## Sonderzeichen auf der Konsole
### Backslash
Um einen \ auszugeben, müssen wir zwei Backslashes ("\\\\") eintragen. <br>
System.out.print("Ein Backslash wird ausgegeben: \\\\"); <br>
Ausgabe: Ein Backslash wird ausgegeben \ <br>
### Neue Zeile
Um eine neue Zeile auszugeben, können wir zusätzlich zu println() auch \\n verwenden. <br>
System.out.print("Neue Zeile \\n"); <br>
System.out.print("Test"); <br>
Ausgabe: Neue Zeile <br>
Test<br><br>
\\n kann jederzeit in einem print() Statement genutzt werden.<br>
System.out.print("Das soll in eine Zeile... \\nDas in die andere.");<br>
Das soll in eine Zeile...<br>
Das in die andere.<br>

### Unicode Zeichen
https://unicode-table.com/de/ <br>
Unicode Zeichen können in einem eigenen String mit \\u gefolgt von der Unicode Codierung eingegeben werden. <br>
System.out.print("Preis: 239" + "\u20ac"); <br>
Ausgabe: Preis: 239€
    