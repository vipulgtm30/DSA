package linkedListRecursively;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		//take the input from user
		Node<Integer> head = takeInput();
		
		//printLinkedList Recursively
		printLLRecursively(head);

	}

	public static Node<Integer> takeInput() {

		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		Node<Integer> head = null, tail = null;

		while (data != -1) {
			Node<Integer> currentNode = new Node<>(data);
			if (head == null) {
				head = currentNode;
				tail = currentNode;
			} else {
				tail.next = currentNode;
				tail = currentNode;
			}

			data = sc.nextInt();
		}

		return head;
	}

	private static void printLLRecursively(Node<Integer> head) {
		
		if(head == null) return;
		
		System.out.print(head.data+ " ");
		
		printLLRecursively(head.next);

	}
	
	private static Node<Integer> insertRecursively(Node<Integer> head, int data, int pos) {
		
		if(pos == 0) {
//			head.next
		}
		
		return head;
	}

}
