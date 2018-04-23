/**
 * Player for text adventure game.
 * @author Sean Stern
 * @version 1.0
 */
public interface Player{

    /**
     * Gets the player's inventory
     *
     * @return the player's {@link Inventory}
     */
    public Inventory getInventory();
    
    /**
     * Gets the player's tiredness so they can paricipate in activities.
     *
     * @return the player's tiredness.
     */
    public int getTiredness();
    
    /**
     * Changes the player's tiredness so they can paricipate in activities.
     *
     * @changes the player's tiredness.
     */
    public void changeTiredness(int change);
    
    public void setInventory(Inventory iv);
    
    public int getHour();
    
    public void changeHour(int t);
    
    public double getMoney();
    
    public void changeMoney(double m);
}