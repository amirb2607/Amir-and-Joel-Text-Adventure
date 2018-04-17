
/**
 * Write a description of class WalkToAFSE here.
 *
 * @author (JoeL Matlala)
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
            String nextLocationName;
                if(timeHr >= 9){
                System.out.println("Finally here in AXSE *Sigh");
                
            
            
           }
           return "HouseWakeUp";
    }
}

