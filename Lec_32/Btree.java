package Lec_32;

import java.util.LinkedList;
import java.util.Queue;

public class Btree {
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

	private Node CreateInPre(int[] In, int is, int ie, int[] Pre, int ps, int pe) {
		if (is > ie || ps > pe) {
			return null;
		}
		Node nn = new Node(Pre[ps]);
		int found = is;
		int L_size = 0;
		for (int i = is; i <= ie; i++) {
			if (In[i] == Pre[ps]) {
				found = i;
				break;
			}
			L_size++;
		}
		nn.left = CreateInPre(In, is, found - 1, Pre, ps + 1, ps + L_size);
		nn.right = CreateInPre(In, found + 1, ie, Pre, ps + 1 + L_size, pe);
		return nn;
	}

	public Btree(int[] In, int[] Pre) {
		// TODO Auto-generated constructor stub
		root = CreateInPre(In, 0, In.length - 1, Pre, 0, Pre.length - 1);
	}

	public boolean Find(Node nn, int ali) {
		if (nn.data == ali) {
			return true;
		}
		boolean L = Find(nn.left, ali);
		boolean R = Find(nn.left, ali);
		return L || R;
	}

	public int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);

		return Math.max(L, R) + 1;

	}

	public int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);
		int self = Ht(nn.left) + Ht(nn.right) + 2;
		return Math.max(self, Math.max(R, L));

	}

	public HtDiaPair Dia2(Node nn) {
		if (nn == null) {
			return new HtDiaPair();
		}
		HtDiaPair ans = new HtDiaPair();
		HtDiaPair L = Dia2(nn.left);
		HtDiaPair R = Dia2(nn.right);

//		Dia of nn!!
		int self = L.Ht + R.Ht + 2;
		ans.Dia = Math.max(self, Math.max(R.Dia, L.Dia));
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		return ans;
	}

	public boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBal(nn.left);
		boolean R = isBal(nn.right);
		if (L && R) {
			int mod = Ht(nn.left) - Ht(nn.right);
			return Math.abs(mod) <= 1;
		}
		return false;
	}

	public void Lvl() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node curr = Q.poll();
			System.out.println(curr.data);
			if (curr.left != null) {
				Q.add(curr.left);
			}
			
			if (curr.right != null) {
				Q.add(curr.right);
			}
		}
	}

	class HtDiaPair {
		int Ht = -1;
		int Dia = 0;
	}
}
