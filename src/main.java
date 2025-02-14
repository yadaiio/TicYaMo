public class main {
    public static void main(String[] args){

        TicYaMo spiel = new TicYaMo();
        Player player1 = new Player("x");
        Player player2 = new Player("o");

        spiel.zeichneSpiel();
        spiel.nextTurn();
        
        spiel.zeichneSpiel();
        spiel.nextTurn();
        
        spiel.zeichneSpiel();
        spiel.nextTurn();
        
        spiel.zeichneSpiel();
        spiel.nextTurn();
        
        spiel.zeichneSpiel();
        spiel.nextTurn();
        
    }
}
