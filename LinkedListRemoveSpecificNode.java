package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListRemoveSpecificNode {
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
		while (null != temp.next) {
			temp = temp.next;
		}

		temp.next = node;
	}

	public void printList() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "  -- > ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void removeSpecificNode(int value) {
		ListNode current = head;
		ListNode temp = null;
		while(current != null && current.data < value) {
			temp = current;
			current = current.next;
		}
		if(current == null ) return;
		temp.next = current.next;
	}

	public static void main(String args[]) {
		LinkedListRemoveSpecificNode list = new LinkedListRemoveSpecificNode();
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		list.insertLast(50);
		System.out.println("Given list..... : ");
		list.printList();
		System.out.println("Remove specific list .... : ");
		list.removeSpecificNode(50);
		list.printList();
	}
}
