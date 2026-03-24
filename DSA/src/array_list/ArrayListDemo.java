package array_list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1, 40);
		
		System.out.println(arr.size());
		System.out.println(arr.get(1));
		
		for(int x: arr) {
			System.out.println(x);
		}

	}

}
