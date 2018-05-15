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
    @Override
     public String enter(Player p) throws InterruptedException{
      print.reg("*Now entering Starbucks!*", 1000);
      p.changeHour(1);
      p.changeTiredness(1);
      Thread.sleep(1000);
      regOrNew();
      return "AXSE";
    }

    @Override
    public String getName()
    {
       return "Starbucks";
    }
    
    public void regOrNew() throws InterruptedException{
      print.effect("Do you want to get the regular or try something new?  [Reg] or [New]", 40);
      Scanner sc = new Scanner(System.in);
      String userinput = sc.next();
      userinput = userinput.toUpperCase();
      if(userinput.equals("REG")){
        print.effect("*You walk up to Ashley and tell her your order*", 40);
        print.effect(".", 40);
        print.effect(".", 40);
        print.effect(".", 40);
        print.effect("Is that all? -Ashley asks", 40);
        int temp = 0;
        while(temp == 0){
          print.reg("[Yes] or [No]?", 1000);
          Scanner scc = new Scanner(System.in);
          String input = scc.next();
          input = input.toUpperCase();
           if(input.equals("YES")){
            print.effect("'Of course, you always get the same thing every day.' - Ashley responds", 40);
            Thread.sleep(1000);
            temp++;
          }
           else if(input.equals("NO")){
              print.effect("'What else would you like?' -Ashley asks", 40);
              Thread.sleep(1000);
              Scanner sccc = new Scanner(System.in);
              String rawr = sccc.nextLine();
              print.effect(".", 30);
              print.effect(".", 30);
              print.effect(".", 30);
              print.effect("Ok, here's your " + rawr + "! -Ashley hand you your " + rawr, 40);
              temp++;
            }
            else{
              print.effect("'Excuse me?' -Ashley asks", 40);
          }
        }
      }
      else if(userinput.equals("NEW")){
         print.effect("'Really?' -Ashley asks suprised", 40);
         print.effect("What do you want to try out today? -Ashley asks!", 40);
         Scanner scan = new Scanner(System.in);
         String inputt = scan.nextLine();
         inputt = inputt.toLowerCase();
         print.effect("Alright, one " + inputt + " coming right up! -Ashley asks!", 40);
         print.effect(".", 30);
         print.effect(".", 30);
         print.effect(".", 30);
         print.effect("Alright here you go! -Ashley hand you your " + inputt, 40);
      }
      else{
         print.effect("'Excuse me?' -Ashley asks", 40);
         regOrNew();
      }
    }
  }
   