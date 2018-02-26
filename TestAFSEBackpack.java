

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestBackpack.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestAFSEBackpack
{
    @Test
    public void testConstructor()
    {
        Inventory inv = new AFSEBackpack();
    }
    
    @Test
    public void testAddItem()
    {
        Inventory inv = new AFSEBackpack();
        Item apple = new FiniteItem("Apple", "Red-Delicious", 1);
        inv.addItem(apple);
        assertEquals(true, inv.hasItem("Apple"));
    }
    
    public void testGetItem()
    {
        Inventory inv = new AFSEBackpack();
        Item apple = new FiniteItem("Apple", "Red-Delicious", 1);
        inv.addItem(apple);
        Item retrApple = inv.getItem("Apple");
        assertEquals("Apple", retrApple.getName());
        assertEquals("Red-Delicious", retrApple.getDescription()); 
        assertEquals(1, retrApple.getCount());
    }
    
    // 1 Add two DIFFERENT items, verify that both
    // are in the backpack (i.e. we didn't lose one)
    
    // 2 Add two of the SAME type of item, verify
    // that they automatically were combined into
    // one item with SUM of counts
    
    // 3 Try to get an item we never added, should crash
    
    // 4 Ask if we have an item that was never added,
    // should return false
    
    // 5 Add an item, use it until the count is 0,
    // have item should return false
    
    
}















