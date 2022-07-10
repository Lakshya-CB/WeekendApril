package Lec_25;

public class Merge_sort {
	public static void main(String[] args) {
		int[] arr1 = { 10, 30, 50, 80, 100 };
		int[] arr2 = { 15, 20, 25, 40, 90 };
		

	}
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length+arr2.length];
		
		int idx1 =0;
		int idx2 =0;
		
		int i =0;
		while(idx1<arr1.length && idx2<arr2.length) {
			if(arr1[idx1]<arr2[idx2]) {
				ans[i] = arr1[idx1];
				idx1++;i++;
			}else {
				ans[i] = arr2[idx2];
				idx2++;i++;
			}
		}
		while(idx1<arr1.length) {
			ans[i] = arr1[idx1];
			idx1++;i++;
		}
		while(idx2<arr2.length) {
			ans[i] = arr2[idx2];
			idx2++;i++;
		}
		return ans;
	}
}
