package linkedList;

public class LinkedList {

	Node head;

	// Linked list Node.

	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {
			data = d;
			next = null;
		}
	}

	// Method to insert a new node
	public static LinkedList insert(LinkedList list, int data) {
		System.out.println(data + " Is Added In Linked List");
		Node new_node = new Node(data);
		new_node.next = null;

		if (list.head == null) {
			list.head = new_node;
		} else {

			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = new_node;
		}

		return list;
	}

	// Method to print the LinkedList.
	public static void printList(LinkedList list) {
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		while (currNode != null) {

			System.out.print(currNode.data + " ");

			currNode = currNode.next;
		}

		System.out.println();
	}

	// Method to delete a node in the LinkedList
	public static LinkedList deleteAtPosition(LinkedList list, int index) {

		Node currNode = list.head, prev = null;

		if (index == 0 && currNode != null) {
			list.head = currNode.next;

			System.out.println(index + " position element deleted");

			return list;
		}

		int counter = 0;

		while (currNode != null) {

			if (counter == index) {
				prev.next = currNode.next;

				System.out.println(index + " position element deleted");
				break;
			} else {

				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}

		if (currNode == null) {

			System.out.println(index + " position element not found");
		}

		return list;
	}

	// method to create a Singly linked list with n nodes
	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list = insert(list, 10);
		list = insert(list, 42);
		list = insert(list, 32);
		list = insert(list, 74);
		list = insert(list, 15);
		list = insert(list, 6);
		list = insert(list, 70);
		list = insert(list, 84);

		printList(list);

		deleteAtPosition(list, 0);

		printList(list);

	}
}
