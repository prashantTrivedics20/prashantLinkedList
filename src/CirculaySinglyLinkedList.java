import java.util.NoSuchElementException;

public class CirculaySinglyLinkedList {
    private ListNode last;
    private int length;

    public CirculaySinglyLinkedList() {
        this.last = null;
        this.length = 0;
    }

    private class ListNode
    {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
        }
    }
    public int length()
    {
        return length;
    }
    public boolean isEmpty()
    {
        return length==0;
    }
    public void circularLinkedList()
    {
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(5);
        ListNode third=new ListNode(10);
        ListNode forth=new ListNode(15);
        first.next=second;
        second.next=third;
        third.next=forth;
        forth.next=first;
        last=forth;
    }
    // how to insert node at the start of a Circular Singly Linked List
    public void addFirst(int value)
    {
        ListNode newNode=new ListNode(value);
        if(last==null)
        {
            last=newNode;
        }
        else
        {
            newNode.next=last.next;
        }
        last.next=newNode;
    }
    // how to insert node at the last of a Circular Singly Linked List
    public void addLast(int value)
    {
        ListNode newNode=new ListNode(value);
        if(last==null)
        {
            last=newNode;
            last.next=last;
        }
        else
        {
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
        length++;
    }
    // how to traverse a circular singlyLinkedList in java
    public void display()
    {
        if(last==null)
        {
            return;
        }
        ListNode first=last.next;
        while(first!=last)
        {
            System.out.print(first.data+"-->");
            first=first.next;
        }
        System.out.println(first.data);

    }
    // how to remove first node from a circular Singly Linked List in java
    public ListNode removeFirst() throws NoSuchElementException
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        ListNode temp=last.next;
        if(last.next==last)
        {
            last=null;
        }
        else
        {
            last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;
    }


    public static void main(String[] args) {
        CirculaySinglyLinkedList obj=new CirculaySinglyLinkedList();
        obj.circularLinkedList();
        obj.addFirst(11);
        obj.addLast(17);
        //System.out.println(obj.removeFirst().data);
        obj.removeFirst();
        obj.removeFirst();
        obj.display();

    }
}
