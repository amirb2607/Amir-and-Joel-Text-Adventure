import java.util.Scanner;
/**
 * Write a description of class print here.
 *
 * @author (Amir Badrudeen)
 * @version (a version number or a date)
 */
public class print
{
    //This causes typing effect to occur
    /**
     * Typing effect boi
     */
    public static void effect(String a, int time) throws InterruptedException
    {
      for(int i = 0; i < a.length(); i++){
        System.out.print(a.charAt(i));
        Thread.sleep(time);
        if(i == a.length() -1){
         System.out.println("");
        }
      }
    }
    
    public static void reg(String a, int time) throws InterruptedException{
      System.out.println(a);
      Thread.sleep(time);
    }
    
    public static int userInput(String a, String b, String othera, String otherb) throws InterruptedException{
      print.reg("[" + a + "] or [" + b + "]", 1000); 
      Scanner aa = new Scanner(System.in);
      String userrinput = aa.next();
      userrinput = userrinput.toUpperCase();
      String aaa = a.toUpperCase();
      String bbb = b.toUpperCase();
      if(userrinput.equals(aaa)){
        print.effect(othera, 50);
        return 1;
      } 
      else if(userrinput.equals(bbb)){
        print.effect(otherb, 50);
        return 2;
      }
      else{
        print.effect("That is not a choice!", 50);
        print.userInput(a,b, othera, otherb);
        return 0;
      }
    }
}
