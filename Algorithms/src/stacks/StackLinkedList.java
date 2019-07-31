package stacks;

/**
 * This is an ArrayList Implementation of a stack.
 *
 * @author Ryan
 */
public class StackLinkedList {

	// A node class
	class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;

	public void push(int x) {
		Node n = new Node(x);
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			n.next = temp;
			head = n;
		}
	}

	public void pop() {
		if (head == null) {
			System.out.println("Empty stack. Nothing to pop");
		}

		Node temp = head;
		head = head.next;
		System.out.println("Popped element is: " + temp.data);
	}

	public int peek() {
		if (head == null) {
			return -1;
		}
		return head.data;
	}

	public void printStack() {
		Node temp = head;
		System.out.println("Stack is printed as below: ");
		while (temp != null) {
			if (temp.next == null) {
				System.out.print(temp.data);
			} else {
				System.out.print(temp.data + " -> ");
			}
			temp = temp.next;
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		if (head == null)
			return 0;
		else {
			int size = 1;
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
				size++;
			}
			return size;
		}
	}

	public static void main(String[] args) {
		StackLinkedList stack = new StackLinkedList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.printStack();
		System.out.println("Size of stack currently is: " + stack.getSize());

		stack.pop();
		stack.pop();
		System.out.println("Top element of stack currently is: " + stack.peek());
	}
}