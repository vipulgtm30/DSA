package searchingandsorting;

import java.util.Scanner;

public class CountSmall {

	public static void main(String[] args) {

		// Take input of Array A
		int A[] = takeInput();

		// Take input of Array B
//		int B[] = takeInput();

//		countS(A.length, B.length, A, B);

		int ele = binarySearch(0, A.length, A, 2);

		System.out.println(ele);

	}

	public static int[] takeInput() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int x = sc.nextInt();

		int Arr[] = new int[x];

		for (int i = 0; i < x; i++) {
			Arr[i] = sc.nextInt();
		}

		sc.close();
		return Arr;
	}

	public static int[] countS(int n, int m, int[] a, int[] b) {
		// Write your code here.

		return new int[0];
	}

	public static int binarySearch(int left, int right, int[] b, int x) {

		if (left <= right) {
			return -1;
		}

		int mid = (left + right) / 2;

		if (b[mid] == x) {
			return mid;
		} else if (b[mid] > x) {
			return binarySearch(left, mid - 1, b, x);
		}
		return binarySearch(mid + 1, right, b, x);
	}
}
