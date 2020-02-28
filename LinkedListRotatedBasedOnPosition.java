package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListRotatedBasedOnPosition {
	 ListNode head;
	 static class ListNode{
		 int data;
		 ListNode next;
		 ListNode(int data){
			 this.data = data;
			 this.next = null;					 
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
		 while(current!=null) {
			 System.out.print(current.data+" --> ");
			 current = current.next;
		 }
		 System.out.println("null");
	 }
	 public void rotateNode(int k) {
		 if( k== 0) {
			 return;
		 }
		 ListNode current = head;
		 int count = 1;
		 while(count < k && current !=null) {
			 current = current.next;
			 count++;
		 }
		 if(current == null) {
			 return;
		 }
		 ListNode kthNode = current;
		 while(current.next !=null) {
			 current = current.next;
		 }
		 current.next = head;
		 head = kthNode.next;
		 kthNode.next = null;
	 }
     public static void main(String args[]) {
    	 LinkedListRotatedBasedOnPosition list = new LinkedListRotatedBasedOnPosition();
    	 list.insertLast(1);
    	 list.insertLast(2);
    	 list.insertLast(3);
    	 list.insertLast(4);
    	 list.insertLast(5);
    	 System.out.println("Given List of Nodes...... :");
    	 list.printList();
    	 int k = 2;
     	 System.out.println("Rotate Node Based on Postion ("+k+")"+"...... :");  
    	 list.rotateNode(k);
    	 list.printList();
     }
}
