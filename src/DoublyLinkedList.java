import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head;
   private ListNode tail;
   private int length;
    private class ListNode
    {
        private int data;
        private ListNode next;
        private ListNode previous;
       public  ListNode(int data)
        {
            this.data=data;
        }
    }
    public DoublyLinkedList()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty()
    {
        return length==0;// head==null
    }
    public int length()
    {
        return length;
    }
    // insert the node into doublyLinkedlist
    public void insertLast(int value)
    {
        ListNode newNode=new ListNode(value);
        if(isEmpty())
        {
            head=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
        length++;
    }
    // insertFirst
    public void insertFirst(int value)
    {
        ListNode newNode=new ListNode(value);
        if(isEmpty())
        {
            tail=newNode;
        }
        else
        {
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }
    // print the element of the doubly linked list in java
    public void displayForword()
    {
        if(head==null)
        {
            return;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    // traverse the doublyLinkedList into the backWord Direction
    public void displaybackword()
    {
        if(tail==null)
        {
            return;

        }
        ListNode temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.previous;
        }
        System.out.println("Null");
    }
    // delete the first node of a doublyLinkedList
    public ListNode deleteFirst() throws NoSuchElementException{
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        ListNode temp=head;
        if(head==tail)
        {
            tail=null;
        }
        else
        {
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        length--;
        return temp;
    }
    // delete the LastNode of the linkedList
    public ListNode deleteLast()throws NoSuchElementException
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        ListNode temp=tail;
        if(head==tail)
        {
            head=null;
        }
        else
        {
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        length--;
        return temp;
    }

    public static void main(String[] args) throws NoSuchElementException {
        DoublyLinkedList obj=new DoublyLinkedList();
        obj.insertFirst(1);
        obj.insertFirst(10);
        obj.insertFirst(15);
        obj.insertFirst(25);
        obj.insertLast(7);
        obj.deleteFirst();
        obj.deleteLast();
        obj.displayForword();
        obj.displaybackword();

    }

}
