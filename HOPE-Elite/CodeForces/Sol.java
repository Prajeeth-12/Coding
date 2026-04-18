import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class Sol {
    static Node first=null;
    static Node last=null;
    static int ind=-1;
    
    public static void append1(int n) {
        Node newnode=new Node(n);
        if(first==null)
        {
            first=last=newnode;
        }
        else
        {
            last.next=newnode;
            last=newnode;
        }
        
    }
    public static void reverse() {
        Node prev=first,ptr=first.next;
        prev.next=null;
        first=prev;
        while(ptr!=null)
        {
            prev=ptr;
            ptr=ptr.next;
            prev.next=first;
            first=prev;
        }
    }
    public static void display()
    {
        Node ptr=first;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        String line = sc.nextLine();
        String[] parts = line.split(" ");

        for (String p : parts) {
            append1(Integer.parseInt(p));
        }
        //display();
        reverse();
        //System.out.println();
        display();
    }
}