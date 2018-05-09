import java.util.ArrayList;
/**
 * Write a description of class Class here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Class implements Location
{
    // instance variables - replace the example below with your own
    private String teacher;
    private String desc;
    private ArrayList[][] questions;
    
    public Class(String teacher, String desc, ArrayList[][] questions){
      this.teacher = teacher;
      this.desc = desc;
      this.questions = questions;
    }

    @Override
    public String enter(Player p) throws InterruptedException
    {
        // put your code here
        return "da";
    }
    
    @Override
    public String getName(){
      return "Class";
    }
}
