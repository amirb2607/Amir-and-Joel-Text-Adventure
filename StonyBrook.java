import java.util.Scanner;
/**
 * Write a description of class StonyBrook here.
 *
 * @author (Amir Badrudeen)
 * @version (v0.1)
 */
public class StonyBrook implements Location
{
    @Override
    public String getName()
    {
      return "StonyBrook";
    }
    
    @Override
    public String enter(Player p) throws InterruptedException{
      print("*It's your first day at SUNY Stony Brook*", 1000);
      print("*Some random nerd walks up to you and introduces himself!*", 1500);
      print("'Uh, h... he... hey, I'm To... Toby' -Toby", 1500);
      print("*How are you going to respond?*", 1000);
      hiOrLmao();
      print.text("dawdaw", 1000);
      return "adwda";
    }
    
    public void print(String a, int time) throws InterruptedException{
     System.out.println(a);
     Thread.sleep(time);
    }
    
    public void hiOrLmao() throws InterruptedException{
      print("[Hi] or [Lmao]", 500);
      Scanner sc = new Scanner(System.in);
      String userinput = sc.next();
      userinput = userinput.toUpperCase();
      if(userinput.equals("HI")){
        print("Hi, I'm" + " Player " + "what's your name?", 1300);
        print("'I already told you stupid, my name is Toby' -Toby", 1200);
        print("Jesus christ, you are so mean!", 1100);
        print("'I... I.... I'mmm sorry" + " Player!' -Toby", 1000);
        print("'What class do you have right now?' -Toby", 1200);
      }
      else if(userinput.equals("LMAO")){
        print("Lmao? Do I know you?", 1000);
        print("'N... n... no, bu..t you cou...ld get to kn... kno... know me!' -Toby", 2000);
        print("Well , I'm " + "Player. " + "What's your name?" , 1200);
      }
      else{
        print("*Respond properly, please*", 1300);
        hiOrLmao();
      }
    }
}
