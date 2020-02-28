package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListFindMiddleElement {
	ListNode head;

	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
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

	public void middleNode() {
		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}

	public static void main(String args[]) {
		LinkedListFindMiddleElement list = new LinkedListFindMiddleElement();
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		//list.insertLast(50);

		System.out.println("Given List....\n");
		list.printList();
		
		System.out.println("\nMiddle Element from the list....");
		list.middleNode();		
	}
}
