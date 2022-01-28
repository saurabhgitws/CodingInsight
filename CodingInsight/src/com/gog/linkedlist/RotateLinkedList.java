package com.gog.linkedlist;

public class RotateLinkedList {

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
		
		head =rotate(head,3);
	    temp = head;
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	
	/*
	    Input:
		N = 5
		value[] = {2, 4, 7, 8, 9}
		k = 3
		Output: 8 9 2 4 7
		
	*/
	public static Node rotate(Node head, int k) {
        // add code here
		

		Node temp = head;
		Node start = head;
		int n=1;
		while(n<=k) {
			start= start.next;
			n++;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next = head;
		head = start.next;
		start.next = null;
 		return head;
    }

}
