import java.time.LocalDate;

public class Project
{
    // instance variables - replace the example below with your own
    private LocalDate startDate, endDate;
    private String ProjectTitle;
    //linked list of team members

    /**
     * Constructor for objects of class Project
     */
    public Project()
    {
        
    }
    
    public void startProject(LocalDate startTime){ //used for putting projects started in the past
        startDate = startTime;
    }
    
    public void startProject(){
        startDate = LocalDate.now();
    }
    
    public void endProject(){
        endDate = LocalDate.now();
    }
    
    public void endProject(LocalDate endTime){
        startDate = endTime;
    }
    
    public LocalDate getStartTime(){
        return startDate;
    }
    
    public LocalDate getEndTime(){
        return endDate;
    }


}
