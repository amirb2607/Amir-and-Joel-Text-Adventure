
/**
 * Write a description of class WalkToAFSE here.
<<<<<<< HEAD
 *
 * @author (Amir Badrudeen)
 * @version (0.1)
 */
public class AXXE implements Location
{
    private int timeHr = 4;
    private String month = "March";
    private int day = 8;

    @Override
    public String getName(){
        // Location name will match class name for convenience
        return "AXXE";
    }

    @Override
    public String enter(Player p)
    {
        // put your code here
        System.out.println("*Stony first!");
        return "l";
    }
}
