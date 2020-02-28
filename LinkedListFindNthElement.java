package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListFindNthElement {
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

	public void findNthNodeFromLastNode(int key) {
		if(head == null) {
			return;
		}
		ListNode refKey = head;
		ListNode mainKey = head;
		int count = 0;
		
		while(count < key) {
			refKey = refKey.next;
			count++;
		}
		
		while(refKey != null) {
			mainKey = mainKey.next;
			refKey = refKey.next;
		}
		System.out.println("\n"+key+"th Node from last .... : "+ mainKey.data);
	}

	public static void main(String args[]) {
		LinkedListFindNthElement list = new LinkedListFindNthElement();
		list.insertLast(5);
		list.insertLast(10);
		list.insertLast(15);
		list.insertLast(20);
		list.insertLast(25);
		list.insertLast(30);
		System.out.println("Given List....");
		list.printList();
		list.findNthNodeFromLastNode(2);

	}
}
