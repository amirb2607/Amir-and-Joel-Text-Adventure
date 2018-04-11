/**
 * Sample player for school based text adventure game.
 * @author Sean Stern
 * @version 1.0
 */
public class HighSchoolStudent implements Player{
    
    private int tiredness = 5;
    private Inventory i = null;
    
    @Override
    public Inventory getInventory(){
        return null; 
    }
    
    @Override
    public int getTiredness(){
        return tiredness; 
    }
    
    @Override
    public void changeTiredness(int change){
        tiredness += change;
    }
    
    @Override
    public void setInventory(Inventory iv){
        i = iv;
    }
}