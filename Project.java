import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
public class Project
{
    // instance variables - replace the example below with your own
    private String startDate, endDate;
    private String ProjectTitle;
    private LinkedList employeesHead;//linked list of team members
    private int listLength = 0;

    String pattern = "dd/mm/yyyy";

    // Create an instance of SimpleDateFormat used for formatting 
    // the string representation of date according to the chosen pattern
    DateFormat df = new SimpleDateFormat(pattern);
            //taken from https://stackoverflow.com/questions/5683728/convert-java-util-date-to-string

            /**
             * Constructor for objects of class Project
             */
    public Project(String name)
    {
        this.ProjectTitle = name;

    }

    public Project(String name, String beginning, String end)
    {
        this.ProjectTitle = name;
        this.startDate = beginning;
        this.endDate = end;
    }

    public Project(String name, String beginning)
    {
        this.ProjectTitle = name;
        this.startDate = beginning;
    }

    public void startProject(String startTime){ //used for putting projects started in the past
        startDate = startTime;
    }

    public void startProject(){
        Date today = Calendar.getInstance().getTime();
        //taken from https://stackoverflow.com/questions/5683728/convert-java-util-date-to-string

        startDate = df.format(today);
    }

    public void endProject(){
        Date today = Calendar.getInstance().getTime();
        //taken from https://stackoverflow.com/questions/5683728/convert-java-util-date-to-string
        endDate = df.format(today);
    }

    public void endProject(String endTime){
        startDate = endTime;
    }

    public String getStartTime(){
        return startDate;
    }

    public String getEndTime(){
        return endDate;
    }

    public String getName(){
        return ProjectTitle;
    }

    public int compareTo(Project comparator){
        int difference = comparator.getName().compareTo(getName());
        if (difference == 0){
            difference = comparator.getStartTime().compareTo(getStartTime());//If string fails compare start date
            if (difference == 0){//If start date fails compare end date
                difference = comparator.getEndTime().compareTo(getEndTime());//return difference in an integer 
            }
        }
        //if all else fails;
        return difference; //will compare two projects in order of; name, startDate, endDate. If all else fails, send 0, meaning it's the same
    }
    
    public TeamMember[] listProjectStaff(){
        TeamMember spool[] = new TeamMember[listLength];
        LinkedList traverser = employeesHead;
        for (int i = 0 ; i < spool.length ; i++){
            spool[i] = traverser.data;
            traverser = traverser.next();
        }
        return spool;
    }

}
