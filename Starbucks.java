import java.util.Scanner;
/**
 * Write a description of class Starbucks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starbucks implements Location
{
    /* instance variables - replace the example below with your own
    */
     public String enter(Player p) throws InterruptedException{
      System.out.println("*Now entering Starbucks!*");
      p.changeHour(1);
      p.changeTiredness(1);
      Thread.sleep(1000);
      System.out.println("Do you want to get the regular or try something new?  [Reg] or [New]");
      Scanner sc = new Scanner(System.in);
      String userinput = sc.next();
      userinput = userinput.toUpperCase();
      Thread.sleep(1000);
      if(userinput.equals("REG")){
        System.out.println("*You walk up to Ashley and tell her your order*");
        Thread.sleep(100);
        System.out.println(".");
        Thread.sleep(100);
        System.out.println(".");
        Thread.sleep(100);
        System.out.println(".");
        Thread.sleep(1000);
        System.out.println("Is that all? -Ashley asks");
        Thread.sleep(1000);
        yesOrNo();
      }
      //else if()
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
        return "Starbucks";
    }
    
    public void yesOrNo(){
      System.out.println("[Yes] or [No]?");
      //Thread.sleep(1000);
      Scanner scc = new Scanner(System.in);
      String input = scc.next();
      input = input.toUpperCase();
       if(input.equals("YES")){
        System.out.println("Of course, you always get the same thing every day");
        //Thread.sleep(1000);         
      }
       else if(input.equals("NO")){
          System.out.println("What else would you like?");
          //Thread.sleep(1000);
          Scanner sccc = new Scanner(System.in);
          String rawr = sccc.nextLine();
          System.out.println(".");
          //Thread.sleep(100);
          System.out.println(".");
          //Thread.sleep(100);
          System.out.println(".");
          //Thread.sleep(1000);
          System.out.println("Ok, here's your " + rawr + "!");
        }
        else{
          System.out.println("Excuse me?");
          //Thread.sleep(1000);
      }
      }
    }
   

