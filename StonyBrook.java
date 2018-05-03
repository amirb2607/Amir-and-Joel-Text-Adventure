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
      typingEffect("*It's your first day at SUNY Stony Brook*", 50);
      typingEffect("*Some random nerd walks up to you and introduces himself!*", 50);
      print("'Uh, h... he... hey, I'm To... Toby' -Toby", 50);
      print("*How are you going to respond?*", 50);
      hiOrLmao();
      print.effect("dawdaw", 50);
      return "adwda";
    }
    
    public void print(String a, int time) throws InterruptedException{
      for(int i = 0; i < a.length(); i++){
        System.out.print(a.charAt(i));
        Thread.sleep(time);
        if(i == a.length() -1){
         System.out.println("");
        }
      }
    }
    
    public void hiOrLmao() throws InterruptedException{
      print("[Hi] or [Lmao]", 50);
      Scanner sc = new Scanner(System.in);
      String userinput = sc.next();
      userinput = userinput.toUpperCase();
      if(userinput.equals("HI")){
        print("Hi, I'm" + " Player " + "what's your name?", 50);
        print("'I already told you stupid, my name is Toby' -Toby", 50);
        print("Jesus christ, you are so mean!", 50);
        print("'I... I.... I'mmm sorry" + " Player!' -Toby", 50);
        print("'What class do you have right now?' -Toby", 50);
        print("*What are you going to do?*", 50);
        //print.effect("[Lie] or [Truth]")
        Scanner a = new Scanner(System.in);
        String userrinput = a.next();
        userrinput = userrinput.toUpperCase();
        if(userrinput.equals("LIE")){
          print.effect("Oh I have some liberal art's class right now!", 50);
          print.effect("'Alright, well I have Computer Science right now. cya!'", 50);
        }
      }
      else if(userinput.equals("LMAO")){
        print("Lmao? Do I know you?", 50);
        print("'N... n... no, bu..t you cou...ld get to kn... kno... know me!' -Toby", 50);
        print("Well , I'm " + "Player. " + "What's your name?" , 50);
      }
      else{
        print("*Respond properly, please*", 50);
        hiOrLmao();
      }
    }
    
    public void typingEffect(String a, int t) throws InterruptedException{
      for(int i = 0; i < a.length(); i++){
        System.out.print(a.charAt(i));
        Thread.sleep(t);
        if(i == a.length() -1){
         System.out.println("");
        }
      }
    } 
}