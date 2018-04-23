
/**
 * Write a description of class Stony_Brook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StonyBrook implements Location
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public String getName()
    {
        return "StonyBrook";
    }
    
    @Override
    public String enter(Player p) throws InterruptedException{
      print("It's your first day at SUNY Stony Brook", 1000);
      print("dhaouwdhawuhd", 100);
      return "adwda";
    }
    
    public void print(String a, int time) throws InterruptedException{
     System.out.println(a);
     Thread.sleep(time);
    }
}
