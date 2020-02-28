package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListSwapPairs {
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
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void swapPairs() {
		ListNode temp = head;
		while(temp != null && temp.next !=null) {
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
	}

	public static void main(String args[]) {
		LinkedListSwapPairs list = new LinkedListSwapPairs();
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(5);
		list.insertLast(6);
		
		System.out.println("Given Node List ..... : ");
		list.printList();
		
		System.out.println("Swap Pairs List ..... : ");
		list.swapPairs();
		list.printList();
		
	}
}
