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
      regOrNew();
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
    
    public void regOrNew() throws InterruptedException{
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
        int temp = 0;
        while(temp == 0){
          System.out.println("[Yes] or [No]?");
          Thread.sleep(1000);
          Scanner scc = new Scanner(System.in);
          String input = scc.next();
          input = input.toUpperCase();
           if(input.equals("YES")){
            System.out.println("Of course, you always get the same thing every day.");
            Thread.sleep(1000);
            temp++;
          }
           else if(input.equals("NO")){
              System.out.println("What else would you like?");
              Thread.sleep(1000);
              Scanner sccc = new Scanner(System.in);
              String rawr = sccc.nextLine();
              System.out.println(".");
              Thread.sleep(100);
              System.out.println(".");
              Thread.sleep(100);
              System.out.println(".");
              Thread.sleep(1000);
              System.out.println("Ok, here's your " + rawr + "! -Ashley hand you your " + rawr);
              temp++;
            }
            else{
              System.out.println("Excuse me?");
              Thread.sleep(1000);
          }
        }
      }
      else if(userinput.equals("NEW")){
         System.out.println("Really?");
         Thread.sleep(1000);
         System.out.println("What do you want to try out today? -Ashley asks!");
         Thread.sleep(1000);
         Scanner scan = new Scanner(System.in);
         String inputt = scan.nextLine();
         inputt = inputt.toLowerCase();
         Thread.sleep(1000);
         System.out.println("Alright, one " + inputt + " coming right up! -Ashley asks!");
         System.out.println(".");
         Thread.sleep(100);
         System.out.println(".");
         Thread.sleep(100);
         System.out.println(".");
         Thread.sleep(1000);
         System.out.println("Alright here you go! -Ashley hand you your " + inputt);
      }
      else{
         System.out.println("Excuse me?");
         Thread.sleep(1000);
         regOrNew();
      }
    }
  }
   

