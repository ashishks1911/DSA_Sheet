package org.codingblocks.assignment.assignment9;

import org.codingblocks.tree.binarytree.CreateTreeUsingLevelOrder;
import org.codingblocks.tree.binarytree.Node;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TreeTopView {
    public static void main(String[] args) {
        CreateTreeUsingLevelOrder createTreeUsingLevelOrder = new CreateTreeUsingLevelOrder();
        Node tree = createTreeUsingLevelOrder.createTree();
        createTreeUsingLevelOrder.display(tree);

        TreeTopView treeTopView = new TreeTopView();
        treeTopView.treeTopView(tree);

    }

    class Pair {
        Node node;
        int dist;

        Pair(Node val, int dist) {
            this.node = val;
            this.dist = dist;
        }
    }

    /**
     * Used Vertical line Concept for Tree Top View
     * @param root
     */
    public void treeTopView(Node root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        while (!q.isEmpty()) {
            Pair rv = q.poll();
            Node node = rv.node;
            int dist = rv.dist;
            if (!treeMap.containsKey(dist))
                treeMap.put(rv.dist, node.val);
            if (node.left.val != -1)
                q.add(new Pair(node.left, dist - 1));
            if (node.right.val != -1)
                q.add(new Pair(node.right, dist + 1));
        }

        for (Integer key : treeMap.keySet()){
            System.out.print(treeMap.get(key)+" ");
        }
    }

}
