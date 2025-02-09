import java.util.Scanner;
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

    //Der eigentliche Spieler
    public String player = "x";

    tools tool = new tools();
    Scanner nextTurnScanner = new Scanner(System.in);

    //Methode zum Spiel zeichnen
    public void zeichneSpiel() {

        //Aufruf der Methode "clear" des Klassenobjekts "tool" -> Klasse: tool
        tool.clear();

        System.out.println( " " + player + " | A | B | C |");
        System.out.println("---+---+---+---┤");
        System.out.println(" 1 | " + a1 + " | " + b1 + " | " + c1 + " |");
        System.out.println("---+---+---+---┤");
        System.out.println(" 2 | " + a2 + " | " + b2 + " | " + c2 + " |");
        System.out.println("---+---+---+---┤");
        System.out.println(" 3 | " + a3 + " | " + b3 + " | " + c3 + " |");
        System.out.println("---------------┘");

        System.out.println("Bitte gib deinen weiteren Spielzug ein (Beispiel: A2)");
    }

    public void nextTurn() {
        String spielzug = nextTurnScanner.nextLine();

        //Der Vergleich ob das Feld leer ist und ob die Eingabe den Namen des Feldes gleicht
        if(spielzug.equals("a1") && a1.equals(" ") || spielzug.equals("A1") && a1.equals(" ")) {
            a1 = player;
            changePlayer();
            
        }

        if(spielzug.equals("a2") && a2.equals(" ") || spielzug.equals("A2") && a2.equals(" ")) {
            a2 = player;
            changePlayer();
            
        }

        if(spielzug.equals("a3") && a3.equals(" ") || spielzug.equals("A3") && a3.equals(" ")) {
            a3 = player;
            changePlayer();
            
        }

        if(spielzug.equals("b1") && b1.equals(" ") || spielzug.equals("B1") && b1.equals(" ")) {
            b1 = player;
            changePlayer();
            
        }

        if(spielzug.equals("b2") && b2.equals(" ") || spielzug.equals("B2") && b2.equals(" ")) {
            b2 = player;
            changePlayer();
            
        }

        if(spielzug.equals("b3") && b3.equals(" ") || spielzug.equals("B3") && b3.equals(" ")) {
            b3 = player;
            changePlayer();
            
        }

        if(spielzug.equals("c1") && c1.equals(" ") || spielzug.equals("C1") && c1.equals(" ")) {
            c1 = player;
            changePlayer();
            
        }

        if(spielzug.equals("c2") && c2.equals(" ") || spielzug.equals("C2") && c2.equals(" ")) {
            c2 = player;
            changePlayer();
            
        }

        if(spielzug.equals("c3") && c3.equals(" ") || spielzug.equals("C3") && c3.equals(" ")) {
            c3 = player;
            changePlayer();
            
        }
    }

    public void changePlayer() {

        //Abwechslung des Spielers, Anzeig links oben
        if(player.equals("x")){
            player = "o";
        }

        else if(player.equals("o")){
            player = "x";
        }
    }
}
