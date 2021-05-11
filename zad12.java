package theme12;

import java.util.HashSet;

public class zad12 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 8 };
		int sum = 6;
		System.out.println(pairs2(arr, sum));
	}

	static boolean pairs1(int[] list, int sum) {
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] + list[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}

	static boolean pairs2(int[] list, int sum) {
		for (int i = 0; i < list.length; i++) {
			int a = binarySearch(list, sum - list[i]);
			if (a > -1 && a != i) {
				return true;
			}
		}
		return false;
	}

	static boolean pairs3(int[] list, int sum) {
		int min = 0;
		int max = list.length - 1;
		while (min < max) {
			if (list[min] + list[max] == sum) {
				return true;
			} else if (list[min] + list[max] > sum) {
				max--;
			} else {
				min++;
			}
		}

		return false;
	}

	static boolean pairs4(int[] list, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < list.length; i++) {
			if (set.contains(list[i])) {
				return true;
			}
			set.add(sum - list[i]);
		}
		return false;
	}

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1;
	}

}
