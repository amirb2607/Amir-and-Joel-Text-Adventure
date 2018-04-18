
/**
 * Write a description of class Harvard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Harvard implements Location{
    @Override
    public String getName() {
        // Location name will match class name for convenience
        return "AXSE";
    }

    @Override
    public String enter(Player p)
    {
        // put your code here
        System.out.println("*Now entering AXSE!*");
        System.out.println("The time is " + p.getHour());
        return "l";
    }
}
