package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListSearchKey {
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
		while (null != temp.next)
			temp = temp.next;
		temp.next = node;
	}
	
	public void printList() {
		ListNode current = head;
		while(current !=null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public boolean searchKey(int key) {
		if(head == null) {
			return false;
		}
		
		ListNode temp = head;
		while( temp != null) {
			if(temp.data == key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public static void main(String args[]) {
		LinkedListSearchKey list = new LinkedListSearchKey();
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		list.insertLast(50);
		System.out.println("Given List.....");
		list.printList();
		int key = 25;
		System.out.println("Search following key is is available or not ...."+ key);
		boolean searchKey = list.searchKey(key);
		System.out.println("This "+ key + " is available if it is true else it is not available... :  " + searchKey);
	}
}
