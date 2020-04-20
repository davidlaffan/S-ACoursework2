
/**
 * Write a description of class MembersBinaryTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinaryTree
{
    // instance variables - replace the example below with your own
    public BinaryTree leftNode = new BinaryTree();
    public BinaryTree rightNode = new BinaryTree();
    private Project value;

    /**
     * Constructor for Projects of class MembersBinaryTree
     */
    public BinaryTree(Project nodeVal)
    {
        this.value = nodeVal;
    }

    public BinaryTree(){

    }

    //incorporate two classes into one?
    public void addRightNode(Project val){
        rightNode = new BinaryTree(val);
    }

    public void addLeftNode(Project val){
        leftNode = new BinaryTree(val);
    }

    // 
    public void add(Project val){ //addValue (entry) 
        //implement some things in Project
        if (val.compareTo(value) < 0){//if entry < nodeVal
            //add to left
            if (leftNode != null){//if left full
                if (val.compareTo(leftNode.giveValue())< 0){// if entry < left value
                    leftNode.add(val);// left value addValue(entry)
                }
                if (val.compareTo(leftNode.giveValue())> 0){ // if entry > left value
                    Project temp = val;// swap left value with entry
                    val = leftNode.giveValue();
                    changeLeftValue(temp);
                    // left value addValue(entry) now leftValue and entry have swapped
                    leftNode.add(val);
                }
                //exception handling
            }
            else{
                addLeftNode(val);//if left empty
                // add to left node
            }
        }

        //vice versa for right
        else if (val.compareTo(value) == 0){
            this.value = val;//exception, it is the same project, action: override
        }
        else if (val.compareTo(value) > 0){// else if (){
            //vice versa for right
            if (rightNode != null){//if right full
                if (val.compareTo(rightNode.giveValue())< 0){// if entry < right value
                    rightNode.add(val);// right value addValue(entry)
                }
                if (val.compareTo(rightNode.giveValue())> 0){ // if entry > right value
                    Project temp = val;// swap right value with entry
                    val = rightNode.giveValue();
                    changeRightValue(temp);
                    // right value addValue(entry) now rightValue and entry have swapped
                    rightNode.add(val);
                }
                //exception handling
            }
            else{
                addRightNode(val);//if right empty
                // add to right node
            }// }

            // end of class
        }
    }

    public Project giveValue(){
        return value;
    }

    public BinaryTree giveLeftNode(){
        //return left node
        return leftNode;
    }

    public BinaryTree giveRightNode(){
        //return right node
        return rightNode;
    }

    private void changeLeftValue(Project newVal){
        leftNode.value = newVal;
    }

    private void changeRightValue(Project newVal){
        leftNode.value = newVal;
    }
}
