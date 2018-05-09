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
         Thread.sleep(500);
         System.out.println("");
        }
      }
    }
    
    public static void reg(String a, int time) throws InterruptedException{
      System.out.println(a);
      Thread.sleep(time);
    }
}
