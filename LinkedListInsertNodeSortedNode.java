package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListInsertNodeSortedNode {
	ListNode head;
	static class ListNode{
		int data;
		ListNode next;
		ListNode(int data){
			this.data = data;
		}
	}
	
	public void insertLast(int value) {
		ListNode node = new ListNode(value);
		if(head == null) {
			head = node;
			return;
		}
		ListNode temp = head;
		while(null != temp.next) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void printList() {
		ListNode current = head;
		while(current !=null) {
			System.out.print(current.data +" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void insertSortedOrder(int value) {
		ListNode newNode = new ListNode(value);
		ListNode current = head;
		ListNode temp = null;
		
		while( current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}	
		
		newNode.next = current;
		temp.next = newNode;
	}
  public static void main(String args[]) {
	  LinkedListInsertNodeSortedNode list = new LinkedListInsertNodeSortedNode();
	  
	  list.insertLast(5);
	  list.insertLast(7);
	  list.insertLast(9);
	  System.out.println("Given List....");
	  list.printList();
	  list.insertSortedOrder(6);
	  System.out.println("Sorted insertList....");
	  list.printList();
	  
	  
  }
}
