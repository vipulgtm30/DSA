package arrays;

import java.util.Scanner;

public class LargestRowOrColumn {

	public static void main(String[] args) {
		int Arr[][] = takeInput();

		// quick check for empty input
		// if(Arr == null || Arr.length == 0 || Arr[0].length == 0) {
		// System.out.println("No rows or columns provided. Nothing to compute.");
		// return;
		// }

		print(Arr);

		int largestColSum[] = largestColumn(Arr);
		int largestRowSum[] = largestRow(Arr);
		
		
		if(largestColSum[0] == 0 && largestRowSum[0] == 0) {
			System.out.println("row " + largestRowSum[1] + " " +Integer.MIN_VALUE);
		}else if (largestColSum[0] > largestRowSum[0]) {
			System.out.print("column " + largestColSum[1] + " " + largestColSum[0]);
		} else {
			System.out.print("row " + largestRowSum[1] + " " + largestRowSum[0]);
		}
	}

	public static int[][] takeInput() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();

		System.out.print("Enter the number of columns: ");
		int col = sc.nextInt();

		int Arr[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter the input for Arr[" + i + "][" + j + "]: ");
				Arr[i][j] = sc.nextInt();
			}
		}

		sc.close();
		return Arr;
	}

	public static void print(int[][] Arr) {
		for (int[] i : Arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static int[] largestColumn(int[][] Arr) {
		// handle empty matrix: no columns or rows 
		
		int largestColArr[] = new int[2];
		
		if (Arr == null || Arr.length == 0 || Arr[0].length == 0) {
			largestColArr[0] = 0;
			largestColArr[1] = 0;
			return largestColArr;
		}

		int largestColIdx = -1;

		int largestColSum = Integer.MIN_VALUE;

		for (int col = 0; col < Arr[0].length; col++) {
			int sum = 0;
			for (int row = 0; row < Arr.length; row++) {
				sum += Arr[row][col];
			}
			if (largestColSum < sum) {
				largestColSum = sum;
				largestColIdx = col;
			}
		}

		largestColArr[0] = largestColSum;
		largestColArr[1] = largestColIdx;

		return largestColArr;
	}

	public static int[] largestRow(int[][] Arr) {
		// handle empty matrix case
		int largestRowArr[] = new int[2];
		
		if (Arr == null || Arr.length == 0 || Arr[0].length == 0) {
			largestRowArr[0] = 0;
			largestRowArr[1] = 0;
			return largestRowArr;
		}

		int largestRowIdx = -1;

		int largestRowSum = Integer.MIN_VALUE;

		for (int row = 0; row < Arr.length; row++) {
			int sum = 0;
			for (int col = 0; col < Arr[0].length; col++) {
				sum += Arr[row][col];
			}
			if (largestRowSum < sum) {
				largestRowSum = sum;
				largestRowIdx = row;
			}
		}

		largestRowArr[0] = largestRowSum;
		largestRowArr[1] = largestRowIdx;

		return largestRowArr;
	}

}
