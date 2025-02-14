import java.util.Scanner;
//Ansammlung von den Funktionen, die TicYAMo generell können sollte.
public class TicYaMo {

    //String für das Feld, Schachbrett, regulär leer
    private String a1 = " ";
    private String a2 = " ";
    private String a3 = " "; 
    private String b1 = " "; 
    private String b2 = " "; 
    private String b3 = " "; 
    private String c1 = " "; 
    private String c2 = " "; 
    private String c3 = " ";

    //Der eigentliche Spieler
    private String player = "x";

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
        if(spielzug.toLowerCase().equals("a1") && a1.equals(" ")) {
            a1 = player;
            
        }

        if(spielzug.toLowerCase().equals("a2") && a2.equals(" ")) {
            a2 = player;
            
        }

        if(spielzug.toLowerCase().equals("a3") && a3.equals(" ")) {
            a3 = player;
            
        }

        if(spielzug.toLowerCase().equals("b1") && b1.equals(" ")) {
            b1 = player;
            
        }

        if(spielzug.toLowerCase().equals("b2") && b2.equals(" ")) {
            b2 = player;
            
        }

        if(spielzug.toLowerCase().equals("b3") && b3.equals(" ")) {
            b3 = player;
            
        }

        if(spielzug.toLowerCase().equals("c1") && c1.equals(" ")) {
            c1 = player;
            
        }

        if(spielzug.toLowerCase().equals("c2") && c2.equals(" ")) {
            c2 = player;
            
        }

        if(spielzug.toLowerCase().equals("c3") && c3.equals(" ")) {
            c3 = player;
            
        }
        changePlayer();
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
