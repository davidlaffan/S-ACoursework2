
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
    
    public void addRightNode(Object val){
        rightNode = new BinaryTree(val);
    }
    
    public void addLeftNode(Object val){
        leftNode = new BinaryTree(val);
    }
    
    public Object giveValue(){
        return value;
    }
}
