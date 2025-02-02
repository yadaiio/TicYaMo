//Ansammlung von den Funktionen, die TicYAMo generell können sollte.
public class TicYaMo {

    //String für das Feld, Schachbrett, regulär leer, für den Aufruf in main müssen sie public sein
    public String a1 = " ";
    public String a2 = " ";
    public String a3 = " "; 
    public String b1 = " "; 
    public String b2 = " "; 
    public String b3 = " "; 
    public String c1 = " "; 
    public String c2 = " "; 
    public String c3 = " ";

    //Methode zum Spiel zeichnen
    public void zeichneSpiel() {
        System.out.println("   | A | B | C |");
        System.out.println("---+---+---+---┤");
        System.out.println(" 1 | " + a1 + " | " + b1 + " | " + c1 + " |");
        System.out.println("---+---+---+---┤");
        System.out.println(" 2 | " + a2 + " | " + b2 + " | " + c2 + " |");
        System.out.println("---+---+---+---┤");
        System.out.println(" 3 | " + a3 + " | " + b3 + " | " + c3 + " |");
        System.out.println("---------------┘");
    }
}
