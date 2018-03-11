import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class AFSEBackpack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AFSEBackpack implements Inventory
{
    private List<Item> pockets;
    
    public AFSEBackpack()
    {
      pockets = new ArrayList<Item>();
    }
    
    /**
     * Adds an {@link Item} to the inventory
     *
     * @param i the {@link Item} to be added to the inventory
     */
    public void addItem(Item i)
    {
      pockets.add(i);
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
      for(int i = 0; i < pockets.size(); i++){
        if((itemName).equals(pockets.get(i).getName())){
          return pockets.get(i);
        }
      }
      throw new IllegalArgumentException("This item is not in the inventory!");
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
       for(int i = 0; i < pockets.size(); i++){
         if((itemName).equals(pockets.get(i).getName())){
           return true;
         }
       }
       return false;
    }
}