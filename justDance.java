import java.util.Scanner;
/**
 * Write a description of class justDance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class justDance
{
    // instance variables - replace the example below with your own
    public static char key;
    public static int time;
    public static int gameDificulty;
    
    private static int currTime = 0;
    private static int keyTime = 0;
    
    private static long startTime = 0;
    
    
    public static void start(int song, int dificulty) throws InterruptedException {
        // initialise instance variables
        time = song;
        gameDificulty = dificulty;
        
        startTime = System.nanoTime();
        
        newKey();
    }
    
    public static void newKey() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        
        String tempKey = "1234567890qwertyuiopasdfghjklzxcvbnm";
        key = tempKey.charAt((int)(Math.random() * 36));
        print.reg(key + "", gameDificulty * 500);
        currTime = (int)((System.nanoTime() - startTime) / 1000000000);
        char letterPressed = sc.next().charAt(0);
        if(letterPressed == key){
            print.reg("+ 1", 0);
        }
        
        if(currTime < time) {
            newKey();
        }
    }
    
}
