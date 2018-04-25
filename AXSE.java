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
            Kodak(p);
            
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
      System.out.println(" Damn it’s Joe bushes class this guy is kind of a hardass.");
      Thread.sleep(1000);
      System.out.println("Hey Player! Why did you take so long?");
      Thread.sleep(1000);
      System.out.println(" Sorry sir I’m getting right to it");
      Thread.sleep(1000);
      System.out.println("What are we doing in class today?");
      Thread.sleep(1000);
      System.out.println("Read the board Player Instructions are written down there if you actually came you would know this. ");
      Thread.sleep(1000);
      System.out.println("now ");
      Thread.sleep(1000);
      System.out.println("*Player starts to run and is eventually let out of class. *");
      Thread.sleep(1000);
        //Player.Gpa= p.Gpa() +1;
  
    }
    
    public void Rossman(Player p) throws InterruptedException {
        
    }
    
    public void Kodak(Player p) throws InterruptedException {
       System.out.println("it’s kodaks room She's a chill teacher.");
       Thread.sleep(1000);
       System.out.println("Hey sit here Player it’s brandon!!");
       Thread.sleep(1000);
       System.out.println("Hey Player this class isn't at all difficult.");
       Thread.sleep(1000);
       System.out.println("We just have to hand in some worksheets and she gives us a good grade.");
       System.out.println("Yes finally a easy class for today.");
       Thread.sleep(1000);
       System.out.println("Hey You Two Stop Talking Back There");
       Thread.sleep(1000);
       System.out.println("Oh damn");
       Thread.sleep(1000);
       System.out.println("Let’s see Player what is the word you in spanish?[TU] or [YO]");
       Thread.sleep(1000);
       Scanner sc = new Scanner(System.in);
       String userinput = sc.next();
       userinput = userinput.toUpperCase();
       Thread.sleep(1000);
       if(userinput.equals("TU"))
                {
                  System.out.println("Good I guess you guys were listening");
                  Thread.sleep(1000);
                  System.out.println("Let’s see Player what is the word you in spanish?");
                  Thread.sleep(1000);
                  //Player.Gpa= p.Gpa() +1;

                }
                
        else {
                  System.out.println("Wrong! Shut up and pay attention.");
                  Thread.sleep(1000);
        	  System.out.println("Damn we blew it she’s definitely going to keep an eye on us.");
                  Thread.sleep(1000);

                }
        //Time+1hour

    }
    
    public void Manson(Player p) throws InterruptedException {
        

    }

}