import java.util.*;

public class Linkedlst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL sll = new SLL();
        Node ptr = sll.tail;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if(sll.head == null){
                sll.head = newNode;
                sll.tail = newNode;
            }
            else{
                sll.tail.next = newNode;
                sll.tail = newNode;
            }
        }
        ptr = sll.head;
        while(ptr != null){
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
    }
}

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
    Node(){
        this.val = 0;
        this.next = null;
    }
}

class SLL{
    Node head;
    Node tail;
    SLL(){
        this.head = null;
        this.tail = null;
    }
}