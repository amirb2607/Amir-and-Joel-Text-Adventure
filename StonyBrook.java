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
      typingEffect("*It's your first day at SUNY Stony Brook*", 40);
      typingEffect("*Some random nerd walks up to you and introduces himself!*", 40);
      print("'Uh, h... he... hey, I'm To... Toby' -Toby", 40);
      print("*How are you going to respond?*", 40);
      hiOrLmao();
      print.effect("Let's go!", 40);
      return "StonyBrookFight";
    }
    
    public void print(String a, int time) throws InterruptedException{
      for(int i = 0; i < a.length(); i++){
        System.out.print(a.charAt(i));
        Thread.sleep(time);
        if(i == a.length() -1){
         Thread.sleep(500);
         System.out.println("");
        }
      }
    }
    
    public void hiOrLmao() throws InterruptedException{
      print("[Hi] or [Lmao]", 40);
      Scanner sc = new Scanner(System.in);
      String userinput = sc.next();
      userinput = userinput.toUpperCase();
      if(userinput.equals("HI")){
        print("Hi, I'm" + " Player " + "what's your name?", 40);
        print("'I already told you stupid, my name is Toby' -Toby", 40);
        print("Jesus christ, you are so mean!", 40);
        print("'I... I.... I'mmm sorry" + " Player!' -Toby", 40);
        print("'What class do you have right now?' -Toby", 40);
        print("*What are you going to do?*", 40);
        lieOrTruth();
      }
      else if(userinput.equals("LMAO")){
        print("Lmao? Do I know you?", 40);
        print("'N... n... no, bu..t you cou...ld get to kn... kno... know me!' -Toby", 40);
        print("Well , I'm " + "Player. " + "What's your name?" , 40);
        print("'I already told you stupid, my name is Toby' -Toby", 40);
        print("Jesus christ, you are so mean!", 40);
        print("'I... I.... I'mmm sorry" + " Player!' -Toby", 40);
        print("'What class do you have right now?' -Toby", 40);
        print("*What are you going to do?*", 40);
        lieOrTruth();
      }
      else{
        print("*Respond properly, please*", 40);
        hiOrLmao();
      }
    }
    
    public void lieOrTruth() throws InterruptedException{
      print.reg("[Lie] or [Truth]", 1000);
      Scanner a = new Scanner(System.in);
      String userrinput = a.next();
      userrinput = userrinput.toUpperCase();
      if(userrinput.equals("LIE")){
        print.effect("Oh I have some liberal art's class right now!", 40);
        print.effect("'Alright, well I have Computer Science right now. cya!'", 40);
        print.effect("Wa... waa.. wait up!", 40);
        print.effect("I have a Computer Science class as well!", 40);
        print.effect("'Wh.. wh.. why did you li... li.... lie to me?' -Toby", 40);
        print.effect("I thought you were weird, I'm sorry!", 40);
        print.effect("'It's ok, I for... forgive you, but let's get to class alright?!' -Toby", 40);
      }
      else if(userrinput.equals("TRUTH")){
       print.effect("Oh I have Computer Science right now, what about you?", 40);
       print.effect("'Really, me too!' -Toby", 40);
       print.effect("That's crazy", 40);
      }
      else{
        lieOrTruth();
      }
    }
    
    public void typingEffect(String a, int t) throws InterruptedException{
      for(int i = 0; i < a.length(); i++){
        System.out.print(a.charAt(i));
        Thread.sleep(t);
        if(i == a.length() -1){
         Thread.sleep(500);
         System.out.println("");
        }
      }
    } 
}