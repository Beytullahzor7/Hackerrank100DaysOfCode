package HackerRank;

import java.util.Scanner;

public class LinkedListDay15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = Solution.insert(head,ele);
        }
        Solution.display(head);
        sc.close();
    }
}
class Node{
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }
}
class Solution{
    public static Node insert(Node head, int data){
        if(head == null){
            return new Node(data);
        }else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
            return head;
        }
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}
