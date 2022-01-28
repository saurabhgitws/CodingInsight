package com.gog.linkedlist;

import java.util.Random;

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int n=5;
		Node head1 = null;
		int i=1;
		head1 = new Node(i+10);
		Node tail = head1;
		while(i<n) {
			tail.next = new Node(i+30);
			tail = tail.next;
			i++;
		}
		
		Node temp = head1;
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
		
		n=7;
		Node head2 = null;
		i=1;
		head2 = new Node(i+20);
		tail = head2;
		while(i<n) {
			tail.next = new Node(i+50);
			tail = tail.next;
			i++;
		}
		
		temp = head2;
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
		Node head = sortedMerge(head1,head2);
		temp = head;
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}

	
	static Node sortedMerge(Node head1, Node head2) {
		// This is a "method-only" submission. 
	     // You only need to complete this method
	     Node head=null;
	     Node tail=null;
	     while(head1!=null && head2!=null){
	         if(head1.data<head2.data){
	             if(head==null){
	                 head = new Node(head1.data);
	                 tail= head;
	             }else{
	                 tail.next = new Node(head1.data);
	                  tail=tail.next;
	             }
	             head1=head1.next;
	             
	         }else{
	             if(head==null){
	                 head = new Node(head2.data);
	                 tail= head;
	             }else{
	                 tail.next = new Node(head2.data);
	                 tail=tail.next;
	             }
	             head2=head2.next;
	         }
	         
	     }
	     
	     while(head1!=null){
	         tail.next = new Node(head1.data);
	          tail=tail.next;
	          head1=head1.next;
	     }
	     
	     while(head2!=null){
	         tail.next = new Node(head2.data);
	          tail=tail.next;
	          head2=head2.next;
	     }
	     return head;
	  }
}
