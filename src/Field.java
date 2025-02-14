public class Field {
    private Player occuPlayer;

    Field() {
        this.occuPlayer = null;
    }

    public void setPlayer(Player player) {
        if (occuPlayer == null) {
            occuPlayer = player;
        }
    }

    public boolean checkOccupied() {
        if(occuPlayer == null) {
            return true;
        } else {
            return false;
        }
    }
}
