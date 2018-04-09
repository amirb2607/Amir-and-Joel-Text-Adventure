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

        String nextLocationName;
        if(timeHr == 8){
            // After 8:30 MT, you're going to be late :-(
            System.out.println("*Sigh* I have Stony first!");
            Thread.sleep(1000);
            System.out.println("Should I go to Starbucks today?");
            Thread.sleep(1000);
            System.out.println("If I go then I'll miss 20 minutes of Stony");
            Thread.sleep(1000);
            System.out.println("Do you want to go to Starbucks?");
            Scanner sc = new Scanner(System.in);
            String userinput = sc.next();
            Thread.sleep(1000);
            if(userinput.equals("YES"))
            {
              nextLocationName = "Starbucks";
            }
            else
            {
              nextLocationName = "AXXE";
            }
        }
        else if(timeHr > 9){
            // After 6:30 MT, you have just enough time to go
            System.out.println("'Oh gosh, I'm going to miss Ms. Village's class!'");
            Thread.sleep(1000);
            System.out.println("I guess that sucks.");
            Thread.sleep(1000);
            System.out.println("'Let's get dressed...'");
            Thread.sleep(1000);
            System.out.println("'And grab my wallet, keys, and phone!'");
            Thread.sleep(1000);
            // TBD: Create inventory items including cash, keys, phone
            // and add this to player inventory for future locations
            // e.g.
            // Item bills = new Money("Money", 20);
            // Item keys = new Keys("Keys", 5);
            // Item phone = new Phone("Phone");
            nextLocationName = "SubwayPlatformMorning";
        }
        else{
            // 6:30 MT or earlier, enough time to shower, eat, grab
            // all stuff
            System.out.println("'Nothing like a shower to wake me up!'");
            Thread.sleep(1000);
            System.out.println("'...bruffin mah teef...'");
            Thread.sleep(1000);
            System.out.println("'Let's get dressed...'");
            Thread.sleep(1000);
            System.out.println("'Grab my wallet, keys, and phone.'");
            Thread.sleep(1000);
            System.out.println("'Wow, I nearly forgot to bring the first " +
                "day's quizzes!'");
            Thread.sleep(1000);
            
            Inventory backpack = new AFSEBackpack();
            Item bills = new FiniteItem("Money", "The finest paper", 50);
            Item keys = new FiniteItem("Keys", "Keys", 5);
            Item phone = new FiniteItem("Phone", "Phone", 1);
            backpack.addItem(bills);
            backpack.addItem(keys);
            backpack.addItem(phone);
            //System.out.println(backpack.hasItem("Money"));
            nextLocationName = "Starbucks";
        }

        // Before leaving the location, always 
        //  -check if we've hit game over (player is dead)
        //  -update the day and time for the next time player enters
        if(p.getHealth() <= 0){
            nextLocationName = "GameOver";
        }
        timeHr = 4;
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
        System.out.println("'Another day at AFSE *sigh*'");
        Thread.sleep(1000);

        String options = "5dw";
        int selectedIdx = -1;
        while(!(selectedIdx >= 0)){
            System.out.print("**\n**[5] for 5 more mintues\n**[d] To skip 1st and 2nd period\n"+
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

    private void snooze(Player p) throws InterruptedException{
        timeHr+=1;
        // Snoozing gives 10 health points
        p.changeHealth(10);
        System.out.println("\n##\n##SNOOZING ALARM.\n##GAINED 10 HEALTH!\n" + 
            "##\n");
        Thread.sleep(1000);
        decideToGetUp(p);
    }

    private void dismiss(Player p) throws InterruptedException{
        timeHr+=2;
        // Dismissing gives 20 health points  
        p.changeHealth(20);
        System.out.println("\n##\n##DISMISSING ALARM.\n##GAINED 20 HEALTH!\n" +
            "##\n");
        Thread.sleep(1000);
        decideToGetUp(p);
    }
    
    public int returnHr(){
      return timeHr;
    }
    
    public int returnDay(){
      return day;
    }
    //ad
}