package linkedList;

/**
 * Created by xinyuan on 2017/6/23.
 */
public class Node {
    public int val;
    public Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
    public Node(){}
    public int getData(){
        return this.val;
    }
    public void setData(int val){
        this.val = val;
    }
    public Node getNextNode(){
        return this.next;
    }
    public void setNextNode(Node next){
        this.next = next;
    }

}
