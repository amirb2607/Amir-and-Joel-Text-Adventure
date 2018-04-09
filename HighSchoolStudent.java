/**
 * Sample player for school based text adventure game.
 * @author Sean Stern
 * @version 1.0
 */
public class HighSchoolStudent implements Player{
    
    private double GPA = 100;
    private int tiredness = 100;
    
    @Override
    public Inventory getInventory(){
        return null; 
    }
    
    @Override
    public double getHighSchoolGPA(){
        return GPA; 
    }
    
    @Override
    public int getTiredness(){
        return tiredness; 
    }
    
    @Override
    public int getMoney(){
        return 0;
    }

    public void changeGPA(int newGrade){
        GPA += newGrade;
    }
}