package linkedList;

/**
 * Created by xinyuan on 2017/6/23.
 */
public class SimpleLinkedList {
    public static void main(String[] args){
//        Node head = new Node();
//        LinkedList linkedlist = new LinkedList(head);
//        linkedlist.insertToTail(0);
//        linkedlist.insertByIndex(0,0);
//        linkedlist.insertByIndex(1,1);
//        linkedlist.insertToHead(2);
//        linkedlist.insertByIndex(4, 4);
//        linkedlist.insertToTail(10);
//        linkedlist.printLinkedList();
//        linkedlist.deleteByValue(4);
//        linkedlist.printLinkedList();
//        linkedlist.deleteByIndex(6);
//        linkedlist.printLinkedList();
//        System.out.print(linkedlist.getLength());

        Node head = new Node();
        LinkedList linkedList = new LinkedList(head, new int[]{1,4,7,2,5});
        printLinkedList(reverseLinkedList(head));
    }

    public static Node insertionSortList(Node head){
        if( head == null ){
            return head;
        }

        Node helper = new Node(0); //new starter of the sorted list
        Node cur = head; //the node will be inserted
        Node pre = helper; //insert node between pre and pre.next
        Node next = null; //the next node will be inserted
        //not the end of input list
        while( cur != null ){
            next = cur.next;
            //find the right place to insert
            while( pre.next != null && pre.next.val < cur.val ){
                pre = pre.next;
            }
            //insert between pre and pre.next
            cur.next = pre.next;
            pre.next = cur;
            pre = helper;
            cur = next;
        }
        return helper.next;
    }
    public static Node reverseLinkedList(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node pre = head;
        Node cur = pre.next;
        Node next = null;
        while (cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head.next = null;
        return pre;
    }
    public static void printLinkedList(Node head){
        if(head == null){
            return;
        }

        Node p = head.next;
        System.out.print("[ ");
        while (p != null){
            System.out.print(p.val + " ");
            p= p.next;

        }
        System.out.print("]");

    }

}
