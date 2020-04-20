import javax.swing.*;
/**
 * Write a description of interface CompanyTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface CompanyTest 
{
    Company comp1 = new Company();
    
    public interface start{
    Object[] possibleValues = { "Add project", "Display a project's details", "Remove a project", "See all projects" };
Object selectedValue = JOptionPane.showInputDialog(null,"Choose one", "Input",JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
   // boolean test = comp1.newProject("test");
   } //new project
        //CompanyTest override
        //findProject()
        // if so, tell the user of the project and see if its recognisable
        //if yes, cancel. if no, continue
        
    
}
