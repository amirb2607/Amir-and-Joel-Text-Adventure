import java.util.Scanner;
/**
 * Write a description of class WalkToAFSE here.
 *
 * @author (JoeL Matlala)
 * @version (0.1)
 */
public class AXSE implements Location
{
    private int date ;
    private int gpa = 76;
    @Override
    public String getName(){
        // Location name will match class name for convenience
        return "AXSE";
    }
    
    @Override
    public String enter(Player p)  throws InterruptedException{
       
         String nextLocationName; 
         System.out.println("Finally here in AXSE *Sigh");
         Thread.sleep(1000);
         System.out.println("what time is it? " + p.getHour());
         Thread.sleep(1000);
         System.out.println("Hey Player are you going to class?");
         Thread.sleep(1000);
         System.out.println("Do you want to go to class? [Yes] or [No]");
         Thread.sleep(1000);
         Scanner scc = new Scanner(System.in);
         String input = scc.next();
         input = input.toUpperCase();
         if(input.equals("NO")){
          System.out.println("Um no I'm gonna leave right now.");
          Thread.sleep(1000);
          p.changeHour(p.getHour() - 1);
         }
         return "HouseWakeUp";
    }  
}