
/**
 * Write a description of class WalkToAFSE here.
<<<<<<< HEAD
 *
 * @author (Amir Badrudeen)
 * @version (0.1)
 */
public class WalkToAFSE implements Location
{
    private int timeHr = 4;
    private String month = "September";
    private int day = 8;

    @Override
    public String getName(){
        // Location name will match class name for convenience
        return "WalkToAFSE";
    }

    @Override
    public String enter(Player p)
    {
        // put your code here
        return "l";
    }
}
