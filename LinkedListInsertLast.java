package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListInsertLast {
	
	ListNode head;
	
	static class ListNode{
		ListNode next;
		int data;
		ListNode(int data){
			this.data = data;
		}
	}
	
	public void insertLast(int value) {
		ListNode node = new ListNode(value);
		if(head == null) {
			head = node;
			return;
		}
		ListNode temp = head;
		while(null != temp.next) 
			temp = temp.next;
		    temp.next = node;		
	}
	
	public void printList() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
    
	public static void main(String argsa[]) {
		LinkedListInsertLast list = new LinkedListInsertLast();
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		list.insertLast(50);
		list.printList();
		
	}
}
