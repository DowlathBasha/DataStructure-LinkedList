package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListInsertFirst {

	ListNode head;

	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
		}
	}

	/*
	 * insert first
	 */
	public void insertFirst(int value) {
		ListNode node = new ListNode(value);
		node.next = head;
		head = node;
	}
	
	public void printList() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.print("null");		
	}

	public static void main(String args[]) {
       
		LinkedListInsertFirst list = new LinkedListInsertFirst();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
		list.insertFirst(50);
		
		list.printList();
		
	}
}
