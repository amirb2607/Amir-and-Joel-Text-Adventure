
/**
 * Write a description of class WalkToAFSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WalkToAFSE implements Location
{
    // instance variables - replace the example below with your own
   
    public String getName(){
     return "WalkToAFSE";  
    }

    /**
     * Causes the {@link Player} to enter the location and returns
     * the name of the next game location.
     *
     * @param p the {@link Player} entering the location
     * @return the name of the next location
     * @throws InterruptedException if the game is paused and gets interrupted
     */
    public String enter(Player p) throws InterruptedException{
      return "AFSE";   
    }
}
