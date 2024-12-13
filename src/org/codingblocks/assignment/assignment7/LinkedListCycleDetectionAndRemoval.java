package org.codingblocks.assignment.assignment7;


import java.util.HashSet;

public class LinkedListCycleDetectionAndRemoval {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
        Node tmp = list.head;
        while (tmp.next!=null){
            tmp = tmp.next;
        }
        tmp.next = list.getNode(2);     //cycle created
        HashSet<Node> set = new HashSet<>();
        System.out.println("------");
        tmp =list.head;
        while (tmp!=null){
            System.out.print(tmp.data+"-->");
            if (set.contains(tmp)){
                break;
            }
            set.add(tmp);
            tmp = tmp.next;
        }
        System.out.println();
        System.out.println(floydCycleRemoval(list.head));
        list.display();

    }
    //Floyd's Cycle detection algorithm
    public static boolean floydCycleRemoval(Node head) {
        /*Code here*/
        Node slow = head;
        Node fast = head;
        boolean found = false;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                found = true;
                break;
            }
        }
        if(found){
            slow = head;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
            Node temp = slow;
            while(temp.next!=slow){
                temp = temp.next;
            }
            temp.next = null;
        }
        return found;
    }
    static class Node {
        int data;
        Node next;
        public Node(int item){
            this.data = item;
            this.next=null;
        }
    }
    static class LinkedList {
        public Node head;
        public int size;
        public void add(int item){
            Node nn = new Node(item);
            if (head==null){
                head = nn;
            }else{
                Node temp = head;
                while (temp.next!=null){
                    temp = temp.next;
                }
                temp.next = nn;
            }
        }

        public void display(){
            Node temp = head;
            while (temp.next!=null){
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }

        public Node getNode(int index){
            Node temp = head;
            for (int i=0; i<index; i++){
                temp = temp.next;
            }
            return temp;
        }
    }
}
