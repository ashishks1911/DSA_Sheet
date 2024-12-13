package org.codingblocks.linkedlist;

public class SortList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(6);
        ll.addLast(5);
        ll.display();
        LinkedList.Node newHead = sortList(ll.getHead());
        ll.setHead(newHead);
        ll.display();

    }

    public static LinkedList.Node sortList(LinkedList.Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedList.Node mid = middleNode(head);
        LinkedList.Node midNext = mid.next;
        mid.next = null;
        LinkedList.Node list1 = sortList(head);
        LinkedList.Node list2 = sortList(midNext);
        return mergeTwoLists(list1, list2);
    }

    //Efficient : in case of even nodes get the 1sd
    public static LinkedList.Node middleNode(LinkedList.Node head) {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static LinkedList.Node mergeTwoLists(LinkedList.Node list1, LinkedList.Node list2) {
        LinkedList dummy = new LinkedList();
        LinkedList.Node ll = dummy.getNode();
        LinkedList.Node temp = ll;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ll.next = list1;
                ll = ll.next;
                list1 = list1.next;
            } else {
                ll.next = list2;
                ll = ll.next;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            ll.next = list1;
        }
        if (list2 != null) {
            ll.next = list2;
        }
        return temp.next;
    }

}
