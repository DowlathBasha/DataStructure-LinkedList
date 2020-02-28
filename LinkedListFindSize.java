package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListFindSize {
	
	ListNode head;
	
	static class ListNode{
		int data;
		ListNode next;
		
		ListNode(int d){
			this.data = d;
			this.next= null;
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
			System.out.print(current.data +" -- >");
			current = current.next;
		}
		System.out.println("null\n");
	}
	
	public int sizeOfList() {
		ListNode current = head;
		int count = 0;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
    public static void main(String args[]) {
    	LinkedListFindSize list = new LinkedListFindSize();
    	list.insertLast(10);
    	list.insertLast(20);
    	list.insertLast(30);
    	list.insertLast(40);
    	list.insertLast(50);
    	
    	System.out.println("List of nodes....");
    	list.printList();
    	
    	int size = list.sizeOfList();
    	System.out.println("Size of nodes.... : " + size);
    }
}
