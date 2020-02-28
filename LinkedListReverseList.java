package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListReverseList {

	ListNode head;

	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertLast(int value) {
		ListNode node = new ListNode(value);
		if (head == null) {
			head = node;
			return;
		}
		ListNode temp = head;
		while (null != temp.next)
			temp = temp.next;
		temp.next = node;
	}
	
	public ListNode reverseList() {
		ListNode current = head;
		ListNode prev = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;				
	}
	
	public void printList() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String args[]) {
		LinkedListReverseList list = new LinkedListReverseList();
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		list.insertLast(50);
		System.out.println("Given List .... : ");
		list.printList();
		System.out.println("Reverse List .... : ");
		ListNode newNode = list.reverseList();
		list.head = newNode;
		list.printList();

	}
}
