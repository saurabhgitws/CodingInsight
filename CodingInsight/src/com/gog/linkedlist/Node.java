package com.gog.linkedlist;

public class Node {
   int data;
   Node next;
   
   Node(int x){
	   data = x;
	   next = null;
   }
}

class LinkedList{
	public LinkedList(Node head,int n) {
		int i=1;
		head = new Node(i++);
		Node tail = head;
		while(i<n-1) {
			tail.next = new Node(i);
			tail = tail.next;
			i++;
		}
	}
	
	public void printList(Node head) {
		Node temp = head;
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
}



