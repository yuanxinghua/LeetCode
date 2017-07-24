package linkedList;

/**
 * Created by xinyuan on 2017/6/23.
 */
public class LinkedList {
    Node head;
    public LinkedList(Node head){
        this.head = head;
    }
    public LinkedList(Node head, int[] vals){
        this.head = head;
        for (int i = 0; i < vals.length; i++){
            insertToTail(vals[i]);
        }
    }
    public void insertToTail(int val){
        Node p = head;
        while (p.next != null){
            p = p.next;
        }
        p.next = new Node(val);
    }
    public boolean insertByIndex(int index, int val){
        if (index < 0){
            return false;
        }
        int i = 0;
        Node p = head;
        while (p != null){
            if(i == index){
                //插入
                Node temp = p.next;
                p.next = new Node(val);
                p.next.next = temp;
                return true;
            }else {
                i++;
                p = p.next;
            }
        }
        return false;
    }
    public void insertToHead(int val){
        Node p = head;
        Node temp = p.next;
        p.next = new Node(val);
        p.next.next = temp;

    }
    public boolean deleteByValue(int val){
        Node p = head;
        while (p.next != null){
            if(p.next.val == val){
                //delete
                p.next = p.next.next;
                return true;
            }
            p = p.next;
        }

        return false;
    }
    public boolean deleteByIndex(int index){
        Node p = head;
        int i = 0;
        while (p.next != null){
            if (i == index){
                //delete
                p.next = p.next.next;
                return true;
            }
            p = p.next;
            i++;
        }

        return false;
    }
    public int getLength(){
        int length = 0;
        Node p = head.next;
        while (p != null){
            length++;
            p = p.next;
        }
        return length;
    }
    public void printLinkedList(){
        Node p = head.next;
        System.out.print("[ ");
        while (p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.print("]");
        System.out.println();
    }
}
