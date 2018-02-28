import java.util.List;
/**
 * Write a description of class AFSEBackpack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AFSEBackpack implements Inventory
{
    private List<Item> pockets;
    /**
     * Adds an {@link Item} to the inventory
     *
     * @param i the {@link Item} to be added to the inventory
     */
    public void addItem(Item i)
    {
    }

    /**
     * Determines whether or not an {@link Item} with the itemName is in the
     * inventory
     *
     * @param itemName the name of the item
     * @return true if an item with itemName is in the inventory, false
     *         otherwise
     */
    public boolean hasItem(String itemName)
    {
        return false;
    }

    /**
     * Gets an {@link Item} with itemName from the inventory, provided it
     * exists in the inventory.
     *
     * @param itemName the name of the item
     * @return an {@link Item} that has the corresponding itemNam
     * 
     * @throws IllegalArgumentException if no item that matches itemName
     */
    public Item getItem(String itemName) throws IllegalArgumentException
    {
        return null;
    }
}
