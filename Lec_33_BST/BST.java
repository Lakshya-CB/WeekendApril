package Lec_33_BST;

public class BST {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void Disp() {
		Disp(root);
	}

	private void Disp(Node nn) {
		if (nn == null) {
			return;
		}
		String ans = "";
		if (nn.left != null) {
			ans = ans + nn.left.data;
		}
		ans = ans + " => " + nn.data + " <= ";
		if (nn.right != null) {
			ans = ans + nn.right.data;
		}
		System.out.println(ans);
		Disp(nn.left);
		Disp(nn.right);
	}

	public boolean Find(Node nn, int ali) {
		if (nn.data == ali) {
			return true;
		}
		if (ali > nn.data) {
			return Find(nn.left, ali);
		} else {
			return Find(nn.left, ali);
		}
	}

	public int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);

		return Math.max(L, R) + 1;

	}

	public void add(int ali) {
		root = add(root, ali);
	}

	private Node add(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (nn.data >= ali) {
			nn.left = add(nn.left, ali);
		} else {
			nn.right = add(nn.right, ali);

		}
		return nn;

	}

	public Node Remove(Node nn, int ali) {
		if (nn == null) {
			return null;
		}
		if (nn.data > ali) {
			nn.left = Remove(nn.left, ali);
			return nn;
		} else if (nn.data < ali) {
			nn.right = Remove(nn.right, ali);
			return nn;
		} else {
//			nn delete!!
//			case 1: nn is a leaf Node
			if (nn.left == null && nn.right == null) {
				return null;
			}
//			case 2: 1 child!!
			if (nn.left == null && nn.right != null) {
				return nn.right;
			}
			if (nn.left != null && nn.right == null) {
				return nn.left;
			}
//			case 3!!!
			int Max = Max(nn.left);
			nn.data = Max;
			nn.left = Remove(nn.left, Max);
			return nn;
		}
	}

	public int Max() {
		return Max(root);
	}

	private int Max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		if (nn.right == null) {
			return nn.data;
		}
		int sp = Max(nn.right);

		return sp;
	}
}
