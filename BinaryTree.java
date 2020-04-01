
/**
 * Write a description of class MembersBinaryTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinaryTree
{
    // instance variables - replace the example below with your own
    public BinaryTree leftNode;
    public BinaryTree rightNode;
    public Object value;
    

    /**
     * Constructor for objects of class MembersBinaryTree
     */
    public BinaryTree(Object nodeVal)
    {
        value = nodeVal;
    }
    
    
    //incorporate two classes into one?
    public void addRightNode(Object val){
        rightNode = new BinaryTree(val);
    }
    
    public void addLeftNode(Object val){
        leftNode = new BinaryTree(val);
    }
    //^
    
    //preliminary class
    //addValue (entry)
    //if entry < nodeVal
    //add to left
    //if left full
    // if entry < left value
    // left value addValue(entry)
    // if entry > left value
    // swap left value with entry
    // left value addValue(entry) now leftValue and entry have swapped
    //if left empty
    // add to left node
    //vice versa for right
    
    // end of class
    
    
    public Object giveValue(){
        return value;
    }
}
