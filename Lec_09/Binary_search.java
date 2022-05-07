package Lec_09;

public class Binary_search {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

		int s = 0;
		int e = arr.length - 1;
		int ali = 41;
		while (s <= e) {
			int mid = (s + e) / 2;
			System.out.println(s + "," + e + "=>" + arr[mid] + "||" + ali);
			if (arr[mid] == ali) {
				System.out.println(mid);
				return;
			} else if (arr[mid] < ali) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}

		}
	}
}
