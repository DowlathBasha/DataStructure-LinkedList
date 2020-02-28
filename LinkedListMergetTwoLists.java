package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListMergetTwoLists {
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

	public static ListNode merget(ListNode first, ListNode second) {
		ListNode merge = new ListNode(0);
		ListNode temp = merge;
		while (true) {
			if (first == null) {
				temp.next = second;
				break;
			} else if (second == null) {
				temp.next = first;
			}
			if (first.data <= second.data) {
				temp.next = first;
				first = first.next;
			} else {
				temp.next = second;
				second = second.next;
			}
			temp = temp.next;
		}
		return merge.next;
	}

	public static void main(String[] args) {
		LinkedListMergetTwoLists firstNode = new LinkedListMergetTwoLists();
		firstNode.insertLast(5);
		firstNode.insertLast(15);
		firstNode.insertLast(25);
		firstNode.insertLast(35);
		firstNode.insertLast(45);

		System.out.println("First Node List...... : ");
		firstNode.printList();
		System.out.println("\n");

		LinkedListMergetTwoLists secondNode = new LinkedListMergetTwoLists();
		secondNode.insertLast(10);
		secondNode.insertLast(20);
		secondNode.insertLast(30);
		secondNode.insertLast(40);
		secondNode.insertLast(50);

		System.out.println("Second Node List...... : ");
		secondNode.printList();
		System.out.println("\n");

		firstNode.head = new LinkedListMergetTwoLists().merget(firstNode.head, secondNode.head);
		firstNode.printList();

	}

}
