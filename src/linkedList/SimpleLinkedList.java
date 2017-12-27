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
        System.out.println("Hello World");

        Node head1 = new Node();
        Node head2 = new Node();
        LinkedList linkedList1 = new LinkedList(head1, new int[]{1,3,6});
        LinkedList linkedList2 = new LinkedList(head2, new int[]{1,7,8,9});
//        printLinkedList(reverseLinkedList(head));
//        printLinkedList(mergeTwoSortedList(head1, head2));
        insertionSort(head1);
        printLinkedList(head1);
    }
    /**mergeTwoSortedList*/
    public static Node mergeTwoSortedList(Node head1, Node head2){
        if(head1 == null || head1.next == null) return head2;
        if(head2 == null || head2.next == null) return head1;

        Node p1 = head1.next;
        Node p2 = head2.next;
        Node p = head1;
        while (p1 != null && p2 != null){
            if(p1.val < p2.val){
                p.next = p1;
                p = p1;
                p1 = p1.next;
            }else {
                p.next = p2;
                p = p2;
                p2 = p2.next;
            }
        }
        if(p1 == null){
            p.next = p2;
        }
        if(p2 == null){
            p.next = p1;
        }
        return head1;
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
        if (head == null || head.next == null || head.next.next ==null){
            return head;
        }

        Node pre = head.next;
        Node cur = pre.next;
        Node suc;
        pre.next = null;  //第一个节点将作为最后一个节点，断开防止形成环
        while (cur != null){
            suc = cur.next;
            cur.next = pre;
            pre = cur;
            cur = suc;
        }
        head.next = pre;
        return head;
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

    public static void insertionSort(Node head){
        if(head == null || head.next == null){
            return;
        }
        Node q = head.next.next;
        head.next.next = null;
        Node suc;
        while (q != null){
            Node pre = head;
            Node p = head.next;
            while(p !=null && p.val < q.val){
                pre = p;
                p = p.next;
            }
            pre.next = q;
            suc = q.next;
            q.next = p;
            q = suc;
        }
    }
    public static void
}
