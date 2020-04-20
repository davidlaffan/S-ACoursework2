
/**
 * Write a description of class LinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedList
{
    private LinkedList next;
    TeamMember data;

    /**
     * Constructor for objects of class LinkedList
     */
    public LinkedList()
    {
        // initialise instance variables
    }

    public void newMember(TeamMember staff, LinkedList prevEmployee){
        this.data = staff;
        next = prevEmployee;
    }
    
    public LinkedList next(){
        return next;
    }
    
    

}
