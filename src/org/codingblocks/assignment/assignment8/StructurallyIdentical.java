package org.codingblocks.assignment.assignment8;

import java.util.Scanner;

public class StructurallyIdentical {

    public static boolean structurallyIdentical(Node tnode, Node onode) {
        // write your code here
        if (tnode == null && onode == null)
            return true;
        if (tnode == null || onode == null)
            return false;

        return structurallyIdentical(tnode.left, onode.left) &&
                structurallyIdentical(tnode.right, onode.right);
    }

    static class Node {
        int val;
        Node left;
        Node right;
    }
}
