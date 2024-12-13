package org.codingblocks.linkedlist;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        LinkedList.Node nn = ll.getHead();
        LinkedList.Node ans = middleNode(nn);
        System.out.println(ans.val);

    }
    //Efficient : in case of even nodes get the 2nd
    public static LinkedList.Node middleNode(LinkedList.Node head) {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static LinkedList.Node middleNode2(LinkedList.Node head) {
        LinkedList.Node temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int mid = size/2;
        temp = head;
        int count= 0;
        LinkedList.Node ans = null;
        while(temp!=null){
            if(count==mid){
                ans = temp;
                break;
            }
            temp = temp.next;
            count++;
        }
        return temp;

    }
}
