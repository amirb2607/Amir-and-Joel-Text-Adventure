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
     * Gets the player's GPA needed for college and other activities.
     *
     * @return the player's HighSchoolGPA
     */
    public double getHighSchoolGPA();
    
    /**
     * Gets the player's tiredness so they can paricipate in activities.
     *
     * @return the player's tiredness.
     */
    public int getTiredness();
    
    /**
     * Gets the player's money as an overall score system.
     *
     * @return the player's money.
     */
    public int getMoney();
}