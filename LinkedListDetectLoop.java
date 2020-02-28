package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListDetectLoop {
	ListNode head;
	static class ListNode{
		int data;
		ListNode next;
		ListNode(int data){
			this.data = data;
			this.next = null;					
		}
	}
	
	public void createLoopNode() {
		ListNode first = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);
		ListNode sixth = new ListNode(60);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}
	
	public boolean isContainsLoop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if( slowPtr == fastPtr) {
			   return true;
			}
		}
		return false;
	}
	
    public static void main(String args[]) {
    	LinkedListDetectLoop list = new LinkedListDetectLoop();
    	list.createLoopNode();
    	boolean isItContainsLoop = list.isContainsLoop();
    	System.out.println("Is it looped ..... :" + isItContainsLoop ) ;
    }
}
