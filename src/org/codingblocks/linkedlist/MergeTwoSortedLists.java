package org.codingblocks.linkedlist;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);
        LinkedList list2 = new LinkedList();
        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);
        LinkedList.Node head = mergeTwoLists(list1.getHead(), list2.getHead());
        LinkedList ll = new LinkedList();
        ll.setHead(head);
        ll.display();

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
        if (list1 == null) {
            ll.next = list2;
        }
        if (list2 == null) {
            ll.next = list1;
        }
        return temp.next;
    }
}
