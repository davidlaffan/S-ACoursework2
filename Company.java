import javax.swing.*;
/**
 * Write a description of class Company here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Company
{
    BinaryTree TreeHeadForProjects;//Binary tree of projects
    boolean firstProject = true;

    int projectListLength = 0 ;

    //functions will return booleans, true for ran succesfully, false for error
    /**
     * Constructor for objects of class Company
     */
    public static void main(String[] args)
    {

    }

    public void newProject(String info){//new project, string is comma-separated by name, start date (DD/MM/YYYY) and end date. 
        String[] data = info.split(",");
        Project addToTree = null;
        if (data.length == 1){ //assume only the name has been given
            addToTree = new Project (data[0]);
        }
        else if (data.length ==2){
            addToTree = new Project (data[0], data[1]);// has a name and start date
        }
        else if(data.length == 3 && data[2].equals("")){
            addToTree = new Project(data[0], data[1]);//does not have a start date but an end date
        }
        else if(data.length == 3 && !data[2].equals("")){
            addToTree = new Project(data[0], data[1], data[2]);//has a start date and an end date
        }
        //add project to binary tree
        //ask for name, start date, end date
        if (firstProject == true){
            TreeHeadForProjects = new BinaryTree(addToTree);//values
        }
        projectListLength++;
    }

    public void newProjectMember(){   //new member to specific project
        listProjects();
        //ask for member info
        //check for any similarities
    }


    public void removeTeamMember(Project effected){//remove employee from a project
        TreeHeadForProjects.add(effected);
        //list employees, user chooses which employee is dropped
    }

    public void removeProject(){//remove project from a system
        Project[] spool = listProjects();
        String[] listedProjects = new String[spool.length];
        for (int i = 0 ; i<spool.length; i++){
            listedProjects[i] = spool[i].getName();

        }
        int option = Integer.parseInt((String)JOptionPane.showInputDialog(null,"Choose one", "Input",JOptionPane.INFORMATION_MESSAGE, null, listedProjects, listedProjects[0]));
        //Option will be saved as an integer which will then be used to display appropriate project//companyTest overide??
        //lists all projects, user chooses project
        //confirmation of the users choice
        //^^
        //list is set up without the deleted project
    }
    //common functions
    private void findProject(String name){

    }//find project

    private Project[] listProjects(){
        Project spool[];
        if (firstProject == true){
            spool = null;

        }
        else{
            spool = new Project[projectListLength];
            spool[0] = TreeHeadForProjects.giveValue();
            for (int i = 1 ; i<spool.length; i++){
                spool[i] = TreeHeadForProjects.giveValue();
            }
        }

        return spool;

    }//list all projects

    private void traversal(BinaryTree node){
    }
    public void run(){
        Object[] possibleValues = { "Add project", "Display a project's details", "Remove a project", "See all projects", "Exit" };
        String selectedValue = String.valueOf(JOptionPane.showInputDialog(null,"Choose one", "Input",JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]));
        System.out.println(String.valueOf(selectedValue));
        if (selectedValue.equals("Exit") || selectedValue.equals("null")){ //if the user exits the choice box, it is considered as wanting to exit the program. Due to the String conversation, it is saved as "null" as compared to null
            System.exit(0);
        }
        else if (selectedValue.equals("Add project")){
            String name = JOptionPane.showInputDialog("Please enter the project name");
            String start = JOptionPane.showInputDialog("Please enter the date the project started (dd/mm/yyyy)(leave blank if the date is unknown)");
            String end = JOptionPane.showInputDialog("Please enter the date the project ended (dd/mm/yyyy)(leave blank if the date is unknown)");
            String setup = name + "," + start + "," + end;
            newProject(setup);
        }
        else if (selectedValue.equals("Display a project's details")){
            try{
                Project[] spool = listProjects();
                String[] listedProjects = new String[spool.length];
                for (int i = 0 ; i<possibleValues.length; i++){
                    listedProjects[i] = spool[i].getName();

                }
                int projectValue = Integer.parseInt((String)JOptionPane.showInputDialog(null,"Choose one", "Input",JOptionPane.INFORMATION_MESSAGE, null, listedProjects, listedProjects[0]));
                //Option will be saved as an integer which will then be used to display appropriate project
                String info, lineBreaker = System.getProperty("line.separator");
                info = "Project name: " + spool[projectValue].getName() + lineBreaker + "Start date: " + spool[projectValue].getStartTime();
                if (spool[projectValue].getStartTime() != "" || spool[projectValue].getStartTime() != null){
                    info = info + "Start date: " + spool[projectValue].getStartTime() +lineBreaker;
                }//if start time does not exist
                if (spool[projectValue].getEndTime() != "" || spool[projectValue].getEndTime() != null){//if end time does not 
                    info = info + "End date: " + spool[projectValue].getEndTime() +lineBreaker;
                }
                JOptionPane.showMessageDialog(null, info);
                info = "";
                TeamMember staff[] = spool[projectValue].listProjectStaff();
                for (int i = 0; i< staff.length; i++){
                    info = info + "Employee " + String.valueOf(i+1) + lineBreaker;
                    info = info + "\t" + "Name: " + staff[i].giveName();
                    info = info + "\t" + "Department: " + staff[i].showDept();
                    info = info + "\t" + "ID Number: " + staff[i].giveID();
                }// next window, show employees
                JOptionPane.showMessageDialog(null, info);
            } catch (Exception e){

                JOptionPane.showMessageDialog(null, "Could not load");

            }

        }
        else if (selectedValue.equals("Remove a project")){

        }
        else if (selectedValue.equals("See all projects")){
            Project[] display = listProjects();
            for (int i = 0; i < display.length ; i++){

                System.out.println("Project name: " +display[i].getName());
                System.out.println("Start date: " + display[i].getStartTime());
                System.out.println("End date: " + display[i].getEndTime());

                System.out.println("*END OF PROJECT INFORMATION");
            }
        }
        run();
    }

}
