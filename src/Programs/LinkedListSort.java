package Programs;

public class LinkedListSort {

	public Node sort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node temp = sortLinkedList(head);
		return temp;
	}

	private Node sortLinkedList(Node head) {
		Node current = head;
		while (current != null) {
			Node next = current.next;
			while (next != null) {
				if (current.info > next.info) {
					int temp = current.info;
					current.info = next.info;
					next.info = temp;
				}
				next = next.next;
			}
			current = current.next;
		}
		return head;
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(4);
		Node node3 = new Node(3);
		Node node4 = new Node(2);
		Node node5 = new Node(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		Node head = new LinkedListSort().sort(node1);
		while (head != null) {
			System.out.println(head.info);
			head = head.next;
		}

	}

}
