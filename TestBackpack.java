

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
public class TestBackpack
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
}















