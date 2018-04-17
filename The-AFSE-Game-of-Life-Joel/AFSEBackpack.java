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
    public void addItem(Item item)
    {
      for(int i = 0; i < pockets.size(); i++){
        if(pockets.get(i).getName().equals(item.getName()) && pockets.get(i).getDescription().equals(item.getDescription())){
         pockets.get(i).combine(item);
        }
      }
      pockets.add(item);
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
          cleanUp();
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
       cleanUp();
       for(int i = 0; i < pockets.size(); i++){
         if((itemName).equals(pockets.get(i).getName()) && pockets.get(i).getCount() != 0){
           return true;
         }
       }
       return false;
    }
    
    public void cleanUp()
    {
      for(int w = 0; w < pockets.size(); w++){
         if(pockets.get(w).getCount() == 0){
         pockets.remove(w);
        }
      }
    }
}