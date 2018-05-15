import java.util.Scanner;
/**
 * Starting location for a school based text adventure game
 * @author Sean Stern
 * @version 1.0
 * @see AdventureForSoftwareEngineering
 */
public class HouseWakeUp implements Location{

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
            if(p.getHour() == 8) {
                // After 8:30 MT, you're going to be late :-(
                print.effect("*Sigh* I have Stony first!", 40);
                print.effect("Should I go to Starbucks today?", 40);
                print.effect("If I go then I'll miss 20 minutes of Stony.", 40);
                print.effect("Do you want to go to Starbucks? [Yes] or [No]", 40);
                Scanner sc = new Scanner(System.in);
                String userinput = sc.next();
                userinput = userinput.toUpperCase();
                if(userinput.equals("YES"))
                {
                  nextLocationName = "Starbucks";
                }
                else {
                  nextLocationName = "AXSE";
                }
            } else if(p.getHour() >= 9){
                // After 6:30 MT, you have just enough time to go
                print.effect("'Oh gosh, I'm going to miss Ms. Village's class!'", 40);
                print.effect("I guess that sucks.", 40);
                print.effect("'Let's get dressed...'", 40);
                print.effect("'And grab my backpack!'", 40);         
                nextLocationName = "AXSE";
            }
            else{
                // 6:30 MT or earlier, enough time to shower, eat, grab
                // all stuff
                print.effect("'Man I really hate AXSE'", 40);
                print.effect("'Why did I even choose this school?'", 40);
                print.effect("'Damn I have Stony first.'", 40);
                print.effect("'I guess I'll head out to Starbucks now.'", 40);
                nextLocationName = "Starbucks";
            }
            Inventory backpack = new AFSEBackpack();
            Item phone = new FiniteItem("Phone", "Phone", 1);
            backpack.addItem(phone);
            p.setInventory(backpack);
        }
        p.changeHour(1);
        // Before leaving the location, always 
        //  -check if we've hit game over (player is dead)
        //  -update the day and time for the next time player enters
        day++;
        // TBD: update month correctly
        return nextLocationName;
    }
    
    private void decideToGetUp(Player p) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        String sound = "beep!";
        for(int i = 0; i < 2; i++){
            print.effect("", 40);
            for(int j = 0; j < 3; j++){
                print.effect(sound, 40);
                // Pauses command line for 750 ms (0.75 sec)
            }
            System.out.print("\n**\n**[enter] TO CONTINUE\n**\n> ");
            // Pauses command line until user hits enter
            sc.nextLine();
            sound = sound.toUpperCase(); 
        }
        System.out.format("\n%d:30 (MT) on %s %d.\n", p.getHour(), "March", day );
        print.effect("'Another day at AXSE *sigh*'", 40);
        if(p.getHour() == 7){
            String options = "sdw";
            int selectedIdx = -1;
            while(!(selectedIdx >= 0)){
                System.out.print("**\n**[s] to sleep in\n**[d] To skip 1st and 2nd period for sleep\n"+
                    "**[w] TO WAKE UP\n**\n> ");
                String userInput = sc.next();
                 
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
        p.changeHour(1);
        // Snoozing gives 10 health points
        p.changeTiredness(1);
        print.reg("\n##\n##SNOOZING ALARM.\n##Player More Awake!\n" + 
            "##\n", 0);
        decideToGetUp(p);
    }

    private void dismiss(Player p) throws InterruptedException{
        p.changeHour(2);
        // Dismissing gives 20 health points  
        p.changeTiredness(2);
        print.reg("\n##\n##SNOOZING ALARM.\n##Player More Awake!\n" + 
            "##\n", 0);
        decideToGetUp(p);
    }
    
    public int returnDay(){
      return day;
    }
}