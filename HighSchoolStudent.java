import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Sample player for school based text adventure game.
 * @author Sean Stern
 * @version 1.0
 */
public class HighSchoolStudent implements Player{
    
    private int tiredness = 5;
    private Inventory i = null;
    private int hour = 7;
    private double money = 20;
    //private int GPA = 76;
    private FiniteItem GPA;
    ArrayList<String> clubs = new ArrayList<String>();
    private Class[] schedule = new Class[6];
    
    //public Item getGPA(){
     // return 
    //}
    
    
    
    @Override
    public Inventory getInventory(){
        return i; 
    }
    
    @Override
    public int getTiredness(){
        return tiredness; 
    }
    
    @Override
    public void changeTiredness(int change){
        tiredness += change;
    }
    
    @Override
    public void setInventory(Inventory iv){
        i = iv;
    }
    
    @Override
    public void changeHour(int t){
        hour += t;
    }
    
    @Override
    public int getHour(){
        return hour;
    }
    
    @Override
    public void changeMoney(double m){
        money += m;
    }
    
    @Override
    public double getMoney(){
        return money;
    }
    
    /*@Override
    public void changeGPA(int g){
        GPA += g;
    }
    
    @Override
    public int getGPA(){
        return GPA;
    }
    */
    
    @Override
    public String getClub(String club){
        return clubs.get(clubs.indexOf(club));
    }
    
    @Override
    public void addClub(String club){
        clubs.add(club);
        System.out.println("You joined the " + club + " club!");
    }
}