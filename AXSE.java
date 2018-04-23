import java.util.Scanner;
/**
 * Write a description of class WalkToAFSE here.
 *
 * @author (JoeL Matlala)
 * @version (0.1)
 */
public class AXSE implements Location
{
    private String college;
    @Override
    public String getName(){
        // Location name will match class name for convenience
        return "AXSE";
<<<<<<< HEAD
    }
    
    @Override
    public String enter(Player p) throws InterruptedException{
        String nextLocationName;
        System.out.println("Finally here in AXSE *Sigh");
        Thread.sleep(1000);
        System.out.println("The time is : " + p.getHour());
        Thread.sleep(1000);
        System.out.println("Hey Player are you going to class?");
        Thread.sleep(1000);
        System.out.println("Do you want to go to class? [Yes] or [No]");
        Thread.sleep(1000);
        skipClass(p);
        return "HouseWakeUp";
    }
    
    public void skipClass(Player p) throws InterruptedException {
        Scanner scc = new Scanner(System.in);
        String input = scc.next();
        input = input.toUpperCase();
        System.out.println("The time is : " + p.getHour());
        Thread.sleep(1000);
        System.out.println("Hey Player are you going to class?");
        Thread.sleep(1000);
        System.out.println("Do you want to go to class? [Yes] or [No]");
        Thread.sleep(1000);
        if(input.equals("NO")){
            System.out.println("Um no. Lets hang out a bit.");
            Thread.sleep(1000);
            p.changeHour(1);
            System.out.println("John: Uhhh. I have to go now. See you around.");
        } else if (input.equals("YES")) {
            
        } else {
            skipClass(p);
        }
    }
    
    public void Stony(Player p) throws InterruptedException {
        System.out.println("Mr. Stony: Hello class! Today we are doing some identification of errors and how to fix them..");
    }
    
    public void Village(Player p) throws InterruptedException {
        
    }
    
    public void Bush(Player p) throws InterruptedException {
        
    }
    
    public void Rossman(Player p) throws InterruptedException {
        
    }
    
    public void Kodak(Player p) throws InterruptedException {
        
    }
    
    public void Manson(Player p) throws InterruptedException {
        
=======
>>>>>>> 7f13ce228da2069ef835cc127b45aabaebdf2ddd
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