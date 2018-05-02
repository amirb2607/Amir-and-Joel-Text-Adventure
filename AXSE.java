import java.util.Scanner;
/**
 * Write a description of class WalkToAFSE here.
 *
 * @author (JoeL Matlala)
 * @version (0.1)
 */
public class AXSE implements Location{
    
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
        skipClass(p);
        return college;
    }
    
    public void skipClass(Player p) throws InterruptedException {
        System.out.println("The time is : " + p.getHour());
        Thread.sleep(1000);
        System.out.println("Brandon: Hey Player are you going to class?");
        Thread.sleep(1000);
        System.out.println("Do you want to go to class? [Yes] or [No]");
        Thread.sleep(1000);
        Scanner scc = new Scanner(System.in);
        String input = scc.next();
        input = input.toUpperCase();
        if(input.equals("NO")){
            System.out.println("Um no. Lets hang out a bit.");
            Thread.sleep(1000);
            p.changeHour(1);
            System.out.println("Brandon: Uhhh. I have to go now. See you around.");
            nextClass(p);
        } else if (input.equals("YES")) {
            nextClass(p);
        } else {
            skipClass(p);
        }
    }
    
    public void Stony(Player p) throws InterruptedException {
        System.out.println("Mr. Stony: Hello class! Today we are doing some identification of errors and how to fix them..");
    }
    
    public void Village(Player p) throws InterruptedException {
 
        {
              System.out.println("*Now entering Rossman class*");
              Thread.sleep(3000);
              print.text ("Hey player", 1000);
        }
    }
    
    public void Bush(Player p) throws InterruptedException {
      System.out.println("*Now entering Joe Bushes class*");
      Thread.sleep(1000);
      System.out.println("Damn it’s Joe bushes class this guy is kind of a hardass.");
      Thread.sleep(1000);
      System.out.println("Bush: Hey Player! Why did you take so long?");
      Thread.sleep(1000);
      System.out.println("Sorry sir I’m getting right to it");
      Thread.sleep(1000);
      System.out.println("What are we doing in class today?");
      Thread.sleep(1000);
      System.out.println("Bush: Read the board Player Instructions are written down there if you actually came you would know this. ");
      Thread.sleep(1000);
      System.out.println("*Player starts to run and is eventually let out of class. *");
      Thread.sleep(1000);
        //Player.Gpa= p.Gpa() +1;
  
    }
    
    public void Rossman(Player p) throws InterruptedException
    {
     
       {
          System.out.println("*Now entering Rossman class*");
          Thread.sleep(3000);
          print.text ("Rossman: Hey player", 2000);
          print.text ("Hey Rossman!", 2000);
          print.text ("*Brandon waves at you*", 2000);
          print.text ("Hey brandon good to see you.", 2000);
          print.text ("Brandon: This class is pretty boring the teacher has a very monotone voice.", 2000);
          print.text ("AHAHA that's so true AHAHAHA", 2000);
          System.out.println("*Rossmans class starts*");
          print.text ("a conic section or simply conic is a curve obtained as the intersection of the surface of a cone with a plane. The three types of conic section are the hyperbola, the parabola, and the ellipse.", 2000);
        }  
    }
    
    public void Kodak(Player p) throws InterruptedException {
       System.out.println("*Now entering Bleasene Kodaks class*");
       System.out.println("It’s Kodak's room. She's a chill teacher.");
       Thread.sleep(1000);
       System.out.println("Brandon: Hey sit here Player it’s Brandon!!");
       Thread.sleep(1000);
       System.out.println("Brandon: Hey Player this class isn't at all difficult.");
       Thread.sleep(1000);
       System.out.println("Brandon: We just have to hand in some worksheets and she gives us a good grade.");
       System.out.println("Yes finally a easy class for today.");
       Thread.sleep(1000);
       System.out.println("Kodak: Hey You Two Stop Talking Back There");
       Thread.sleep(1000);
       System.out.println("Oh damn");
       Thread.sleep(1000);
       System.out.println("Kodak: Let’s see Player what is the word you in spanish?[TU] or [YO]");
       Thread.sleep(1000);
       Scanner sc = new Scanner(System.in);
       String userinput = sc.next();
       userinput = userinput.toUpperCase();
       Thread.sleep(1000);
       if(userinput.equals("TU")){
           System.out.println("Kodak: Good I guess you guys were listening");
           Thread.sleep(1000);
           System.out.println("Brandon: Nice Save!");
           Thread.sleep(1000);
           //Player.Gpa= p.Gpa() +1;
        } else {
            System.out.println("Wrong! Shut up and pay attention.");
            Thread.sleep(1000);
            System.out.println("Brandon:Damn we blew it she’s definitely going to keep an eye on us.");
            Thread.sleep(1000);
        }
        //Time+1hour
       Bush(p);
    }
    
    public void Manson(Player p) throws InterruptedException {
        

    }
    
    public void chooseCollege(Player p) throws InterruptedException {
        
    }
    
    public void nextClass(Player p) throws InterruptedException {
        if(p.getHour() == 9){
            Stony(p);
        } else if(p.getHour() == 10){
            Village(p);
        } else if(p.getHour() == 11){
            Bush(p);
        } else if(p.getHour() == 12){
            Rossman(p);
        } else if(p.getHour() == 13){
            Manson(p);
        } else if(p.getHour() == 14){
            Kodak(p);
        } else {
            chooseCollege(p);
        }
    }

}