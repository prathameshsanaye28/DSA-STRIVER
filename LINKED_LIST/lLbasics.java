/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class lLbasics {
    public static Node constructLL(int []arr) {
        Node head= new Node(arr[0]);
        Node next = new Node();
        next=head;
        for(int i=1; i<arr.length; i++)
        {
            Node temp = new Node(arr[i]);
            next.next=temp;
            next=next.next;
        }
        next.next=null;
        return head;
    }
}
