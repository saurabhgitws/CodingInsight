package com.gog.linkedlist;

public class ReverseLinkedList {

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
		
		head =reverseList(head);
	    temp = head;
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
		
		
	}

	static Node  reverseList(Node head) {
		Node prev = null;
		Node current=head;
		while(current!=null) {
			Node temp = current.next;
			if(temp== null) head = current;
			current.next = prev;
			prev = current;
			current = temp;
		}
		return head;
	}

}
