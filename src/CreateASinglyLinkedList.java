public class CreateASinglyLinkedList {
    private ListNode head;// initialy the head ->NULL
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // how to insert a node at the beginning of a linkedList

    // how to print elements of a Singly Linked List in java
    public void display(ListNode head)
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("Null");

    }
    // length of the singly linked list

    public int length()
    {
        if(head==null)
        {
           return 0;
        }
        int count=0;
        ListNode current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }
    public boolean search(ListNode head,int keyvalue)
    {
        if(head==null)
        {
            return false;
        }
        else
        {
            ListNode current=head;
            while(current!=null) {
                if (current.data == keyvalue) {
                    return true;
                }

                current = current.next;
            }
            return false;
        }
    }
    // reh
    ListNode reverse(ListNode head)
    {
        if(head==null)
        {
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    public static void main(String[] args) {
        CreateASinglyLinkedList obj=new CreateASinglyLinkedList();
        obj.head=new ListNode(10);
        ListNode second =new ListNode(1);
        ListNode third =new ListNode(8);
        ListNode fourth =new ListNode(11);
        // now we will connect them together to form a chain
        obj.head.next=second;//10-->1
        second.next=third;//10-->1-->8
        third.next=fourth;//10-->1-->8-->11-->NULL
        //obj.display();
        if(obj.search(obj.head,1))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        System.out.println(obj.length());
        ListNode reverseListHead=obj.reverse(obj.head);
        obj.display(reverseListHead);
    }


}
