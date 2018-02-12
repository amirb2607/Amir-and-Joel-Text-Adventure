

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestFiniteItem.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestFiniteItem
{
    @Test
    public void testFailingConstructor()
    {
        Item i = new FiniteItem("Money", "Cash money!", -1);
        //Should crash
    }
    
    @Test
    public void testGetCount()
    {
        Item i = new FiniteItem("Money", "Cash money!", 10);
        assertEquals(10, i.getCount());
    }
    
    @Test
    public void testUse()
    {
        Item i = new FiniteItem("Money", "Cash money", 10);
        i.use(8);
        assertEquals(2, i.getCount());
        i.use(2);
        assertEquals(0, i.getCount());
    }
    
    @Test
    public void testFailingOverUse()
    {
        Item i = new FiniteItem("Money", "Cash money", 10);
        i.use(8);
        assertEquals(2, i.getCount());
        i.use(2);
        assertEquals(0, i.getCount());
        i.use(1);
    }
    
    @Test
    public void testFailingNegativeUse()
    {
        Item i = new FiniteItem("Money", "Cash money", 10);
        i.use(8);
        assertEquals(2, i.getCount());
        i.use(-2);
    }
    
    @Test
    public void testFailingZeroUse()
    {
        Item i = new FiniteItem("Money", "Cash money", 10);
        i.use(8);
        assertEquals(2, i.getCount());
        i.use(0);
    }
}

