package trees;

import java.util.Queue;
import java.util.LinkedList;

/**
 * Breadth First Search based traversal
 * @author Ryan
 *
 */
public class LevelOrderTraversalQueue {

    /* Class to represent Tree node */
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }

    Node root;

    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
    void printLevelOrder() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
 
            /* poll() removes the present head.
            For more information on poll() visit 
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
}