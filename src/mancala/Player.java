
package mancala;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Player {
    public  List <Slot> slots;
    private Slot bank;
    private Player opponent;
    
    
    
    public Player(){
        slots = new ArrayList();
        for(int i = 0; i < 7; i++){
            Slot slot = new Slot();
            this.slots.add(slot);
        }
        this.slots.get(6).cleanStones();
    }
    
    public void addSlot(Slot slot){
        this.slots.add(slot);
    }
    
//    public List<Slot> getSlotsArrayList(){
//        return this.slots;
//    }
    
    public void setOpponent(Player opponent){
        this.opponent = opponent;
    }
    
    
    public void addStoneToSlot(int indexSlot, Stone stone){
        this.slots.get(indexSlot).addStone(stone);
    }
    
    public void moveStonesAround(int position, Slot slot){
//        int tempPosition = position;
//        this.slots.get(tempPosition).cleanStones();
        int opponentPosition = 0;
        for (int i = 0; i < slot.countStones(); i++){
            if(position < 6){
                position++;
                addStoneToSlot(position, slot.getStoneByIndex(i));
//                if(this.slots.get(position).countStones() == 1 && position != 6){
//                    
//                } 
            } else if(position >= 6) {
                if(opponentPosition < 6){
                    opponent.addStoneToSlot(opponentPosition, slot.getStoneByIndex(i));
                    opponentPosition++;
                } else if(opponentPosition == 5) {
                    position = 0;
                }    
            }
        }
        
        if (position != 6 && this.slots.get(position).countStones() == 1){
            addStoneToSlot(6, this.slots.get(position).getStoneByIndex(0));
            takingStonesFromOpponent(position);
            this.slots.get(position).cleanStones();
            this.opponent.slots.get(5-position).cleanStones();
        }
        slot.cleanStones();
        
    }
    
    public void takingStonesFromOpponent(int position){
        for(int j = 0; j < this.opponent.slots.get(5-position).countStones(); j++ ){
            addStoneToSlot(6, this.opponent.slots.get(5-position).getStoneByIndex(j));
        }
    }
    
    
    
}
