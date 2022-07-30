package Lec_30;

public class LinkedList {
	class Node {
		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public void Disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println();
	}

	public int Size() {
		Node temp = head;
		int s = 0;
		while (temp != null) {
			temp = temp.next;
			s++;
		}
		return s;
	}

	public boolean isEmpty() {
		return Size() == 0;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getAtNode(int idx) {
		if(idx<0||idx>Size()) {
			throw new RuntimeException("kaha jaa rhe ho?");
		}
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	private Node getLastNode() {
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}

	public void AddLast(int ali) {
		Node nn = new Node(ali);
		if (isEmpty()) {
			head = nn;
			return;
		}
		Node last = getLastNode();
		last.next = nn;
	}

	public void AddFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void AddAt(int idx, int ali) {
		if(idx<0||idx>Size()) {
			throw new RuntimeException("kaha jaa rhe ho?");
		}
		if (idx == 0) {
			AddFirst(ali);
		} else {
			Node before = getAtNode(idx - 1);
			Node after = before.next;
			Node nn = new Node(ali);

			nn.next = after;
			before.next = nn;
		}
	}
}
