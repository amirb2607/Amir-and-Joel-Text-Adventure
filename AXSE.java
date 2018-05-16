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
        print.effect("Finally here in AXSE *Sigh",40);        
        skipClass(p);
        return college;
    }
    
    public void skipClass(Player p) throws InterruptedException {
        print.effect("The time is : " + p.getHour(),40);
        print.effect("Brandon: Hey Player are you going to class?",40);
        print.effect("Do you want to go to class? [Yes] or [No]",40);
        Scanner scc = new Scanner(System.in);
        String input = scc.next();
        input = input.toUpperCase();
        if(input.equals("NO")){
            print.effect("Um no. Lets hang out a bit.",40);
            p.changeHour(1);
            print.effect("Brandon: Uhhh. I have to go now. See you around.",40);
            nextClass(p);
        } else if (input.equals("YES")) {
            nextClass(p);
        } else {
            skipClass(p);
        }
    }
    
    public void Stony(Player p) throws InterruptedException {
        print.effect("Mr. Stony: Hello class! Today we are doing some identification of errors and how to fix them..",40);
        print.effect("Mr. Stony: Hey " + "player " + "what do you think the answer is to number 1", 40);
        print.effect("Mr. Stony: Which one of these answer choices will compile?!", 40);
        print.reg("**\n**[a] int x = a;\n**[B] int x = 1;\n"+
                 "**[c] int x = 1.2; ", 1000);
        Scanner sc = new Scanner(System.in);
        String userinput = sc.next();
        userinput = userinput.toUpperCase();
        if(userinput.equals("A")){
          print.effect("Mr. Stony: This won't compile because 'a' hasn't been initialized as yet", 40);
        }
        else if(userinput.equals("B")){
          print.effect("Mr. Stony: Correct!", 40);
          Item GPA = new FiniteItem("GPA", "grade", 2);
          p.getInventory().addItem(GPA);
          //System.out.println(p.getInventory().getItem("GPA").getCount());
        }
        else if(userinput.equals("C")){
          print.effect("Mr. Stony: This will not compile because 1.2 isn't a int", 40);
        }
        else{
          print.effect("That is not an answer choice, you fail!", 40);
        }
        print.effect("Mr. Stony: Alright now for question 2!", 40);
        print.effect("Mr. Stony: Which one of these answer choices will compile?!", 40);
        print.reg("**\n**[a] String A = whatamidoing;\n**[B] double B = 2;\n"+
                 "**[c] int x = 1.2; ", 1000);
        Scanner scc = new Scanner(System.in);
        String userinputt = scc.next();
        userinputt = userinputt.toUpperCase();
        if(userinputt.equals("A")){
          print.effect("Mr. Stony: This won't compile because whatamidoing is not a String", 40);
        }
        else if(userinputt.equals("B")){
          print.effect("Mr. Stony: Correct!", 40);
          Item GPA = new FiniteItem("GPA", "grade", 2);
          p.getInventory().addItem(GPA);
          System.out.println(p.getInventory().getItem("GPA").getCount());
        }
        else if(userinputt.equals("C")){
          print.effect("Mr. Stony: This will not compile because 1.2 isn't a int", 40);
        }
        else{
          print.effect("That is not an answer choice, you fail!", 40);
        }
        print.effect("Mr. Stony: Welp times up!", 40);
        print.effect("Mr. Stony: Get yo your next class!", 40);
        Village(p);
    }
    
    public void Village(Player p) throws InterruptedException {
        print.effect("Welcome to my class again kids!",40);
        print.effect("Hey player, which one of these is a rhetorical device!", 40);
        int x = choices.userInput("Alliteration", "Persuasive", "Correct", "Wrong");
        if(x == 1){
          Item GPA = new FiniteItem("GPA", "grade", 2);
          p.getInventory().addItem(GPA);
          System.out.println(p.getInventory().getItem("GPA").getCount());
        }
        print.effect("Hey player, which one of these words is an adverb", 40);
        int z = choices.userInput("Quickly", "Running", "Correct", "Wrong");
        if(z == 1){
          Item GPA = new FiniteItem("GPA", "grade", 2);
          p.getInventory().addItem(GPA);
          System.out.println(p.getInventory().getItem("GPA").getCount());
        }
        print.effect("Alright get of my room!", 40);
        Bush(p);
    }
    
    public void Bush(Player p) throws InterruptedException {
      print.effect("*Now entering Joe Bushes class*",40);
      print.effect("Damn it’s Joe bushes class this guy is kind of a hardass.",40);
      print.effect("Bush: Hey Player! Why did you take so long?",40);
      print.effect("Sorry sir I’m getting right to it",40);
      print.effect("What are we doing in class today?",40);
      print.effect("Bush: Read the board Player Instructions are written down there if you actually came you would know this. ",40);
      Scanner sc = new Scanner(System.in);
             String userinput = sc.next();
             userinput = userinput.toUpperCase();
             if(userinput.equals("JOGGING")){
                   print.effect(": Good I guess you were listening",40);
                  Item GPA = new FiniteItem("GPA", "grade", 2);
                  p.getInventory().addItem(GPA);
                  System.out.println(p.getInventory().getItem("GPA").getCount());
                } else {
                    print.effect("Manson:Wrong! Shut up and pay attention.",40);
                }
                print.effect("Bush: What is a muscular endurance exersise? [Pushups] or [Squatting]?",40);
             Scanner sc2 = new Scanner(System.in);
             String userinput2 = sc.next();
             userinput2 = userinput.toUpperCase();
             if(userinput.equals("PUSHUPS")){
                   print.effect("Bush: Good I guess you were listening",40);
                              Item GPA = new FiniteItem("GPA", "grade", 2);
                    p.getInventory().addItem(GPA);
                System.out.println(p.getInventory().getItem("GPA").getCount());
                 } else {
                    print.effect("Manson:Wrong! Shut up and pay attention.",40);
      
                }
      Rossman(p);
        //Player.Gpa= p.Gpa() +1;
    }
    
    public void Rossman(Player p) throws InterruptedException {
       print.effect("*Now entering Rossmans class*",40);
       print.effect("Rossman: How are you guys doing class is starting take your seats.",40);
       print.effect("Brandon:Hey Player damn we are in all the same classes. ",40);
       print.effect("HaHa yeah man crazy coincedence.",40);
       print.effect("Rossman: Add and subtract fractions with unlike denominators (including mixed numbers) by replacing given fractions with equivalent fractions in such a way as to produce an equivalent sum or difference of fractions with like denominators. For example, 2/3 + 5/4 = 8/12 + 15/12 = 23/12. (In general, a/b + c/d = (ad + bc)/bd.) ",40);
       print.effect("Alright Player what is 2-(1/2)",40);
       int question = choices.userInput("A dexter","3/2" ,"what is a a dexter?","Correct WOW you were paying attention.");
       if(question == 2){
                   Item GPA = new FiniteItem("GPA", "grade", 2);
          p.getInventory().addItem(GPA);
          System.out.println(p.getInventory().getItem("GPA").getCount()); 
       }
       print.effect("Alright Player what is 17*5",40);
       int question2 = choices.userInput("90","85" ,"A what?","Correct WOW you were paying attention.");
       if(question2 == 2){
                  Item GPA = new FiniteItem("GPA", "grade", 2);
          p.getInventory().addItem(GPA);
          System.out.println(p.getInventory().getItem("GPA").getCount()); 
        
       }
       Manson(p);
    }
    
     public void Kodak(Player p) throws InterruptedException {
       print.effect("*Now entering Bleasene Kodaks class*",40);
       print.effect("It’s Kodak's room. She's a chill teacher.",40); 
       print.effect("Brandon: Hey sit here Player it’s Brandon!!",40);
       print.effect("Brandon: Hey Player this class isn't at all difficult.",40);
       print.effect("Brandon: We just have to hand in some worksheets and she gives us a good grade.",40);
       print.effect("Yes finally a easy class for today.",40);
       print.effect("Kodak: Hey You Two Stop Talking Back There",40);
       print.effect("Oh damn",40);
       print.effect("Kodak: Let’s see Player what is the word you in spanish?[TU] or [YO]",40);
       Scanner sc = new Scanner(System.in);
       String userinput = sc.next();
       userinput = userinput.toUpperCase();
       if(userinput.equals("TU")){
           print.effect("Kodak: Good",40);
           print.effect("Brandon: Nice Save!",40);
           //Player.Gpa= p.Gpa() +1;0
        } else {
            print.effect("Wrong! Shut up and pay attention.",40);
            print.effect("Brandon:Damn we blew it she’s definitely going to keep an eye on us.",40);
        }
        print.effect("Kodak: what is car in spanish?[CARO] or [CARRO]",40);
       Scanner sc2 = new Scanner(System.in);
       String userinput2 = sc.next();
       userinput = userinput.toUpperCase();
       if(userinput.equals("CARRO")){
           print.effect("Kodak: Good I guess you guys were listening",40);
           print.effect("Brandon: Nice Save!",40);
           //Player.Gpa= p.Gpa() +1;0
        } else {
            print.effect("Wrong! Shut up and pay attention.",40);
            print.effect("Brandon:Damn we blew it she’s definitely going to keep an eye on us.",40);
        }
       chooseCollege(p);
    }
    
    public void Manson(Player p) throws InterruptedException {
        print.effect("*Now entering Mansons class*",40);
             print.effect("It’s Mansons's room. he's a chill teacher.",40); 
             print.effect("William: Hey Player it’s William!!",40);
             print.effect("William: Hey Player this class isn't at all difficult.",40);
             print.effect("William: We just have to pay attention and he gives us a good grade.",40);
             print.effect("Yes finally a easy class for today.",40);
             print.effect("Manson: Hey You Two be quiet kets make sure you were paying attention.",40);
             print.effect("Oh damn",40);
             print.effect("Manson: Let’s see Player what system is  the heart part of?[Cardiovascular] or [circulatory]",40);
             Scanner sc = new Scanner(System.in);
             String userinput = sc.next();
             userinput = userinput.toUpperCase();
             if(userinput.equals("CIRCULATORY")){
                   print.effect("Manson: Good I guess you guys were listening",40);
                   print.effect("William: Nice Save!",40);
                             Item GPA = new FiniteItem("GPA", "grade", 2);
          p.getInventory().addItem(GPA);
          System.out.println(p.getInventory().getItem("GPA").getCount());
                } else {
                    print.effect("Manson:Wrong! Shut up and pay attention.",40);
                    print.effect("William:Damn we blew it she’s definitely going to keep an eye on us.",40);
                }
                print.effect("Manson: Let’s see Player how many bones are in the human body?",40);
             Scanner sc2 = new Scanner(System.in);
             String userinput2 = sc.next();
             userinput2 = userinput.toUpperCase();
             if(userinput.equals("206")){
                   print.effect("Manson: Good I guess you guys were listening",40);
                   print.effect("William: Nice Save!",40);
                             Item GPA = new FiniteItem("GPA", "grade", 2);
          p.getInventory().addItem(GPA);
          System.out.println(p.getInventory().getItem("GPA").getCount());
                } else {
                    print.effect("Manson:Wrong! Shut up and pay attention.",40);
                    print.effect("William:Damn we blew it she’s definitely going to keep an eye on us.",40);
                }
             
        Kodak(p);
    }
    
     public void chooseCollege(Player p) throws InterruptedException {
        print.effect("You GPA is " + p.getInventory().getItem("GPA").getCount() + "!", 60);
        print.effect("Here are your options:", 60);
        if(p.getInventory().getItem("GPA").getCount() >= 78){
            print.effect("[1] for BMCC", 40);
            if(p.getInventory().getItem("GPA").getCount() >= 86){
                print.effect("[2] for Stony Brook", 40);
                if(p.getInventory().getItem("GPA").getCount() >= 94){
                    print.effect("[3] for Harvard", 40);
                }
            }
        }
        print.effect("[0] to skip collage", 40);
        
        colleges(p);
     }
    
    public void colleges(Player p) throws InterruptedException {
        Scanner scc = new Scanner(System.in);
        int input = scc.nextInt();
        
        if(input == 0){
            college = "None";
        } else if ((input == 1) && (p.getInventory().getItem("GPA").getCount() >= 78)){
            college = "BMCC";
        } else if ((input == 2) && (p.getInventory().getItem("GPA").getCount() >= 86)){
            college = "StonyBrook";
        } else if ((input == 3) && (p.getInventory().getItem("GPA").getCount() >= 94)){
            college = "Harvard";
        } else {
            print.effect("Not an option! Pick again!", 20);
            colleges(p);
        }
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