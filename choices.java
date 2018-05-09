import java.util.Scanner;
/**
 * Write a description of class choices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class choices
{
    // instance variables - replace the example below with your own
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
        choices.userInput(a,b, othera, otherb);
        return 0;
      }
    }
}
