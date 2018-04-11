
/**
 * Write a description of class Starbucks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starbucks implements Location
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Starbucks
     */
    public Starbucks(){
       
    }
    
    public String enter(Player p) throws InterruptedException{
      System.out.println("*Now entering Starbucks!*");
      p.changeTime(1);
      p.changeTiredness(1);
      Thread.sleep(1000);
      return "AXSE";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getName()
    {
        // put your code here
        return "Starbucks";
    }
}
