package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListAddTwoLinkedList {
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

	public static ListNode addTwoNode(ListNode firstNode,ListNode secondNode) {
    	 ListNode result = null;
    	 ListNode first = null;
    	 int carry = 0;
    	 
    	 while(firstNode !=null || secondNode !=null) {
    		 int sum = 0;
    		 if(firstNode !=null) {
    			 sum+=firstNode.data;
    			 firstNode = firstNode.next;
    		 }
    		 if(secondNode !=null) {
    			 sum+=secondNode.data;
    			 secondNode = secondNode.next;
    		 }
    		 
    		 sum = sum+carry;
    		 int value = sum % 10;
    		 carry = sum / 10;
    		 
    		 ListNode node = new ListNode(value);
    		 if( result != null) {
    			 result.next = node ;
    			 result = result.next;
    		 }
    		 else {
    			 result = first = node;
    		 }
    	 }
    	 if ( carry > 0) {
    		 result.next = new ListNode(carry);
    	 }
    	 return first;
     }

	public static void main(String args[]) {
		LinkedListAddTwoLinkedList firstNode = new LinkedListAddTwoLinkedList();
		firstNode.insertLast(1);
		firstNode.insertLast(2);
		firstNode.insertLast(3);
		System.out.println("First Node ....... !!!");
		firstNode.printList();

		LinkedListAddTwoLinkedList secondNode = new LinkedListAddTwoLinkedList();
		secondNode.insertLast(3);
		secondNode.insertLast(2);
		secondNode.insertLast(1);
		System.out.println("Second Node ....... !!!");
		secondNode.printList();

		ListNode newNode = addTwoNode(firstNode.head, secondNode.head);
		System.out.println("\nResult Node After ADDING TWO Nodes  ....... !!!");
        while(newNode != null) {
        	System.out.print(newNode.data+" --> ");
        	newNode = newNode.next;
        }
        System.out.println("null");
	}
}
