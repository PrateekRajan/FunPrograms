package Programs;

public class InsertLinkedList {

	public static Node insert(Node head, Node insert) {
		if (head == null && insert != null) {
			head = insert;
			return head;
		}
		if (head == null) {
			return head;
		}
		Node traverse = head;
		while (traverse.info < insert.info && traverse.next != null) {
			traverse = traverse.next;
		}
		insert.next = traverse.next;
		traverse.next = insert;
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

		Node temp = new Node(4);

		Node head = insert(node1, temp);
		while (head != null) {
			System.out.println(head.info);
			head = head.next;
		}
	}
}
