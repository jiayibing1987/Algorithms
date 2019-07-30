package trees;


/**
 * A class with 3 kinds of traversal of a tree.
 * 
 * @author Ryan
 */

public class TreeTraversal {
    public static void main(String[] args) {
        Node tree = new Node(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(7);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        // Prints 5 3 2 4 7 6 8
        System.out.println("Pre order traversal:");
        tree.printPreOrder();
        System.out.println();
        // Prints 2 3 4 5 6 7 8
        System.out.println("In order traversal:");
        tree.printInOrder();
        System.out.println();
        // Prints 2 4 3 6 8 7 5
        System.out.println("Post order traversal:");
        tree.printPostOrder();
        System.out.println();
    }
}

/**
 * The Node class which initializes a Node of a tree
 * Consists of all 3 traversal methods: InOrder, PostOrder£¬ PreOrder
 * printInOrder: LEFT -> ROOT -> RIGHT
 * printPreOrder: ROOT -> LEFT -> RIGHT
 * printPostOrder: LEFT -> RIGHT -> ROOT
 */
class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value < data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.print(data + " ");
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {
        System.out.print(data + " ");
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    public void printPostOrder() {
        if (left != null) {
            left.printPostOrder();
        }
        if (right != null) {
            right.printPostOrder();
        }
        System.out.print(data + " ");
    }
}