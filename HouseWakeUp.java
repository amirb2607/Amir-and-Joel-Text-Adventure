import java.util.Scanner;
/**
 * Starting location for a school based text adventure game
 * @author Sean Stern
 * @version 1.0
 * @see AdventureForSoftwareEngineering
 */
public class HouseWakeUp implements Location{
    private int timeHr = 7;
    private String month = "March";
    private int day = 28;
    @Override
    public String getName(){
        // Location name will match class name for convenience
        return "HouseWakeUp";
    }

    @Override
    public String enter(Player p) throws InterruptedException{
        decideToGetUp(p);
        
        String nextLocationName = "0";
        if(day == 28) {
            if(timeHr == 8) {
                // After 8:30 MT, you're going to be late :-(
                System.out.println("*Sigh* I have Stony first!");
                Thread.sleep(1500);
                System.out.println("Should I go to Starbucks today?");
                Thread.sleep(1500);
                System.out.println("If I go then I'll miss 20 minutes of Stony.");
                Thread.sleep(2000);
                System.out.println("Do you want to go to Starbucks? [Yes] or [No]");
                Scanner sc = new Scanner(System.in);
                String userinput = sc.next();
                userinput = userinput.toUpperCase();
                Thread.sleep(1000);
                nextLocationName = "Starbucks";
                if(userinput.toLowerCase().equals("yes"))
                {
                  nextLocationName = "Starbucks";
                }
                else
                {
                  nextLocationName = "AXSE";
                }
            } else if(timeHr >= 9){
                // After 6:30 MT, you have just enough time to go
                System.out.println("'Oh gosh, I'm going to miss Ms. Village's class!'");
                Thread.sleep(1000);
                System.out.println("I guess that sucks.");
                Thread.sleep(1000);
                System.out.println("'Let's get dressed...'");
                Thread.sleep(1000);
                System.out.println("'And grab my backpack!'");
                Thread.sleep(1000);          
                nextLocationName = "AXSE";
            }
            else{
                // 6:30 MT or earlier, enough time to shower, eat, grab
                // all stuff
                System.out.println("'Man I really hate AXSE'");
                Thread.sleep(1000);
                System.out.println("'Why did I even choose this school?'");
                Thread.sleep(1000);
                System.out.println("'Damn I have Stony first.'");
                Thread.sleep(1000);
                System.out.println("'I guess I'll head out to Starbucks now.'");
                Thread.sleep(1000);
                nextLocationName = "Starbucks";
            }
            Inventory backpack = new AFSEBackpack();
            Item bills = new FiniteItem("Money", "The finest paper", 50);
            Item gpa = new FiniteItem("GPA", "Grades", 80);
            Item phone = new FiniteItem("Phone", "Phone", 1);
            backpack.addItem(bills);
            backpack.addItem(gpa);
            backpack.addItem(phone);
            
            p.setInventory(backpack);
        }
        
        // Before leaving the location, always 
        //  -check if we've hit game over (player is dead)
        //  -update the day and time for the next time player enters
        timeHr = 7;
        day++;
        // TBD: update month correctly
        return nextLocationName;
    }
    
    private void decideToGetUp(Player p) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        String sound = "beep!";
        for(int i = 0; i < 2; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                System.out.println(sound);
                // Pauses command line for 750 ms (0.75 sec)
                Thread.sleep(750);
            }
            System.out.print("\n**\n**[enter] TO CONTINUE\n**\n> ");
            // Pauses command line until user hits enter
            sc.nextLine();
            sound = sound.toUpperCase();
            Thread.sleep(1000);
        }

        System.out.format("\n%d:30 (MT) on %s %d.\n", timeHr, month, day );
        Thread.sleep(1000);
        System.out.println("'Another day at AXSE *sigh*'");
        Thread.sleep(1000);
        
        if(timeHr == 7){
            String options = "sdw";
            int selectedIdx = -1;
            while(!(selectedIdx >= 0)){
                System.out.print("**\n**[s] to sleep in\n**[d] To skip 1st and 2nd period for sleep\n"+
                    "**[w] TO WAKE UP\n**\n> ");
                String userInput = sc.next();
                Thread.sleep(1000);
                selectedIdx = options.indexOf(userInput);
                if(selectedIdx == 0){
                    snooze(p);
                }
                else if(selectedIdx == 1){
                    dismiss(p);
                }
            }
        }
    }

    private void snooze(Player p) throws InterruptedException{
        timeHr+=1;
        // Snoozing gives 10 health points
        p.changeTiredness(1);
        System.out.println("\n##\n##SNOOZING ALARM.\n##Player More Awake!\n" + 
            "##\n");
        decideToGetUp(p);
        Thread.sleep(1000);
    }

    private void dismiss(Player p) throws InterruptedException{
        timeHr+=2;
        // Dismissing gives 20 health points  
        p.changeTiredness(2);
        System.out.println("\n##\n##SNOOZING ALARM.\n##Player More Awake!\n" + 
            "##\n");
        decideToGetUp(p);
        Thread.sleep(1000);
    }
    
    public int returnHr(){
      return timeHr;
    }
    
    public int returnDay(){
      return day;
    }
    //ad
}