
package mancala;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Slot {
    private List <Stone> stones;
    
    public Slot(){
        stones = new ArrayList();
        for (int i = 0; i < 4; i++){
            Stone stone = new Stone();
            this.stones.add(stone);
        }
        
    }
    
    public List<Stone> getStoneArrayList(){
        return stones;
    }
    
    public Stone getStoneByIndex(int i){
        return stones.get(i);
    }
    
    public void addStone(Stone stone){
        stones.add(stone);
    }
    
    public int countStones(){
        if(this.stones.isEmpty()){
            return 0;
        } else {
        return this.stones.size();
        }
    }
    
    public void cleanStones(){
        this.stones.clear();
    }
    
}


































































































































































































































































































