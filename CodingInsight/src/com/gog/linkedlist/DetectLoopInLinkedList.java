package com.gog.linkedlist;

public class DetectLoopInLinkedList {

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
		    //if(i==3)
		    	//loopNode = tail.next;
			tail = tail.next;
			
		}
		//tail.next = loopNode;
		
		/*Node temp = head;
		System.out.println();
		i=1;
		while(i<=n+3) {
			System.out.print(temp.data+"->");
			temp = temp.next;
			i++;
		}*/
		System.out.println("isLoopDetected "+detectLoop(head));
		
	}
	
	public static boolean detectLoop(Node head){
		
        // Add code here
		
		Node slow = head;
		Node fast = head;
		boolean isloop= false;
		while(slow!=null && fast!=null) {
			slow = slow.next;
			if(fast.next!=null)
			   fast = fast.next.next;
			if(fast.next ==null)
				break;
			if(slow==fast) {
				isloop = true;
				break;
			}
		}
      return isloop;
	}

}
