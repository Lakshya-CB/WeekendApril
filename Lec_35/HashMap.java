package Lec_35;

import java.util.ArrayList;

public class HashMap {
	class Node {
		public Node(String key2, Integer val2) {
			// TODO Auto-generated constructor stub
			key = key2;
			val = val2;

		}

		String key;
		Integer val;
		Node next;
	}

	ArrayList<Node> buckets;
	int size = 0;

	public HashMap() {
		size = 0;
		buckets = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			buckets.add(null);
		}
	}

	public int hash(String key) {
		return key.hashCode() % buckets.size();
	}

	public Integer get(String key) {
		int bucket_num = hash(key);
		Node temp = buckets.get(bucket_num);
		while (temp != null) {
//			if(temp.key==key) {
			if (temp.key.equals(key)) {
				return temp.val;
			}
			temp = temp.next;
		}
		return null;
	}

	public boolean containsKey(String key) {
		int bucket_num = hash(key);
		Node temp = buckets.get(bucket_num);
		while (temp != null) {
//			if(temp.key==key) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void put(String key, Integer val) {
		int bucket_num = hash(key);
		Node temp = buckets.get(bucket_num);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.val = val;
				return;
			}
			temp = temp.next;
		}
		Node head = buckets.get(bucket_num);
		Node nn = new Node(key, val);
		nn.next = head;
		buckets.set(bucket_num, nn);
		size++;

		double LF = (size * 1.0) / buckets.size();
		if(LF>2) {
			rehash();
		}
	}

	private void rehash() {
		// TODO Auto-generated method stub
		ArrayList<Node>  biggy = new ArrayList<Node>();
		for(int i=0;i<2*buckets.size();i++) {
			biggy.add(null);
		}
		ArrayList<Node> old = buckets;
		buckets = biggy;
		for(Node head : old) {
			Node temp = head;
			while(temp!=null) {
				put(temp.key, temp.val);
				temp = temp.next;
			}
		}
	}
	public void remove(String key) {
		int bucket_num = hash(key);
		Node temp = buckets.get(bucket_num);
		if(temp.key.equals(key)) {
			buckets.set(bucket_num,temp.next);
			return;
		}
		Node prev = temp;
		Node curr = temp.next;
		while (curr != null) {
			if (curr.key.equals(key)) {
				prev.next = prev.next.next;
				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}
}
