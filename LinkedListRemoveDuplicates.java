package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListRemoveDuplicates {
	ListNode head;

	static class ListNode {
		int data;
		ListNode next;

		ListNode(int d) {
			this.data = d;
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
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public void removeDuplicates() {
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}

	public static void main(String args[]) {
		LinkedListRemoveDuplicates list = new LinkedListRemoveDuplicates();
		list.insertLast(5);
		list.insertLast(10);
		list.insertLast(10);
		list.insertLast(15);
		list.insertLast(20);
		list.insertLast(20);
		System.out.println("Given List....: ");
		list.printList();
		System.out.println("After removing duplicates .... : ");
		list.removeDuplicates();
		list.printList();

	}
}
