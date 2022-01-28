package com.gog.linkedlist;

public class NthNodeFromEdndOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
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
		
		
	   
		System.out.println("\n getNthFromLast :"+getNthFromLast(head,0));
		
	}
	static int getNthFromLast(Node head, int n)
    {
    	// Your code here
		if(n==0)return -1;
    	int len=0;
    	Node tail =head;
    	while(tail!=null){
    	    tail = tail.next;
    	    len++;
    	}
    	if((len-n)<0)
    	    return -1;
    	tail = head;
    	int i=(len-n);
    	while(i>0){
    	    tail=tail.next;
    	    i--;
    	}
    	
    	return tail.data;    
   }

}
