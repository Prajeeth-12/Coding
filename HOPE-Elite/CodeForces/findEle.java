import java.util.*;

public class findEle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        SLL sll = new SLL();
        while(sc.hasNextInt()){
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
        int target = sc.nextInt();
        Node ptr = sll.head;
        int flag = 0;
        while(ptr!=null){
            if(ptr.val == target){
                System.out.print(target);
                flag = 1;
            }
            ptr = ptr.next;
        }
        if(flag == 0) System.out.print(-1);
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