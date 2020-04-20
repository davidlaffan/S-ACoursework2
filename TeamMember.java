
/**
 * Write a description of class TeamMember here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TeamMember
{
    // instance variables - replace the example below with your own
    String name, division;
    int employeeNum;

    /**
     * Constructor for objects of class TeamMember
     */
    public TeamMember(String n, String d, int id)
    {
        this.name = n;
        this.division = d;
        this.employeeNum = id;// initialise instance variables
    }

    public String giveName(){
        return name;
    }
    
    public String showDept(){
        return division;
    }
    
    public int giveID(){
        return employeeNum;
    }

}
