package linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LinkedListUse {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//	public static Node<Integer> takeInput() throws IOException {
//		Node<Integer> head = null, tail = null;
//
//		String[] datas = br.readLine().trim().split("\\s");
//
//		int i = 0;
//		while (i < datas.length && !datas[i].equals("-1")) {
//			int data = Integer.parseInt(datas[i]);
//			Node<Integer> newNode = new Node<>(data);
//			if (head == null) {
//				head = newNode;
//				tail = newNode;
//			} else {
//				tail.next = newNode;
//				tail = newNode;
//			}
//			i += 1;
//		}
//
//		return head;
//	}

	public static Node<Integer> createLinkedList() {
		Node<Integer> n1 = new Node<Integer>(3);
		Node<Integer> n2 = new Node<Integer>(4);
		Node<Integer> n3 = new Node<Integer>(5);
		Node<Integer> n4 = new Node<Integer>(2);
//		Node<Integer> n4 = new Node<Integer>(6);
//		Node<Integer> n4 = new Node<Integer>(1);
//		Node<Integer> n4 = new Node<Integer>(9);
//		Node<Integer> n4 = new Node<Integer>(-1);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

//		System.out.println("n1 " +n1+ " data " +n1.data+ " next node " +n1.next);
//		System.out.println("n2 " +n2+ " data " +n2.data+ " next node " +n2.next);
//		System.out.println("n3 " +n3+ " data " +n3.data+ " next node " +n3.next);
//		System.out.println("n4 " +n4+ " data " +n4.data+ " next node " +n4.next);

		return n1;
	}

	public static void printLinkedList(Node<Integer> head) {
		Node<Integer> temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	public static void increement(Node<Integer> head, int incr) {
		Node<Integer> temp = head;

		while (temp != null) {
			temp.data = temp.data + incr;
			temp = temp.next;
		}
	}
	
	public static int length(Node<Integer> head) {
		int size = 0;
		
		if(head == null || head.data == -1) {
			return size;
		}
		
		Node temp = head;
		
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		
		return size;
	}
	
	public static Node<Integer> takeInput(){
		
		Scanner sc = new Scanner(System.in);
		
		int data = sc.nextInt();
		
		Node<Integer> head = null, tail = null;
		
		while(data != -1) {
			Node<Integer> currentNode = new Node<>(data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}else {
				tail.next = currentNode;
				tail = currentNode;
			}
			
			
			data = sc.nextInt();
		}
		
		return head;
	}
	
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.

		if(head == null) return head;

		if(head != null && pos == 0) return head.next;

		Node<Integer> temp = head;
		int idx = 0;
		int size = 0;

		while(temp != null){
			if(idx == pos -1){
				temp.next = temp.next.next;
				return head;
			}

			temp = temp.next;
			idx++;
			size++;
		}

		return head;
	}
	
	public static void removeDuplicates(Node<Integer> head) {
		if(head == null || head.next == null) return;

		Node<Integer> temp = head, duplicate = head.next;

		while(temp != null && temp.next != null){
			if(temp.data == temp.next.data){
				temp.next = temp.next.next;
			}else{
				temp = temp.next;
			}
		}
	}
	
	/* 
	 * 1. First check if head is not null or head.next is not null
	 * 2. If it is null then return true
	 * 3. If it is not null then do the operations
	 * 4.   
	 *
	 */ 
	
//	public static boolean isPalindrome(Node<Integer> head) {
//		
//		if(head)
//		
//		return false;
//	}
	
	public static void printRecursively()

	public static void main(String[] args) throws NumberFormatException, IOException {
//		int t = 1;
//		
//		while (t > 0) {
//            
//            System.out.println(length(head));
//            System.out.println();
//
//            t -= 1;
//        }

		Node<Integer> head = takeInput();//createLinkedList();
//		System.out.println("Main " + head);
//
//		increement(head, 3);
//		printLinkedList(head);
//		
//		deleteNode(head, 6);
//		
//		System.out.println();
		
		removeDuplicates(head);
		
		printLinkedList(head);

	}

}
