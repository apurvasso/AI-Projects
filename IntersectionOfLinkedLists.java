//import java.util.*;
//public class IntersectionOfLinkedLists {
//
//    Node head;
//    static  class Node{
//        int data;
//        Node next;
//        Node(int d){
//            data=d;
//            next = null;
//        }
//    }
//    public void append(int d){
//        Node n = new Node(d);
//        if(head == null){
//            head = new Node(d);
//            return;
//        }
//
//        n.next = null;
//        Node last = head;
//        while (last.next!=null){
//            last = last.next;
//        }
//        last.next = n;
//        return;
//    }
//    public void printList(){
//        Node n = head;
//        while(n!=null){
//            System.out.println(n.data + " ");
//            n = n.next;
//        }
//    }
//    static int[] intersectionOfLinkedLists(){
//
//    }
//
//
//    public static void main(String[] args){
//        IntersectionOfLinkedLists l1 = new IntersectionOfLinkedLists();
//        IntersectionOfLinkedLists l2 = new IntersectionOfLinkedLists();
//        l1.append(0);
//        l1.append(1);
//        l1.append(2);
//        l1.append(3);
//        l1.append(4);
//        l1.append(5);
//        l1.append(6);
//        l1.append(7);
//
//
//        l2.append(9);
//        l2.append(0);
//        l2.append(12);
//        l2.append(3);
//        l2.append(4);
//        l2.append(5);
//        l2.append(6);
//        l2.append(7);
//
//        for(i)
//    }
//}
