package com.gog.linkedlist;

public class RemoveLoopInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		Node head = null;
		int i=1;
		head = new Node(i);
		Node tail = head;
		Node loopNode= null;
		while(i<n) {
			tail.next = new Node(++i);
		    if(i==3)
		       loopNode = tail.next;
			tail = tail.next;
			
		}
		tail.next = loopNode;
		
		Node temp = head;
		System.out.println();
		i=1;
		while(i<=n+3) {
			System.out.print(temp.data+"->");
			temp = temp.next;
			i++;
		}
		
		removeLoop(head);
		
		temp = head;
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
    	Node slow = head;
    	Node fast = head;
    	
    	boolean isloop = false;
    	
    	while(slow!=null && fast !=null) {
    		slow = slow.next;
    		
    		if(fast.next!=null) 
    			fast  = fast.next.next;
    		if(fast==null)
    			break;
    		if(fast.next==null)
    			break;
    		
    		if(slow == fast)
    		{
    			isloop = true;
    			break;
    		}
    	}
    	/*
    	if(isloop) {
    		slow = head;
    		while(slow.next!=fast)
    			slow = slow.next;
            Node loopNode = slow;
            
            fast = loopNode;
            
            while(fast.next!=loopNode)
            	fast = fast.next;
            fast.next = null;
    	}*/
    	
    	if(isloop) {
    		if(slow==head) {
    			while(slow.next!=head) {
    				slow=slow.next;
    			}
    			slow.next = null;
    		}else {
    			fast =head;
    			while(slow.next!=fast.next) {
    				slow = slow.next;
    				fast= fast.next;
    			}
    			Node start = fast.next;
    			fast = start;
    			while(fast.next!=start) {
    				fast=  fast.next;
    			}
    			fast.next = null;
    		}
    		
    	}
    	
    }

}
