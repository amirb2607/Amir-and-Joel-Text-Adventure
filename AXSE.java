
/**
 * Write a description of class WalkToAFSE here.
 *
 * @author (Amir Badrudeen)
 * @version (0.1)
 */
public class AXSE implements Location
{
    private int timeHr = 4;
    private String month = "March";
    private int day = 8;

    @Override
    public String getName(){
        // Location name will match class name for convenience
        return "WalkToAXSE";
    }

    @Override
    public String enter(Player p)
    {
        // put your code here
        return "l";
    }
}
