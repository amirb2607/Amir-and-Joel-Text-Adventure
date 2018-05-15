/**
 * Write a description of class justDance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class justDance
{
    // instance variables - replace the example below with your own
    private char key;
    private int time;
    private int dificulty;
    
    private int currTime = 0;
    private int keyTime = 0;
    /**
     * Constructor for objects of class justDance
     */
    public void justDance(int song, int dificulty){
        // initialise instance variables
        time = song;
        this.dificulty = dificulty;
        
        newKey();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void newKey()
    {
        String tempKey = "1234567890qwertyuiopasdfghjklzxcvbnm";
        key = tempKey.charAt((int)(Math.random() * 36));
        if(currTime < time){
            newKey();
        }
    }
}
