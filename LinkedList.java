public class LinkedList{
    
    Node head;
    public static class Node{
        int data ;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
        
    }
    public void print()
    {
        Node n = head;
        while(n != null)
        {
            System.out.println(n.data);
            n = n.next;
        }
        
    }
    public void insert(int d)
    {
        if(head == null)
        {
            head = new Node(d);
        }
        else
        {
            Node n = head;
            
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = new Node(d);
        }
        
    }
    public void join(LinkedList first , LinkedList second)
    {
        Node n = first.head;
        Node n1 = second.head;
        while(n.next != null)
        {
            n = n.next;
        }
        n.next = second.head;
    }
    public void reverse()
    {
        Node nextt = null;
        Node current = head;
        Node prev = null;
        while(current != null)
        {
            nextt = current.next;
            current.next = prev;
            prev = current;
            current = nextt;
        }
        head = prev;
    }
    public static void main(String args[])
    {
        LinkedList i = new LinkedList();
        LinkedList j = new LinkedList();
        i.insert(1);
        i.insert(2);
        i.insert(3);
        i.insert(4);
        i.insert(5);
        i.insert(6);
        i.insert(7);
        i.print();
        i.reverse();
        i.print();
        
    }
    
    
}