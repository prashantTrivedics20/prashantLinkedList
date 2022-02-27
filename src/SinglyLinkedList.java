 class SinglyLinkedList {
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
    public void display()
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("Null");
    }
    // insert at the begenning
     public void insertFirst(int value)
     {
        ListNode newNode=new ListNode(value);
        if(head==null)
        {
            head=newNode;
        }
        else {
        newNode.next=head;
        head=newNode;
        }
     }
     // insert the node at the end of the linkedList
     public void addLast(int value)
     {
         ListNode newnode=new ListNode(value);
         if(head==null)
         {
             head=newnode;
             return;
         }
         ListNode current=head;
         while(current.next!=null)
         {
             current=current.next;
         }
         current.next=newnode;

     }
     // insert the node in the singlyLinkedList at the given position
     // here we are assuming that the node will start at the position 1
     public void insertTheNodeAtGivenPosition(int value,int position)
     {
         ListNode newNode=new ListNode(value);
         if(position==1)
         {
             newNode.next=head;
             head=newNode;
             return;
         }
         ListNode previous=head;
         int c=1;
         while(c<position-1)
         {
             previous=previous.next;
             c++;
         }
         ListNode current=previous.next;
         newNode.next= current;
         previous.next=newNode;

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
    // delete first node of a singlyLinkedList..
     public ListNode deleteFirstNode()
     {
         if(head==null)
         {
            return null;
         }
         ListNode temp=head;
         head=head.next;
         temp.next=null;// to break the link here we are using the temp.next=null
         return temp;
     }
     // delete last node of a singlyLinkedList....
     public ListNode deleteLast()
     {
         if(head==null||head.next==null)
         {
             return head;
         }
         ListNode current=head;
         ListNode previous=null;
         while(current.next!=null)
         {
             previous=current;
             current=current.next;
         }
         previous.next=null;// it will break the chain
         return current;
     }
     // delete the node of a singlyLinkedList at the given position...
     public void deleteAtGivenPosition(int position)
     {

         if(position==1)
         {
            head=head.next;
         }

         else
         {
             int count=1;
             ListNode current=head;
             while(count<position-1)
             {
                 current=current.next;
                 count++;
             }

             current.next=current.next.next;
             //
             }
     }
     // search the element of the linkedList
     public boolean search(int keyvalue)
     {
         if(head==null)
         {
             return false;
         }
         ListNode temp=head;
         while(temp!=null)
         {
             if(temp.data==keyvalue)
             {
                 return true;
             }
             temp=temp.next;
         }
         return false;

     }
     // if you want to show the deleted node or we can say if you want to print the deleted at the given position then..
     //public ListNode deleteAtGivenPosition(int position)
     //     {
     //         ListNode previous=null;
     //         if(position==1)
     //         {
     //            head=head.next;
     //         }
     //
     //         else
     //         {
     //             int count=1;
     //             ListNode current=head;
     //             while(count<position-1)
     //             {
     //                 current=current.next;
     //                 count++;
     //             }
     //             previous=current.next;
     //             current.next=current.next.next;
     //             //
     //
     //         }
     //         return  previous;
     //
     //     }

     public static void main(String[] args) {
         SinglyLinkedList obj=new SinglyLinkedList();
         obj.insertFirst(11);
        obj.insertFirst(8);
        obj.insertFirst(1);
        obj.addLast(12);
        obj.insertFirst(15);
        obj.insertTheNodeAtGivenPosition(2,3);
        System.out.println("Before deletion");
        obj.display();
        System.out.println(obj.deleteFirstNode().data);
        System.out.println("After deletion of the node");
        obj.display();
        System.out.println("Before deletion of the last node");
        obj.display();
        System.out.println("After deletion of the last node");
        System.out.println("that node to be deleted--> "+ obj.deleteLast().data);
        obj.display();
        System.out.println("before deletion of a node for given perticular position");
        obj.display();
         //System.out.println(obj.deleteAtGivenPosition(3).data);// if you want to print the deleted value then simply call this..
         obj.deleteAtGivenPosition(3);
        System.out.println("After the deletionmof a node for a given position");
        obj.display();

        System.out.println(obj.length());
         System.out.println(obj.search(8));
    }


}
