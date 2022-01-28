package com.gog.linkedlist;

public class FindMiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Node head = null;
		int i=1;
		head = new Node(i);
		Node tail = head;
		while(i<n) {
			tail.next = new Node(++i);
			tail = tail.next;
			
		}
		
		Node temp = head;
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
		System.out.println("\n"+getMiddle(head));
	}
	
	static int getMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast !=null && fast.next!=null) {
			slow = slow.next;
			fast =fast.next.next;
		}
		return slow.data;
	}

}
