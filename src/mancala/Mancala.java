
package mancala;


public class Mancala {
    
    private Player playerOne;
    private Player playerTwo;
    
    
//    public static void main(String[] args) {
//        Mancala mancala = new Mancala();
//        mancala.start();
//    }

    public void start() {
        
    }
    
    public Mancala(){
        playerOne = new Player();
        playerTwo = new Player();
        
        playerOne.setOpponent(playerTwo);
        playerTwo.setOpponent(playerOne);
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }
    
  
    
    

    
    
    
    
}
