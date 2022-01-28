package com.gog.linkedlist;

public class ReverseLinkedListInGroupSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
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
	
	public static Node rotate(Node node, int k)
    {
        //Your code here
		
		
		
		
		return null;
    }

}
