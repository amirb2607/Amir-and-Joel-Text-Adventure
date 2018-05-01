import java.util.ArrayList;
import java.util.List;

/**
 * Implementaiton of text adventure game involving a first year teacher
 * starting at a new school teaching CS.
 * @author Sean Stern
 * @version 1.0
 */
public class AdventureForSoftwareEngineering implements Game{

    @Override
    public List<Location> getLocations(){
        List<Location> levels = new ArrayList<Location>();
        //levels.add(new HouseWakeUp());
        //levels.add(new Starbucks());
<<<<<<< HEAD
        //levels.add(new AXSE());
        levels.add(new StonyBrook());
=======
       // levels.add(new AXSE());
        //levels.add(new StonyBrook());
        levels.add(new Harvard());
>>>>>>> ea912457293852ea7b5e4a8473c0127dbaebb21c
        
        return levels;
    }

    @Override
    public Player getPlayer(){
        return new HighSchoolStudent();
    }
}