package Programs;

public class LinkedListReversal {

	public Node reverse(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node temp = reverseLinkedList(head);
		return temp;
	}

	private Node reverseLinkedList(Node head) {
		Node current = head;
		Node prev = null;
		while (current != null) {
			Node temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		head = prev;
		return head;
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		Node head = new LinkedListReversal().reverse(node1);
		while (head != null) {
			System.out.println(head.info);
			head = head.next;
		}

	}

}
