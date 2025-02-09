public class tools {
    public void clear(){
        try{ //Man ruft den ProcessBuilder auf um den command "cls" aufzurufen
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
        }catch(Exception error){
            System.out.println(error);
            return;
        }
    }
}
